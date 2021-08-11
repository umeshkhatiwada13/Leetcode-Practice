import java.util.Scanner;

public class ReverseInteger {
    public static int reverseInt(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
            System.out.println("Reverse is " + rev);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int a = sc.nextInt();
        System.out.println("Original Number is " + a);
        int rev = reverseInt(a);
        System.out.println("Reverse number is " + rev);
    }
}
