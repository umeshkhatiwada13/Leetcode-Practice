import java.util.Scanner;

public class ReverseString {
    public static boolean reverseString(String x) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(x).reverse();
        sb1.append(x);
        if (sb.toString().equals(sb1.toString())) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        String a = sc.nextLine();
        System.out.println("Original String is " + a);
        System.out.println("Is Palindrome " + reverseString(a));
    }
}
