import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //需求1:打印时间原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date d1 = new Date(0L);

        //2.获取d1时间的毫秒值
        long time = d1.getTime();

        //3.在这个基础上我们要加一年的毫秒值即可
        time = time + 1000L * 60 * 60 * 24 * 365;
        //4.把计算之后的时间毫秒值，再设置回d1当中
        d1.setTime(time);
        //5.打印d1
        System.out.println(d1);
    }
}