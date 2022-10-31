package com.dp;

public class WorkWithAnimals {

    public static void main(String[] args) {
        Dog fido = new Dog();

        fido.setName("Fido");

        System.out.println(fido.getName());

        fido.digHole();

        fido.setWeight(-1);

        int randNum = 10;
        fido.changeVar(randNum);
        System.out.println("randNum after method call: " + randNum);

        changeObjectName(fido);

        System.out.println("Dog name after method call: " + fido.getName());

        Animal doggy = new Dog();

        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[2];
        animals[0] = doggy;
        animals[1] = kitty;

        for (Animal animal: animals) {
            System.out.println("Animal says: " + animal.getSound());
        }

        speakAnimal(doggy);
        speakAnimal(kitty);

        ((Dog)doggy).digHole();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");

        System.out.println(giraffe.getName());

        Monkey monkey = new Monkey();
        Living.someStaticMethod();
        monkey.someDefaultMethod();

        Living monkey1 = new Monkey();
        //monkey1.someStaticMethod();
        monkey1.someDefaultMethod();

    }

    public static void changeObjectName(Dog fido){
        fido.setName("Markus");
    }

    public static void speakAnimal(Animal animal){
        System.out.println("Animal says: " + animal.getSound());
    }
}
