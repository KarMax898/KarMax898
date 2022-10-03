import animal.Animal;
import data.Command;
import animal.pets.Cat;
import animal.pets.Dog;
import animal.birds.Duck;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws NullPointerException {


  /*  Cat cat = new Cat();
        cat.say();

        Dog dog = new Dog();
        dog.say();

        Duck duck = new Duck();
        duck.fly();
        duck.say();

        Animal animal = new Animal();
        System.out.println(animal);*/

        ArrayList<Animal> animals =new ArrayList<>();

        Scanner vvod = new Scanner(System.in);


        boolean proverka = true;
        while (proverka) {

            System.out.println("Веберите команду add/list/exit");
            String input = vvod.next().toUpperCase().trim();
            boolean isExist = false;
            for (Command item: Command.values()) {
                if (item.name().equals(input) ) {
                    isExist = true;
                    break;

                }
            }
            if (!isExist) {
                System.out.println(" Нет такой команды");
                continue;
            }
            Command an = Command.valueOf(input);


            switch (an){
                case ADD -> {
                    System.out.println(" Выберите животное(cat/dog/duck)");

                    String ani = vvod.next();


                    switch (ani) {
                        case "cat" -> {
                            System.out.println("Какое имя?");
                            Cat cat = new Cat();
                            cat.setName(vvod.next());
                            System.out.println("Какой возраст?");
                            cat.setAge(vvod.nextInt());
                            System.out.println("Какой цвет?");
                            cat.setColor(vvod.next());
                            System.out.println("Какой вес?");
                            cat.setWeight(vvod.nextInt());

                            animals.add(cat);
                            cat.say();
                        }
                        case "dog" -> {
                            System.out.println("Какое имя?");
                            Dog dog = new Dog();
                            dog.setName(vvod.next());
                            System.out.println("Какой возраст?");
                            dog.setAge(vvod.nextInt());
                            System.out.println("Какой цвет?");
                            dog.setColor(vvod.next());
                            System.out.println("Какой вес?");
                            dog.setWeight(vvod.nextInt());
                            animals.add(dog);
                            dog.say();
                        }
                        case "duck" -> {
                            System.out.println("Какое имя?");
                            Duck duck = new Duck();
                            duck.setName(vvod.next());
                            System.out.println("Какой возраст?");
                            duck.setAge(vvod.nextInt());
                            System.out.println("Какой цвет?");
                            duck.setColor(vvod.next());
                            System.out.println("Какой вес?");
                            duck.setWeight(vvod.nextInt());
                            animals.add(duck);
                            duck.fly();
                            duck.say();
                        }
                        default -> System.out.println( "Нет такого животного");
                    }

                }
                case LIST -> System.out.println(animals);
                case EXIT -> System.exit(0);
                

            }


            }
        }

    }



