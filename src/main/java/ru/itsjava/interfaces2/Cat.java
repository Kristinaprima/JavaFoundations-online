package ru.itsjava.interfaces2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cat implements Walkable,Runnable {
    public int maxRunDistance;

    @Override
    public void walk() {
        System.out.println("Я хожу");
    }

    @Override
    public void run() {
        System.out.println("Я плыву");
    }

    @Override
    public int maxRunDistance() {
        return maxRunDistance;
    }

    }

