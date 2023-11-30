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

        Scanner sc = new Scanner(System.in);

        System.out.println("Ievadi grāmatas autoru:");
        String input = sc.nextLine();

        System.out.println("Ievadi grāmatas nosaukumu:");
        input = sc.nextLine();

        System.out.println("Ievadi izdošanas gadu:");
        int input2 = sc.nextInt();

        Book pr = new Book();
        pr.autors = input;
        pr.nosaukums = input;
        pr.izdošanasGads = input2;

        pr.printInfo();
    }
}