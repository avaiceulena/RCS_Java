package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task1();
    }

    public static void task1(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++){
            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            System.out.println(number +5);
        }

    }
    public static void sample1(){
        // i++ -> i= i+1 var arī rakstīt i=i+2 vai i = +2
        // 5 vietā var ielikt mainīgo a
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println("Hello world!");
        }
    }
}