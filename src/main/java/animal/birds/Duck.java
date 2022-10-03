package animal.birds;

import animal.Animal;

public class Duck extends Animal implements IFlying {
    @Override
    public void say() {
        System.out.println("Кря Кря");
    }

    @Override
    public void fly() {
        System.out.println("Я лечу");
    }
}
