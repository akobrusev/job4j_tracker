package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public String drive() {
        return null;
    }

    @Override
    public int passengers(String quantity) {
        return 0;
    }

    @Override
    public int fuel(int volume, int price) {
        int cost = 49;
        price = volume * cost;
        return price;
    }

}
