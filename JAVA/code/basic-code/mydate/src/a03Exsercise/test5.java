package a03Exsercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class test5 {
    public static void main(String[] args) throws ParseException {
        String str = "2000年3月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(str);
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DAY_OF_MONTH, -1);

        System.out.println(instance.get(Calendar.DAY_OF_MONTH));


        //JDK8
        LocalDate localDate = LocalDate.of(2000, 3, 1);
        LocalDate d = localDate.minusDays(1);
        System.out.println(d.getDayOfMonth());
    }
}
