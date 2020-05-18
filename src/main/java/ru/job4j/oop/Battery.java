package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery (int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
       another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery charge1 = new Battery(5);
        Battery charge2 = new Battery(25);
        System.out.println("charge1: " + charge1.load  + ".charge2 : " + charge2.load);
        charge1.exchange(charge2);
        System.out.println("charge1: " + charge1.load  + ".charge2 : " + charge2.load);
    }
}
