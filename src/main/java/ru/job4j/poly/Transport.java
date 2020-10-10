package ru.job4j.poly;

public interface Transport {
    String drive();

    int passengers(String quantity);

    int fuel(int volume, int price);
}
