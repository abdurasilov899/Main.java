package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Peaksoft","Abdurasilov");
        System.out.println(programmer);
        programmer.learn();
        programmer.eat();
        programmer.walk();
        programmer.codings();
    System.out.println("==================================");
        Dancer dancer = new Dancer("WINKS","Kamilov");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancings();
    System.out.println("=======================================");
        Singer singer = new Singer("KONI","Abdigaparov");
        System.out.println(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();
        singer.gitar();
    }
}
