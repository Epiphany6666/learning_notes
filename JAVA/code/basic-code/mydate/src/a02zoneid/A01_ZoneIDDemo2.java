package a02zoneid;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class A01_ZoneIDDemo2 {
    public static void main(String[] args) {
        Instant now = Instant.now();
//        System.out.println(now);

        Instant instant1 = Instant.ofEpochMilli(0L);
//        System.out.println(instant1);

        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
    }
}
