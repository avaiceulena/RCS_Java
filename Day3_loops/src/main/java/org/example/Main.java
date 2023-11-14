package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task3();
    }

    public static void task3(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if(number > 0){
                sum = sum + number;
            }else{
                System.out.println("Kļūda!");
            }

        }
        System.out.println("Summa ir " + sum);
    }

    public static void sample4(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Lūdzu ievadiet skaitli!");
        int number = sc.nextInt();

        if(number == 5){
            for(int i = 0; i < 5; i++){
                System.out.println("hello");
            }
        }else{
            System.out.println("Kļūda");
        }
    }

    public static void sample3(){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Lūdzu ievadiet skaitli!");
            int number = sc.nextInt();

            if(number == 0){
                System.out.println("Kļūda");
            }else if(number == 4){
                System.out.println("Hello world!");
            }else{
                System.out.println("Hello world!2");
            }
        }
    }

    public static void task2(){
        Scanner sc = new Scanner(System.in);

        //String a = "aaa";
       // int b = a.length();


        int sum = 0;
        for(int i = 0; i < 5; i++){
            System.out.println("Ievadi string tipa vērtības!");
            String c = sc.nextLine();
            int b = c.length();
            sum = sum + b;

            // pareizāk sum = sum + c.length;

        }
        System.out.println("summa ir " + sum);
    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        //String a = "aaa";
       // int b = a.length();


        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Ievadi skaitli!");
            int number = sc.nextInt();
            sum = sum + number;
            System.out.println(number);
            System.out.println("-------");
        }
        System.out.println("summa ir " + sum);
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