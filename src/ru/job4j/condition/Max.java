package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int resultFirstSecond = max(first, second);
        return resultFirstSecond > third ? resultFirstSecond : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        int resultFirstToThird = max(first, second, third);
        return resultFirstToThird > fourth ? resultFirstToThird : fourth;
    }
}
