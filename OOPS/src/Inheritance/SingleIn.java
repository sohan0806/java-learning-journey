package Inheritance;
class Shape {
    void side() {
        System.out.println("All Sturcture with Side");
    }
}
class Triangle extends Shape {
    void Area() {
        System.out.println("formula of area is 1/2*Pi*r^2");
    }
}

public class SingleIn {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.side();
        t1.Area();
    }

}
