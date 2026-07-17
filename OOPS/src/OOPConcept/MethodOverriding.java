package OOPConcept;
class ProgrammingLanguage {
    public void displayInfo() {
        System.out.println("I am a programming language");
    }
}
class java extends ProgrammingLanguage {
    @Override
    public void displayInfo() {
        System.out.println("I am OOPs");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
            // ProgrammingLanguage s1;

            // s1 = new ProgrammingLanguage();
            // s1.displayInfo();

            // s1 = new java();
            // s1.displayInfo();

            ProgrammingLanguage s1 = new java();
            s1.displayInfo();
            

    }

}
