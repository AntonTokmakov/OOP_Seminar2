package org.example.personal;

import lombok.*;
import org.example.Goable;
import org.example.Speakble;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class People implements Speakble, Goable {

    private String name;
    private String lastName;
    private int age;
    private boolean isMan;

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void speak() {
        System.out.println("Человек говорит");
    }

    abstract public void goPatient();

}
