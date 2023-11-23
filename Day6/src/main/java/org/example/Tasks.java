package org.example;

import java.util.Scanner;

public class Tasks {
    public static int number(int count){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 1; i <= count; i++){
            System.out.println("Ievadi skaitli!");
            int input = sc.nextInt();

            sum = (sum + input);
            //sum+=input;
        }
        return sum / count;
    }
}
