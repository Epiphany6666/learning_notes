package com.hmdp.utils;

import cn.hutool.core.lang.UUID;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class SimpleRedisLock implements ILock{
    private StringRedisTemplate stringRedisTemplate;
    private String name;

    private static final String KEY_PREFIX = "lock:";

    public SimpleRedisLock(String name, StringRedisTemplate stringRedisTemplate) {
        this.name = name;
        this.stringRedisTemplate = stringRedisTemplate;
    }

    // 这里使用hutool工具类中的UUID，因为它里面有toString方法，里面传入true，可以将UUID里面的横线去掉
    private static final String ID_PREFIX = UUID.randomUUID().toString(true) + "-";
    @Override
    public boolean tryLock(long timeoutSec) {
        // 获取线程标示
        String threadId = ID_PREFIX + Thread.currentThread().getId();
        // 获取锁
        Boolean success = stringRedisTemplate.opsForValue()
                .setIfAbsent(KEY_PREFIX + name, threadId, timeoutSec, TimeUnit.SECONDS);
        return Boolean.TRUE.equals(success);
    }

    private static final DefaultRedisScript<Long> UNLOCK_SCRIPT;
    // 在静态代码块中初始化
    static {
        // DefaultRedisScript构造函数中可以接收字符串类型的脚本，也就是将脚本当成字符串直接传进来，这样就相当于硬编码了，我们还是不建议这么做，我们还是放文件中，将来去修改比较方便。
        UNLOCK_SCRIPT = new DefaultRedisScript<>();
        // 这里调用它的set方法去指定脚本的位置
        // ctrl + p查看参数，可以看见它里面需要传入Resource，即资源，这里我们可以使用spring中提供的ClassPathResource，也就是ClassPath下的一些资源，它默认就回去ClassPath下找，而我们是放在resouces目录下的，resource就是ClassPath，因此我们可以直接指定文件名
        UNLOCK_SCRIPT.setLocation(new ClassPathResource("unlock.lua"));
        // 配置返回值类型
        UNLOCK_SCRIPT.setResultType(Long.class);
    }

    public void unlock() {
        // 调用lua脚本
        stringRedisTemplate.execute(
                UNLOCK_SCRIPT,
                Collections.singletonList(KEY_PREFIX + name), // 指定锁的key，存进去的是应该集合。singletonList：单元素集合的意思
                ID_PREFIX + Thread.currentThread().getId()); // 线程的标识
    }
// 经过以上代码改造后，我们就能够实现 拿锁比锁删锁的原子性动作了~
}