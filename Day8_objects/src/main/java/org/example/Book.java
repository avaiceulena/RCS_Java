package org.example;

public class Book {
    public String autors;
    public String nosaukums;
    public int izdošanasGads;

    public void printInfo(){
        System.out.println(autors + " " + nosaukums);
        System.out.println("Izdošanas gads - " + izdošanasGads);
    }

}
