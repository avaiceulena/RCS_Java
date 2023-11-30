package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks {
    public static int task3() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Ievadi skaitli");
        int num = 0;
        boolean loop = false;
        while (!loop) {
            try {
                System.out.println("Ievadi skaitli!");
                num = sc.nextInt();
                loop = true;

            } catch (InputMismatchException e) {
                System.out.println("Tu neievadīji skaitli. Mēģini vēlreiz!");
                sc.next();
            }
        }
        return num;
    }
}
