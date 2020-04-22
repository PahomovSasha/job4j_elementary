package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] arrayFiveElements = new int[5];
        for (int i = 0; i < arrayFiveElements.length; i++) {
            arrayFiveElements[i] = i * 2 + 3;
        }
        for (int i = 0; i < arrayFiveElements.length; i++) {
            System.out.println(arrayFiveElements[i]);
        }
    }
}
