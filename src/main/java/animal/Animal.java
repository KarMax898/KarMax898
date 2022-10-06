package animal;

public abstract   class Animal {

    protected String name;
    protected int age;
    protected String color;
    protected int weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }

    public void eat() {
        System.out.println(" Я ем ");

    }

    public void say() {
        System.out.println("Я говорю");
    }

    public void drink() {
        System.out.println(" Я пью");
    }

    public void go() {
        System.out.println("Я иду");
    }




    private String pokazatelVozrasta() {

        int lastNumber = age % 10;
        int lastDoubleNumber = age % 100;

        if (lastNumber == 1 && lastNumber != 11 && lastDoubleNumber !=11) {
            return " год";

        } else if (lastDoubleNumber > 9 && lastDoubleNumber < 14  ) {
            return " лет ";

        } else if (lastNumber > 1 && lastNumber <  5 ) {
            return " года";


        } else{
            return " лет";
        }

    }

    @Override
    public String toString() {
        return "\n" + "Привет! меня зовут " + name + ", мне " + age + pokazatelVozrasta() + ", я вешу - "
                + weight + " кг, мой цвет - " + color + " " ;
    }
}
