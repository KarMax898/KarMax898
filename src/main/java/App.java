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

        ArrayList<Animal> animals = new ArrayList<>();

        Scanner vvod = new Scanner(System.in);



        while (true) {

            System.out.println("Веберите команду add/list/exit");
            String input = vvod.next().toUpperCase().trim();
            boolean isExist = false;
            for (Command item : Command.values()) {
                if (item.name().equals(input)) {
                    isExist = true;
                    break;

                }
            }
            if (!isExist) {
                System.out.println(" Нет такой команды");
                continue;
            }
            Command command = Command.valueOf(input);


            switch (command) {

                case ADD -> {
                    System.out.println(" Выберите животное(cat/dog/duck)");

                    String ani = vvod.next();
                    Animal pet = null;
                    switch (ani) {

                        case "cat" -> {
                            pet = new Cat();
                        }
                        case "dog" -> {
                            pet = new Dog();
                        }
                        case "duck" -> {
                            pet = new Duck();
                        }

                        default -> {
                            System.out.println("Нет такого животного");
                            continue;
                        }

                    }

                    System.out.println("Какое имя?");

                    pet.setName(vvod.next());
                    while (true) {
                        System.out.println("Какой возраст?");
                        String years = vvod.next();
                        if (isNumber(years)) {
                            pet.setAge(Integer.parseInt(years));
                            break;
                        }
                        System.out.println("  Вы ввели неверный возраст");
                    }

                    System.out.println("Какой цвет?");
                    pet.setColor(vvod.next());
                    while (true) {
                        System.out.println("Какой вес?");
                        String years = vvod.next();
                        if (isNumber(years)) {
                            pet.setWeight(Integer.parseInt(years));
                            break;
                        }
                        System.out.println("  Вы ввели неверный вес");
                    }
                    animals.add(pet);
                    pet.say();



                }
                case LIST -> System.out.println(animals);
                case EXIT -> System.exit(0);


            }


        }
    }

    private static boolean isNumber(String str) {
        try {
            int number = Integer.parseInt(str);
            return number > 0;
        } catch (NumberFormatException ignore) {
            return false;
        }

    }
}



