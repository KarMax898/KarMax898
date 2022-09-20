package ZOO;

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
            Command an = Command.valueOf(vvod.next().toUpperCase().trim());
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
                            dog.setName(vvod.nextLine());
                            System.out.println("Какой возраст?");
                            dog.setAge(Integer.parseInt(vvod.nextLine()));
                            System.out.println("Какой цвет?");
                            dog.setColor(vvod.nextLine());
                            System.out.println("Какой вес?");
                            dog.setWeight(Integer.parseInt(vvod.nextLine()));
                            animals.add(dog);
                            dog.say();
                        }
                        case "duck" -> {
                            System.out.println("Какое имя?");
                            Duck duck = new Duck();
                            duck.setName(vvod.nextLine());
                            System.out.println("Какой возраст?");
                            duck.setAge(Integer.parseInt(vvod.nextLine()));
                            System.out.println("Какой цвет?");
                            duck.setColor(vvod.nextLine());
                            System.out.println("Какой вес?");
                            duck.setWeight(Integer.parseInt(vvod.nextLine()));
                            animals.add(duck);
                            duck.fly();
                            duck.say();
                        }
                        default -> System.out.println( "Нет такого животного");
                    }
                }
                case LIST -> System.out.println(animals);
                case EXIT -> proverka = false;




            }



            }
        }

    }



