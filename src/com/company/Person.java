package com.company;

public class Person {
    private String surName;
   public Person (){

   }
    public Person(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return " " +
                " " + surName + '\'' +
                ' ';
    }

    public void learn() {
        System.out.println("English");
    }

    public void eat() {
        System.out.println("Want eat");
    }

    public void walk() {
        System.out.println("Street");
    }

}
