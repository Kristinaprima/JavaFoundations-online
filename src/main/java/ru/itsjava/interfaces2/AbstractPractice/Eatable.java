package ru.itsjava.interfaces2.AbstractPractice;

public interface Eatable {

    default void eat() {
        System.out.println("Поедим");
    }
}
