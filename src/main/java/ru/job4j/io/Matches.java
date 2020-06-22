package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matchesCount = 11;
        System.out.println("Начинается игра 11 спицек");
        while (matchesCount > 0) {
            System.out.println("Ваш ход, возьмите от 1 до 3-х спичек со стола");
            System.out.println("Сколько спичек вы взяли?");
            int matchesOfPlayer = input.nextInt();
            if (!numberOneToThree(matchesOfPlayer)) {
                System.out.println("Вы взяли неверное количество спичек, повторите ход ещё раз");
                System.out.println();
                continue;
            }
            matchesCount = matchesCount - matchesOfPlayer;
            if (matchesCount > 0) {
                System.out.println("На столе осталось " + matchesCount + " спичек");
            }
            System.out.println();
        }
        System.out.println("Вы выиграли");
    }

    private static boolean numberOneToThree(int number) {
        return number >= 1 && number <= 3;
    }
}
