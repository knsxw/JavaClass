package com.librarymanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Library {
    static ArrayList<Book> books = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String flag;
        do {
            userInput();
            System.out.print("Do you want to enter another book? (yes/no): ");
            flag = br.readLine();
            System.out.println();
        } while (flag.equalsIgnoreCase("yes"));
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.display();
        }
        Book.getCount();
    }

    public static void userInput() throws IOException {
        System.out.println("Enter details for a new book: ");
        System.out.print("Title: ");
        String title = br.readLine();
        System.out.print("Subtitle (or press Enter to skip): ");
        String subtitle = br.readLine();
        Book book;
        if (subtitle.isEmpty()) {
            book = new Book(title);
        } else {
            book = new Book(title, subtitle);
        }
        books.add(book);
    }
}
