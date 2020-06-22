package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery duracell = new Battery(10);
        Battery energaizer = new Battery(20);
        System.out.println("Сharge duracell : " + duracell.load + ". Сharge energaizer : " + energaizer.load);
        duracell.exchange(energaizer);
        System.out.println("Сharge duracell : " + duracell.load + ". Сharge energaizer : " + energaizer.load);
    }
}
