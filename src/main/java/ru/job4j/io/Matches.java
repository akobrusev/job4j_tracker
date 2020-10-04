package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        boolean player = true;
        int matches = 11;
        int result;
        System.out.println("Игра 11");
        System.out.println("Можно взять 1, 2 или 3 спички");
        while (run) {
                String name = player ? "игрок_1" : "игрок_2";
                System.out.println(matches + " спичек осталось" );
                System.out.println(name  + " Введите колличество спичек, чтобы начать игру: ");
            int select = Integer.valueOf(input.nextLine());
                if (select < 1 || select > 3) {
                System.out.println("Можно брать от 1 до 3 спичек.");
            } else {
                result = matches - select;
                if (result < 0) {
                    System.out.println("На столе осталось меньше спичек, попробуй снова");
                } else {
                    matches = result;
                    player = !player;
                }
            }
                if (matches == 0) {
                run = false;
                System.out.println("Игра окончена! победил  " + name);
            }
        }
    }
}
