package test;

import enume.EnumDays;
import java.util.Scanner;

public class testEnumDaysOfTheWeek {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String day;
        System.out.println("What day is today?");
        day = keyboard.nextLine();
        EnumDays daysWeek = EnumDays.valueOf(day.toLowerCase());
        
        System.out.println(daysWeek.toString());
    }
}
