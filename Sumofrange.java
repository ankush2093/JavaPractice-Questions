import java.util.Scanner;

public class Sumofrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 1ST Range");
        int num1 = sc.nextInt();
        System.out.println("Enter Your 2ND Range");
        int num2 = sc.nextInt();
        int Sum = 0;
        for (int i = num1; i <= num2; i++) {

            Sum = Sum + i;

        }

        System.out.println(Sum);

        // int a = 5;
        // int b = 10;

        // int sum = 0;

        // for (int i = a; i <= b; i++)
        // sum = sum + i;
        // System.out.println("The sum is " + sum);
        
    }
}
