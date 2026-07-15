// Java methods

public class Methods {
    // Syntax: accessModifier returnType name(args) {}
    
    static void greet(String name) {
        System.out.println("Hey there, " + name);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    // Method overloading - same method name, different return type/arguments
    static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        Methods.greet("Galen");
        System.out.println("Integer sum: " + sum(5, 7));
        System.out.println("Float sum: " + sum(3.3f, 2.4f));
    }
}
