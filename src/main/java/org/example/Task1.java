package org.example;


import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {

        VeterinaryClinic clinic = new VeterinaryClinic();
        Illness illness = new Illness("Чумка");
        clinic.addPatient(new Fish("Федя", illness, "Дядя петя", LocalDate.now()));
        clinic.addPatient(new Dog("Андрей", illness, "Дядя Петр", LocalDate.now()));
        clinic.addPatient(new Cat("Илья", illness, "Дядя Иван", LocalDate.now()));
        clinic.addPatient(new Duck("Ваня", illness, "Дядя игорь", LocalDate.now()));
        clinic.addPatient(new Dog("Антон", illness, "Дядя илья", LocalDate.now()));
        clinic.addPatient(new Cat("Катя", illness, "Дядя ваня", LocalDate.now()));

        System.out.println("//////////Patients////////////");
        System.out.println(clinic.getPatients());

        System.out.println("//////////Goable//////////////");
        System.out.println(clinic.getGoable());

        System.out.println("//////////Speakble////////////");
        System.out.println(clinic.getSpeakble());

        System.out.println("//////////Swimable////////////");
        System.out.println(clinic.getSwimable());

    }
}
