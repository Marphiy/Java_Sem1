package com.example.my;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        //System.out.println(now.format(formater));

        Scanner scanner = new Scanner(System.in, "utf-8");
        System.out.printf("name: ");
        String name = scanner.nextLine();
        formater = DateTimeFormatter.ofPattern("HH");
        int hourNow = now.getHour();
        String dayTime = null;
    
        if(hourNow <= 12 & hourNow >= 03) {
            dayTime = "Доброе утро, ";
        } 
        else if(hourNow >= 12 & hourNow <= 16) {
            dayTime = "Добрый день, ";
        }
        else if(hourNow >= 16 & hourNow <= 23) {
            dayTime = "Добрый вечер, ";
        }
        else if(hourNow > 23 & hourNow < 03) {
            dayTime = "Доброй ночи, ";
        }
        System.out.printf(dayTime, name);
        System.out.println(hourNow);
        //System.out.printf("Привет, %s!\n", name);
        scanner.close();
    }
}
