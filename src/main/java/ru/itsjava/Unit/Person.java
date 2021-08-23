package ru.itsjava.Unit;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {
    private final String name;
    private  final int age;


    public static void birthday(int age) {
        this.age = age + 1;

    }


    public boolean takeBeer( ) {
        if (age >= 18) {
            return true;
        } else {
            return false;

        }
    }
}