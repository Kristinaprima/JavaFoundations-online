package ru.itsjava.Unit;

public class UnitPractice {
    public static void main(String[] args) {
        Person man = new Person("Nick", 17);
        man.takeBeer();
        man.birthday();
        System.out.println("Продаем пиво? " + man.takeBeer());
        System.out.println("Продаем пиво? " + man.birthday());
    }

}
