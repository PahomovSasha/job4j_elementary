package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;
        if (checkNumberMoreOne(number)) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    private static boolean checkNumberMoreOne(int number) {
        return number <= 1;
    }
}
