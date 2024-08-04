import bank.*;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something.");
    }


    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }
}

class Shape {
    String color;
}

class Triangle extends Shape {

}

abstract class Animal {
    Animal() {
        System.out.println("You are creating a new animal");
    }
    abstract void walk();
    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Creating a horse");
    }
    public void walk(){
        System.out.println("Walking on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walking on 2 legs");
    }
}

interface Animal1 {
    public void walk();
}
public class OOPS {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        Student s1 = new Student();
        s1.name = "Karan";
        s1.age = 22;
        s1.printInfo("aman");
        Triangle t1 = new Triangle();
        t1.color = "red";

        Horse horse = new Horse();
        horse.walk();
    }
}
