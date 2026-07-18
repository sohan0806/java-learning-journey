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
class Cat extends Dog { // just for example 
    void meow() {
        System.out.println("meow");
    }
}

public class MultilevelIn {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run();
        cat.meow();
        cat.bark(); 

        dog.run();
        dog.bark();
    }

}
