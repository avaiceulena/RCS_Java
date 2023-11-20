package org.example;

public class Main {
    public static void main(String[] args) {
        String value1 = "aaa";
        String value2 = "bbb";
        String value3 = "ccc";

        sampleWith(value1, value2, value3);
    }
    public static void  sampleWith(String value1, String value2, String value3 ){
       // System.out.println(value3 + value2 + value1);

        int len = value3.length() + value2.length() + value1.length();
        if(len > 15){
            System.out.println(value1 + value3);
        }else {
            System.out.println(value1 + value2 + value3);
        }

    }
}