package com.company;

public class Programmer extends Person {
    private String companyname;


    public String getCompanyname() {
        return companyname;
    }

    public Programmer(String surName, String companyname) {
        super(surName);
        this.companyname = companyname;
    }

    public Programmer(String companyname) {
        this.companyname = companyname;
    }

    public void codings() {
        System.out.println("Want coding ");
    }

    @Override
    public String toString() {
        return
                " companyname= ' "  + companyname + '\'' +
                " " + super.toString();
    }
}
