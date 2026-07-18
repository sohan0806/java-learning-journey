package Inheritance;
class Animal {
    void run(){
        System.out.println("run");
    }
}
class Bird extends Animal {
    void nest() {
        System.out.println("nest");
    }
}
class pigeon extends Bird { // just for example 
    void eat() {
        System.out.println("eat");
    }
}

public class MultilevelIn {
    public static void main(String[] args) {
        pigeon p1 = new pigeon();

        p1.eat();
        p1.nest();
        p1.run();
    }

}
