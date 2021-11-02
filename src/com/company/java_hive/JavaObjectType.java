package com.company.java_hive;

import java.util.Calendar;
import java.util.Date;

public class JavaObjectType {
    public static void main(String[] args) {
        //기본타입의 배열은 참조타입
        int []m = {1,2,3};//배열
        int []n=new int[]{1,2,3};//배열

        //참조타입-객체타입
        String card = "H8"; //문자열
        Date d = new Date();    //오늘
        Calendar cal = Calendar.getInstance();  //오늘

        System.out.println(d.toString());
        System.out.println(cal.toString());
        System.out.println(card.toString());

    }
}
