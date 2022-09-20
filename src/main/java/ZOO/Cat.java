package ZOO;

public class Cat extends Animal {
    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age + " года я вешу - "
                + weight + " кг, мой цвет - " + color +"" ;
    }


    @Override
    public void say() {
        System.out.println("Мяу Мяу");

    }
}
