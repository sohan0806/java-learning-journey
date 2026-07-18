package Inheritance;
class Animal {
    void run(){
        System.out.println("run");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("bark");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meow");
    }
}

public class HierarcialIn {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run();
        cat.meow();

        dog.run();
        dog.bark();
    }

}
