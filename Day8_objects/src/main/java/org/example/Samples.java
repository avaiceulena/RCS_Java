package org.example;

public class Samples {
    // ja ir runa par objektiem, tad vārdu static nelietojam
    public String name; //objekta vērtība
    public String lastName;
    public int course;

    public void print(){
        System.out.println(name + " " + lastName);
        System.out.println("Kurss: " + course);
    }
}
