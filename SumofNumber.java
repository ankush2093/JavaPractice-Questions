import java.util.Scanner;

public class SumofNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int num = sc.nextInt();
        int sum = 0;
        // 55 = 10;
        // 66=12;
        // loop to find sum of digits
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        // output
        System.out.println("Sum of digits : " + sum);
    }

}
