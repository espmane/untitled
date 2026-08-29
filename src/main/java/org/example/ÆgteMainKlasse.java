package org.example;

public class ÆgteMainKlasse {
    public String name;
    public int age;

    ÆgteMainKlasse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run() {
        while (age > 0) {
            System.out.println(name + " er " + age + " gammel");
            age--;
        }
    }
}
