package com.ignatev.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We take book from University Library ");
        System.out.println("------------------------------------------");
    }

    public void getMagazine() {
        System.out.println("We take magazine from University Library");
        System.out.println("------------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("We return book to University Library");
        return "War and Piece";
    }

    public void returnMagazine() {
        System.out.println("We return magazine to University Library");
        System.out.println("------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Add book to University Library");
        System.out.println("------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Add magazine to University Library");
        System.out.println("------------------------------------------");
    }
}
