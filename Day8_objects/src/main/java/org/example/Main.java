package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Konstruktors uztaisa jaunu objektu
        // objektus taisot neizmanto static!
        // statiskās metodes ir ērtas ja nav aprakstošas informācijas
        //statiska metode izpildās neatkarīgi no objektiem

//        Samples st = new Samples(); //objekts
//        st.name = "Jānis";
//        st.lastName = "Bērziņš";
//        st.course = 1;
//
//        st.print();
        sample2();

    }

    public static void sample2(){
        Scanner sc = new Scanner(System.in);

        Book pr = new Book();
        System.out.println("Ievadi grāmatas autoru:");
        pr.autors = sc.nextLine();
        System.out.println("Ievadi grāmatas nosaukumu:");
        pr.nosaukums = sc.nextLine();
        System.out.println("Ievadi izdošanas gadu:");
        pr.izdošanasGads = sc.nextInt();
        sc.nextLine();
        pr.printInfo();

        Book gr = new Book();
        System.out.println("Ievadi grāmatas autoru:");
        gr.autors = sc.nextLine();
        System.out.println("Ievadi grāmatas nosaukumu:");
        gr.nosaukums = sc.nextLine();
        System.out.println("Ievadi izdošanas gadu:");
        gr.izdošanasGads = sc.nextInt();

        gr.printInfo();
    }
}