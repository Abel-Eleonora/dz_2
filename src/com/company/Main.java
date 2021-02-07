package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        // сумма моего года, месяца и дня рождения
        int yearOfBirthday = 1994;
        int monthOfBirthday = 11;
        int dayOfBirthday = 24;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.print("Сумма моего года, месяца и дня рождения: " + sum);
        System.out.println("");


        // Месяц моего рождения больше или меньше даты рождения
        boolean monthBiggerDay;
        if (monthOfBirthday > dayOfBirthday) {
            monthBiggerDay = true;
        } else {
            monthBiggerDay = false;
        }
        System.out.print("Месяц моего рождения больше даты рождения: " + monthBiggerDay);
        System.out.println("");


        // Массив с моим именем
        char[] arr = new char[8];
        arr[0] = 'Э';
        arr[1] = 'л';
        arr[2] = 'е';
        arr[3] = 'о';
        arr[4] = 'н';
        arr[5] = 'о';
        arr[6] = 'р';
        arr[7] = 'а';
        System.out.println ("Массив с моим именем: " + arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5] + arr[6] + arr [7]);


        // Сколько мне лет
        double myAge = 26;
        double partYear = 1.0 / 12.0;
        DecimalFormat df = new DecimalFormat("##.##");
        myAge = myAge + partYear;
        System.out.println("Мне " + df.format (myAge) + " лет");



    }
}
