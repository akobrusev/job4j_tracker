package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery (int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load - another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery charge = new Battery(100);
        Battery discharge1 = new Battery(5);
        Battery discharge2 = new Battery(25);
        System.out.println("charge : " + charge.load + ". discharge1 : " + discharge1.load);
        charge.exchange(discharge1);
        System.out.println("charge : " + charge.load + ". discharge2 : " + discharge2.load);
        charge.exchange(discharge2);
        System.out.println("charge : " + charge.load + ". discharge2 : " + discharge2.load);
    }
}
