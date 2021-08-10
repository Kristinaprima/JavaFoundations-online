package ru.itsjava.interfaces2.PracticeCC;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@Data
public class Person implements Cloneable, Comparable<Person> {
    private final String name;
    private final String surname;
    private final int age;


    @Override
    public int compareTo(Person p) {
        if (surname.compareTo(p.surname) == 0) {
            if (name.compareTo(p.name) == 0) {
                if (age == p.age)
                    return 0;
                else if (age > p.age)
                    return 1;
                else return -1;
            }
            return surname.compareTo(p.surname);
        }
        return name.compareTo(p.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" + name + "," + surname + ", " + age + "}";
    }


}
