package ru.job4j.encapsulation;

public class Book {
    private String nameBook;
    private int  numberPages;

    public Book(String nameBook, int numberPages) {
        this.nameBook = nameBook;
        this.numberPages = numberPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }
}
