package ru.itsjava.interfaces2;


public class Practice {
    public static void main(String[] args) {

        Swimable dory = new Fish(5.0);
        dory.swim();
        dory.maxSwimSpeed();
        System.out.println("Rick " + dory.maxSwimSpeed());


        Bird duck = new Bird("1200 км");
        duck.walk();
        duck.fly();
        duck.flyMaxDistance();
        System.out.println("Во время миграции утка пролетает " + duck.flyMaxDistance);


        Cat tom = new Cat(100);
        tom.walk();
        tom.run();
        tom.maxRunDistance();
        System.out.println("Кот Том пробегает максимум " + tom.maxRunDistance + " m");


        Dog tor = new Dog(900, 4.0);
        tor.walk();
        tor.run();
        tor.swim();
        tor.maxRunDistance();
        tor.maxSwimSpeed();
        System.out.println("Тор пробегает " + tor.maxRunDistance + " m");
        System.out.println("Тор плавает " + tor.maxSwimSpeed);


        Man anton = new Man(8, 6.0);
        anton.walk();
        anton.run();
        anton.swim();
        anton.maxRunDistance();
        anton.maxSwimSpeed();
        System.out.println("Тоша пробегает " + anton.maxRunDistance + " m");
        System.out.println("Тоша плавает " + anton.maxSwimSpeed);

    }
}
