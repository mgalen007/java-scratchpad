// Java arrays

public class Arrays {
    public static void main(String[] args) {
        // Syntax: type[] name = {elements}
        String[] names = {"Galen", "Mike", "Rugwiro", "Rubagumya"};
        // This is valid too
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Access elements by index
        System.out.println(names[2]); // 3rd
        System.out.println(numbers[0]); // 1st

        // Replacing elements
        names[1] = "Michael";
        System.out.println(names[1]);
        numbers[3] = 7;
        System.out.println(numbers[3]);

        // Getting the length
        System.out.println("Names length: " + names.length);
        System.out.println("Numbers length: " + numbers.length);
    }
}
