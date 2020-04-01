package ru.job4j.encapsulation;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Clean code", 200);
        Book bookTwo = new Book("Head First Java", 400);
        Book bookThree = new Book("Java. Библиотека профессионала", 260);
        Book bookFour = new Book("Эффективная Java", 370);

        Book[] books = new Book[4];

        books[0] = bookOne;
        books[1] = bookTwo;
        books[2] = bookThree;
        books[3] = bookFour;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getNumberPages());
        }

        books[0] = bookThree;
        books[3] = bookOne;

        System.out.println("------------------------------------------------------");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getNameBook() + " - " + bk.getNumberPages());
        }

        System.out.println("------------------------------------------------------");

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getNameBook().equals("Clean code")) {
                System.out.println(bk.getNameBook() + " - " + bk.getNumberPages());
            }
        }
    }
}
