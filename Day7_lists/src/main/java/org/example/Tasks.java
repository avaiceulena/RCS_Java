package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {

    public static void task2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi vērtību:");

//        while (true){
//            List<String> stringInput = new ArrayList<>();
//            stringInput.add(sc.nextLine());
//
//            if(stringInput.equals("STOP")){
//                break;
//            }
//        }
//
//        System.out.println("Vai vēlies izvadīt visu vai kādu konkrētu vērtību?");
//        String input2 = sc.nextLine();
//
//        if(input2.equals("visu")){
//            System.out.println("Ievadi vērtību:");
//        }

        List<String> stringInput = new ArrayList<>();
        System.out.println("Cik vērtības tu vēlies ievadīt?");
        int input1 = sc.nextInt();

        System.out.println("Lūdzu ievadi vērtības");
        for(int i = 0; i <= input1; i++){
            stringInput.add(sc.nextLine());
            stringInput.get(i);
        }

        System.out.println("Vai vēlies izvadīt visu vai konkrētu vērtību?");
        String input2 = sc.nextLine();

//        if(input2.equals("VISU")){
//            System.out.println(stringInput.get(i));
//        }



    }
    public static double task1(double[] number){

        double largest = number[0];
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];

            }
        }
        return largest;
    }
}
