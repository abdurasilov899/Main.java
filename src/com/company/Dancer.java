package com.company;

public class Dancer extends Person {
    private String groupname;

    public Dancer(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public Dancer(String surName, String groupname) {
        super(surName);
        this.groupname = groupname;
    }

    public void dancings() {
        System.out.println("dancing");
    }

    @Override
    public String toString() {
        return " " +
                " groupname= ' " + groupname + '\'' +
                " " + super.toString();
    }
}
