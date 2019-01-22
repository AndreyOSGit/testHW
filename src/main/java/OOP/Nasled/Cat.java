package OOP.Nasled;

import OOP.Nasled.Animal;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String color ) {
        this.age = age;
        sleep();
    }

    int age = 0;
    String color = "green";

    public static void mur(){
        System.out.println("I say murrr");
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
}
