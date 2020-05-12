package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String voice = "eng";
        return voice;
    }
    public static void main(String [] args) {
        DummyDic word = new DummyDic();
        String write = word.engToRus("");
        System.out.println("Неизвестное слово " + write);
    }
}
