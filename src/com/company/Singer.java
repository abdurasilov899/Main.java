package com.company;

public class Singer extends Person {
    private String bandname;

    public Singer(String bandname) {
        this.bandname = bandname;
    }

    public String getBandname() {
        return bandname;
    }

    public Singer(String surName, String bandname) {
        super(surName);
        this.bandname = bandname;
    }

    public void singing() {
        System.out.println("Singing");
    }

    public void gitar() {
        System.out.println("Play Gitar");
    }

    @Override
    public String toString() {
        return "Singer " +
                " bandname= ' " + bandname + '\'' +
                " " + super.toString();
    }
}
