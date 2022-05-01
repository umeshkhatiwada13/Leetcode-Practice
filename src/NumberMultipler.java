import java.util.Scanner;

public class NumberMultipler {
    // Given a number, return the product of all the digits
    // For example, if the number is 123, return 6 (1 * 2 * 3)
    // input number should be positive integer between 10 and n (inclusive)
    static int productGenerator(int number) {
        int firstNumber = number % 10;
        number = number / 10;
        return firstNumber * number;
    }

    public static void main(String[] args) {
        System.out.println("Please enter a number : ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        System.out.println("Multiplication of the number is "
                + productGenerator(inputNumber));
    }
}
