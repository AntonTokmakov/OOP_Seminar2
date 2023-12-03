package org.example.personal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.Animal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Doctor extends People implements CheckPatient, Injection, CarryingOperation {

    Nurse nurse;
    int powerProffesional;

    @Override
    public void goPatient() {
        System.out.println("Доктор берет инструменты и идет к пациенту");
    }

    @Override
    public void checkThroat(Animal animal) {
        System.out.println("Врач посмотрел горло у " + animal.getName());
    }

    @Override
    public void checkNose(Animal animal) {
        System.out.println("Врач посмотрел нос у " + animal.getName());
    }

    @Override
    public void checkEar(Animal animal) {
        System.out.println("Врач посмотрел глаза у " + animal.getName());
    }

    @Override
    public void injectionIntoVein(Animal animal) {
        System.out.println("Врач поставил укол в вену " + animal.getName());
    }

    @Override
    public void injectionInMuscle(Animal animal) {
        System.out.println("Врач поставил укол в мышцу " + animal.getName());
    }

    @Override
    public void eyeSurgery(Animal animal) {
        System.out.println("Проведение операции у " + animal.getName());
    }
}
