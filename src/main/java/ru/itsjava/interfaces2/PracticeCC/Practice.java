package ru.itsjava.interfaces2.PracticeCC;


import ru.itsjava.interfaces.cloneable.Girl;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person vitalik = new Person("Vitalik", "Petrov", 19);
        Person vasya = new Person("Vasya", "Petrov", 16);
        Person vital = new Person("Vitalik", "Ivanov", 16);
        Person vanya = new Person("Vasya", "Petrov", 15);
        Person vanya2 = (Person) vanya.clone();

        System.out.println("vitalik.compareTo(vasya) = " + vitalik.compareTo(vasya));
        System.out.println("vasya.compareTo(vanya) = " + vasya.compareTo(vanya));
        System.out.println("vasya.compareTo(vital) = " + vasya.compareTo(vital));

        System.out.println("vanya = " + vanya);
        System.out.println("vanya2 = " + vanya2);

    }
}
