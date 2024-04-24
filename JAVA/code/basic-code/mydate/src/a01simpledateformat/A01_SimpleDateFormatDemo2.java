package a01simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A01_SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String xiaojia = "2023年11月11日 0:01:0";
        String xiaopi = "2023年11月11日 0:11:0";

        if (isParticipate(xiaojia)) {
            System.out.println("小贾参与了");
        } else {
            System.out.println("小贾没参与");
        }

        if (isParticipate(xiaopi)) {
            System.out.println("小皮参与了");
        } else {
            System.out.println("小皮没参与");
        }
    }

    private static boolean isParticipate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long time = sdf.parse(str).getTime();
        long start = sdf.parse("2023年11月11日 0:0:0").getTime();
        long end = sdf.parse("2023年11月11日 0:10:0").getTime();
        if (time >= start && time <= end) {
            return true;
        }
        return false;
    }
}
