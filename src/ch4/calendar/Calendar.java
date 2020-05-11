package ch4.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Calendar {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();
        date = date.minusDays(today - 1);
        DayOfWeek dayOfWeek= date.getDayOfWeek();
        int weekDay = dayOfWeek.getValue();

        System.out.println(date.getMonth().toString());
        System.out.println("Пон Вів Сер  Чт Птн Суб  Нд");
        for (int i=1; i<weekDay; i++){
            System.out.printf("%4s", " ");
        }
        while (date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }
}
