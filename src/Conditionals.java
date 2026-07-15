// Java conditionals

public class Conditionals {
    public static void main(String[] args) {
        int age = 10;

        // if
        if (age >= 18) {
            System.out.println("You are old enough");
        }

        // if else
        if (age < 18) {
            System.out.println("You are a child");
        } else {
            System.out.println("You are an adult");
        }

        // if, else if, else
        if (age >= 80) {
            System.out.println("You are very old");
        } else if (age >= 60) {
            System.out.println("You are an adult");
        } else if (age >= 21) {
            System.out.println("You are a young adult");
        } else {
            System.out.println("You are still young");
        }
    }
}
