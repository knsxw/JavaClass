package com.studentmarksmanagementsystem;

public class Student {
    Double[] marks = new Double[6];
    String name;
    String address1;
    String address2;

    Student (String name, String address1) {
        this.name = name;
        this.address1 = address1;
    }

    Student (String name, String address1, String address2){
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
    }

    public Student() {

    }

    void display() {
        System.out.println("Name: " + name);
        System.out.print("Marks: " );
        for (Double mark : marks) {
            System.out.print(Math.round(mark) + " ");
        }
        System.out.println();
        System.out.println("GPA: " + getGPA());
        System.out.println("Address1: " + address1);
        if (!address2.isEmpty()) {
            System.out.println("Address2: " + address2);
        } else {
            System.out.println("Address2: Not provided");
        }
        System.out.println();
    }

    double getGPA() {
        double total = 0.0;
        int count = 0;
        for (Double mark : marks) {
            if (mark > 0.0) {
                count += 1;
            }
            total += mark;
        }
        return total/count;
    }

}
