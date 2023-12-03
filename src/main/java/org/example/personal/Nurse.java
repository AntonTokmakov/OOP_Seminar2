package org.example.personal;

import org.example.Animal;

public class Nurse extends People implements CheckPatient, Injection {

    public Nurse(String name, String lastName, int age, boolean isMan) {
        super(name, lastName, age, isMan);
    }

    public Nurse() {
        super();
    }

    public void makeInjection(){
        System.out.println("Укол сделан");
    }

    @Override
    public void checkThroat(Animal animal) {
        System.out.println("Медсестра посмотрел горло у " + animal.getName());
    }

    @Override
    public void checkNose(Animal animal) {
        System.out.println("Медсестра посмотрел нос у " + animal.getName());
    }

    @Override
    public void checkEar(Animal animal) {
        System.out.println("Медсестра посмотрел глаза у " + animal.getName());
    }

    @Override
    public void goPatient() {
        System.out.println("Идет проверять пациента");
    }

    @Override
    public void injectionIntoVein(Animal animal) {
        System.out.println("Медсестра поставил укол в вену " + animal.getName());
    }

    @Override
    public void injectionInMuscle(Animal animal) {
        System.out.println("Медсестра поставил укол в мышцу " + animal.getName());
    }
}
