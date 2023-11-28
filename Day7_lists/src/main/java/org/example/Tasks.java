package org.example;

public class Tasks {
    public static double task1(double[] number){

        double largest = 0;
        for(int i = 0; i < number.length; i++){
            if(number[i] > largest){
                largest = number[i];

            }
        }
        return largest;
    }
}
