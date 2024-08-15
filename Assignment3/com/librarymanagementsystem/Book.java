package com.librarymanagementsystem;

public class Book {
    private String title;
    private String subtitle = "";
    private static int count = 0;

    Book(String title) {
        this.title = title;
        count += 1;
    }

    Book(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
        count += 1;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Title: " + title);
        if (!this.subtitle.isEmpty()) {
            System.out.println("Subtitle: " + this.subtitle);
        }
        System.out.println();
    }

    public static void getCount() {
        System.out.println("total number of books created: " + count);
    }
}
