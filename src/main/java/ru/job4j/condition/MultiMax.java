package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int resultFirstAndSecond = first > second ? first : second;
        int result = resultFirstAndSecond > third ? resultFirstAndSecond : third;
        return result;
    }

    public int max(int first, int second, int third, int fourth) {
        int resultFirstAndSecond = first > second ? first : second;
        int resultThirdAndFourth = third > fourth ? third : fourth;
        int result = resultFirstAndSecond > resultThirdAndFourth ? resultFirstAndSecond : resultThirdAndFourth;
        return result;
    }
}
