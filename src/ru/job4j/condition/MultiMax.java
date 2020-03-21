package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int resultFirstAndSecond = first > second ? first : second;
        int result = resultFirstAndSecond > third ? resultFirstAndSecond : third;
        return result;
    }
}
