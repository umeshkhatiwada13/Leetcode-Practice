import java.util.Scanner;

public class BinaryMultiplicationCount {
    //Given two positive integers a and b, this method calculates binary multiplication of these two numbers
    // and counts the number of 1s in the binary product.
    public static int solution(int firstNum, int secondNum) {
        String binaryProduct = Integer.toBinaryString(firstNum * secondNum);
        System.out.println("Binary Product of given numbers " + binaryProduct);
        int total = 0;
        for (int i = 0; i < binaryProduct.length(); i++) {
            if (String.valueOf(binaryProduct.charAt(i)).equals("1")) total++;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Number of 1's in Binary product: " + solution(a, b));
    }
}
