package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matches = 11;
        int result;
        while (matches > 0) {
            System.out.println("Игра 11");
            System.out.println("Можно взять 1, 2 или 3 спички");
            System.out.print("Введите колличество спичек, чтобы начать игру: ");
            int select = Integer.valueOf(input.nextLine());
            if (select == 3) {
              result = matches - 3;
                System.out.println("Игра игра продолжается осталось спичек " + result;

            } else if (select == 1) {
                result = matches - 1;
                System.out.println("Игра игра продолжается осталось спичек " + result);
            } else if (select == 2) {
                result = matches - 2;
                System.out.println("Игра игра продолжается осталось спичек " + result);
            } else {
                System.out.println("Можно юрать от 1 до 3 спичек.");
            }
            System.out.println();
        }
    }
}