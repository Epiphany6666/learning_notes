package a01simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A01_CalendarDemo1 {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0L);
        c.setTime(d);
        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, 8);
        c.set(Calendar.DAY_OF_MONTH, 10);

        //调用方法在这个基础上减少一个月
        c.add(Calendar.MONTH, -1);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "," + month + "," + date + "," + getWeek(week));
    }

    public static String getWeek(int index) {
        //定义一个数组,让汉字星期几 跟1~7产生对应关系
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的星期
        return arr[index];
    }
}
