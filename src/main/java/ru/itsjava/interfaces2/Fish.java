package ru.itsjava.interfaces2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Fish implements Swimable {
    public double maxSwimSpeed;

    @Override
    public double maxSwimSpeed() {
        return maxSwimSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Я плыву");
    }
}
