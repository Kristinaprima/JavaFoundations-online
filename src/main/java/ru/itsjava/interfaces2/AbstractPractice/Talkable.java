package ru.itsjava.interfaces2.AbstractPractice;

public interface Talkable {

    default void talk() {
        System.out.println("Поговорим");
    }
}
