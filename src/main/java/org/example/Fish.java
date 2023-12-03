package org.example;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable{
    public Fish() {
        super();
    }

    public Fish(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("impossible");
    }

    @Override
    public void toGo() {
        System.out.println("no than to walk");
    }

    @Override
    public void swim(Animal animal) {
        System.out.println("Рыба плывет");
    }
}
