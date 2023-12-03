package org.example;

import java.time.LocalDate;

public class Duck extends Animal implements Swimable, Speakble, Goable, Flyable {

    public Duck() {
        super();
    }

    public Duck(String name, Illness illness, String ownername, LocalDate birthday) {
        super(name, illness, ownername, birthday);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Утка бежит");
    }

    @Override
    public void speak() {
        System.out.println("Утка говорит");
    }

    @Override
    public void swim(Animal animal) {
        System.out.println("Утка плывет");
    }

    @Override
    public void fly(){
        System.out.println("Утка летит");
    }
}
