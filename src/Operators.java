// Java operators

/*
Can be:
1. Assignment
2. Comparison
3. Arithmetic
4. Logical
5. Bitwise
*/

public class Operators {
    public static void main(String[] args) {
        // Assignment
        int num1 = 5; // '=' operator
        num1 += 5; // num1 = num1 + 5
        num1 *= 2; // num1 = num1 * 2
        num1 /= 10; // num1 = num1 / 10
        num1 %= 2; // num1 = num1 % 2

        // Comparison
        boolean areEqual = (num1 == 7);
        boolean areNotEqual = (num1 != 7);

        // Arithmetic
        int num2 = 1 + 5;
        int num3 = 67 - 23;
        int num4 = 2 * 4;
        int num5 = 20 / 4;
        int num6 = 144 % 11;

        // Logical
        boolean notEqual = !(5 == 2);
        boolean bothTrue = (5 == 5) && (7 != 4);
        boolean eitherTrue = (5 != 5) || (7 == 4);

        // Bitwise (AND &, OR |, left shift <<, right shift >>)
    }
}
