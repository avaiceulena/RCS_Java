package org.example;

public class Main {
    public static void main(String[] args) {
       int c =  task2(1, 4);
        System.out.println(c);
        

    }

    public static int task2 (int num1, int num2){
        if(num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }


}