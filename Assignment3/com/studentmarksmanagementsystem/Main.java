package com.studentmarksmanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        userInput();
        for (Student student : students) {
            student.display();
        }
        meanMarks();
        highestGPA();
    }
    static void userInput() throws IOException {
        String flag;
        do {
            Student student = new Student();
            System.out.println("Enter details for a new student:");
            System.out.print("Name: ");
            student.name = br.readLine();
            System.out.println("Enter marks for 6 subjects (or less, defaults to 0)");
            for (int i = 0; i < 6; i++) {
                System.out.print("Subject"+(i + 1)+": ");
                student.marks[i] = Double.parseDouble(br.readLine());
            }
            System.out.print("Enter address 1: ");
            student.address1 = br.readLine();
            System.out.print("Enter address 2: ");
            student.address2 = br.readLine();
            students.add(student);
            System.out.print("Do you want to enter another student? (yes/no): ");
            flag = br.readLine();
        } while (flag.equalsIgnoreCase("yes"));
    }

    static void meanMarks() {
        System.out.println("Mean marks: ");
        for (int i = 0; i < 6; i++) {
            double totalMarks = 0;
            for (Student student : students) {
                totalMarks += student.marks[i];
            }
            System.out.println("Subject"+(i + 1)+": " + totalMarks/students.size());
        }
        System.out.println();
    }

    static void highestGPA() {
        Student maxStudent = students.getFirst();
        for (Student student : students) {
            if (student.getGPA() > maxStudent.getGPA()) {
                maxStudent = student;
            }
        }
        System.out.println("Student with highest gpa: ");
        maxStudent.display();
    }
}
