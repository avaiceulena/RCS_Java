package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sample2();

    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi pirmo skaitli!");
        int skaitlis1 = sc.nextInt();

        System.out.println("Ievadi otro skaitli!");
        int skaitlis2 = sc.nextInt();

        System.out.println(skaitlis1 + skaitlis2);
    }
}