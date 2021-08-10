package ru.itsjava.interfaces2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Walkable, Runnable, Swimable {
    public int maxRunDistance;
    public double maxSwimSpeed;

    @Override
    public void walk() {
        System.out.println("Я умею ходить");
    }

    @Override
    public void run() {
        System.out.println("Я бегаю");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    @Override
    public double maxSwimSpeed() {
        return maxSwimSpeed;
    }

    @Override
    public void swim() {
        System.out.println("Я научился плавать");
    }
}
