package ru.job4j.lambda;

import java.util.Comparator;

public class CmpDescSize {

    Comparator<String> cmpDescSize = (left, right) -> {
        System.out.println("compare - " + left.length() + " : " + right.length());
        return Integer.compare(left.length(), right.length());
    };
}
