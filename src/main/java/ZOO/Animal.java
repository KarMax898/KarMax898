package ZOO;

public class Animal {

   protected String name;
    protected  int age;
   protected String color;
   protected int weight;

   //public int lastChar = Integer.parseInt((""+age).substring((""+age).length()-1));

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

    public void eat(){
        System.out.println(" Я ем ");

    }
    public void say(){
        System.out.println("Я говорю" );
    }
    public void drink(){
        System.out.println(" Я пью");
    }
    public void go(){
        System.out.println("Я иду");
    }




   /* private String voz() {
        if (age==1) {
            return  " год";

        } else if (age>=5 && age <=20) {
            return " лет ";


        }/* else if (lastChar>1 && lastChar<5) {
            return "Привет! меня зовут " + name + ", мне " + age + " года, я вешу - "
                    + weight + " кг, мой цвет - " + color +"" ;
    }*/

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ", мне " + age +   ", я вешу - "
                + weight + " кг, мой цвет - " + color + "";
    }
}