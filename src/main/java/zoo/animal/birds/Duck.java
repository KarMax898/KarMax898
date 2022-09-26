package zoo.animal.birds;

import command.Animal;
import command.IFlying;

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
