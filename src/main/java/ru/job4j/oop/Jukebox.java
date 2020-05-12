package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
       if(position == 1) {
           System.out.print ("Пусть бегут неуклюже");
       } else if(position == 2) {
           System.out.print ("Спокойной ночи");
       } else {
           System.out.print ("Песня не найдена");
       }
        System.out.println();
    }
    public static void main(String[] args) {
        Jukebox cafe = new Jukebox();
        cafe.music(1);
    }
}
