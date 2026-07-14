// Java Math class

public class JavaMath {
    public static void main(String[] args) {
        // Finding max and min of two
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(23, 67));

        // Absolute value
        System.out.println(Math.abs(-10)); // |-10|

        // Square root
        System.out.println(Math.sqrt(225)); // square root of 225

        // Powers
        System.out.println(Math.pow(2, 5)); // 2^5

        // Rounding
        System.out.println(Math.round(4.6)); // Round to the nearest whole number
        System.out.println(Math.ceil(4.1)); // Round up
        System.out.println(Math.floor(3.9)); // Round down

        // Random numbers
        System.out.println(Math.random()); // Random between 0-1
        int randomInt = (int) Math.floor(Math.random() * 11);
        System.out.println("Random between 0 and 10 inclusive: " + randomInt);
    }
}
