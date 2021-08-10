package ru.itsjava.interfaces2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Bird implements Walkable, Flyable {
    public String flyMaxDistance;

    @Override
    public void walk() {
        System.out.println("Я хожу");
    }


    @Override
    public String flyMaxDistance() {
        return flyMaxDistance;
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }

}
