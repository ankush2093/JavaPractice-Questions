import java.util.Scanner;

public class ReverseofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your value");
        int num = sc.nextInt();

        int  rev = 0;

        // output
        System.out.println("Reversed Number: " + getReverse(num, rev));
    }

    static int getReverse(int num, int rev) {
        if (num == 0)
            return rev;

        int rem = num % 10;
        rev = rev * 10 + rem;

        return getReverse(num / 10, rev);
    }
}