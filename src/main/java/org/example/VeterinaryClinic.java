package org.example;

import org.example.personal.People;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<People> worker = new ArrayList<>();


    public  List<Animal> getPatients(){
        return patients;
    }

    public VeterinaryClinic addPatient(Animal patient){
        patients.add(patient);
        return this;
    }

    public List<Speakble> getSpeakble(){

        List<Speakble> list = new ArrayList<Speakble>();

        for (Animal animal: patients){
            if (animal instanceof Speakble){
                list.add((Speakble) animal);
            }
        }
        return list;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> list = new ArrayList<>();
        for (Animal animal: patients){
            if (animal instanceof Swimable){
                list.add((Swimable) animal);
            }
        }
        return list;
    }

    public VeterinaryClinic addWorker(People people){
        worker.add(people);
        return this;
    }

    public void removeWorker(People people){
        worker.remove(people);
    }

    public void removePatient(Animal patient){
        patients.remove(patient);
    }

    public List<Goable> getGoable(){
        List<Goable> result = new ArrayList<>();
        for (Animal animal:patients){
            if (animal instanceof Goable){
                result.add((Goable) animal);
            }
        }
        return result;
    }
}
