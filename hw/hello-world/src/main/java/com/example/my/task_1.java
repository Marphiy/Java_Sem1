package com.example.my;

import java.util.Scanner;
import java.time.LocalDateTime;

public class task_1 {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in, "utf-8");
        System.out.printf("name: ");
        String name = scanner.nextLine();
        LocalDateTime now = LocalDateTime.now();
        int hourNow = now.getHour();
        int minNow = now.getMinute();
        String dayTime = null;

        if(hourNow <= 12 & hourNow >= 03) {
            dayTime = "Доброе утро, ";
        } 
        else if(hourNow >= 12 & hourNow <= 16) {
            dayTime = "Добрый день, %s!\n%s:%s\n";
        }
        else if(hourNow >= 16 & hourNow <= 23) {
            dayTime = "Добрый вечер, %s!\n%s:%s\n";
        }
        else if(hourNow > 23 & hourNow < 03) {
            dayTime = "Доброй ночи, %s!\n%s:%s\n";
        }
        System.out.printf(dayTime, name, hourNow, minNow);
        //System.out.printf("Привет, %s!\n", name);
        scanner.close();
    }
}
