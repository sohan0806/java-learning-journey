package OOPConcept;
class Student {
    String name;
    int age;
    int grade;
    //different parameters
    public void displayInfo(String name) {
        System.out.println("Name of student is: " + name);
    }
    public void displayInfo(int age) {
        System.out.println("Age of Student is: " + age);
    }
    //different no of parameters
    public void displayInfo(String name, int grade) {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

}
public class MethodOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sohan Shah";
        s1.age = 20;
        s1.grade = 12;
        s1.displayInfo(s1.name);
        s1.displayInfo(s1.age);
        s1.displayInfo(s1.name,s1.grade);

    }
}
