package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {



    public static void main(String[] args) {
        int answer=new Random().nextInt(3);
        String rsl="Может быть";
        if(answer==0)
        {
        rsl="Нет";
        }
        if(answer==1)
        {
        rsl="Да";
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. Как Вас зовут? ");
        String name = input.nextLine();
        System.out.println(name + ", рад Вас видеть!");
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String name1 = input.nextLine();
        System.out.println(rsl);

    }
}
