package com.bite.j2se.demo.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class DateTest {
    /**
     * Date类
     */
    public static void date1() {
        Date date=new Date();
        System.out.println(date);

        Date date1=new Date(1000);
        System.out.println(date1);
    }

    /**
     * DateFormat 抽象类的使用
     * FULL:2021年11月24日 星期三
     * LONG：2021年11月24日
     * MEDIUM（默认情况，和不加参数结果不一致）：2021-11-24
     * SHORT：下午2：14
     */
    public static void date2() {
        Date date=new Date();

        //日期：年月日：2021-11-24
        DateFormat df1=DateFormat.getDateInstance(DateFormat.FULL);
        //format（）：Date-->String
        System.out.println(df1.format(date));

        //时间：时分秒：11：49：41
        DateFormat df2=DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println(df2.format(date));

        //日期+时间：年月日 时分秒：2021-11-24 11：49：41
        DateFormat df3=DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.LONG);
        System.out.println(df3.format(date));

        //parse():String-->Date,把字符串转换成时间
        Date date1=null;
        try{
            date1=df1.parse("2021-11-24");
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("时间错误处理");
        }

    }

    /**
     * SimpleDateFormat自定义时间风格
     * 一个字母表示一个数字
     * y表示年份
     * M表示月
     * d表示当前天数
     * h表示小时
     * m表示分钟
     * s表示秒
     * S表示毫秒
     */
    public static void date3() {
        Date date=new Date();
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日--hh时mm分ss秒");
        SimpleDateFormat sdf2=new SimpleDateFormat("yy年MM月dd日--hh时mm分ss秒");

        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));

    }
    /**
     * Calendar是抽象类，不能直接new对象
     * TimeZone表示时区
     */
    public static void date4() {
        Calendar calendar= Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
//        calendar.set(Calendar.YEAR,2021);
//        calendar.set(Calendar.MONTH,11);
//        calendar.set(Calendar.DATE,24);
        calendar.set(1999,6,3,12,34,59);
//        calendar.add(Calendar.YEAR,1);
//        System.out.println(calendar);
        Date date=calendar.getTime();
        System.out.println(date);
    }

    /**
     * LocalDate类
     */
    public static void date5() {
        //now直接获取当地时间
        LocalDate ld1 = LocalDate.now();
        //设置LocalDate时间
        LocalDate ld2= LocalDate.of(1999,12,12);
        System.out.println(ld1);
        System.out.println(ld2);

        //parse:String-->LocalDate
        LocalDate ld3=LocalDate.parse("2021-01-25");
        System.out.println(ld3);

    }


    //习题一
    public static void test1() {
        Calendar calendar=Calendar.getInstance();
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日--hh时mm分ss秒");
//        System.out.println(simpleDateFormat.format(date));

    }
    public static void main(String[] args) {
//        date1();
//        date2();
//        date3();
//        date4();
//        test1();
        date5();
    }

}
