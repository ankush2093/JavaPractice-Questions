import java.util.Scanner;

public class LeapyearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Year");
        int n = sc.nextInt();

        if (n % 4 == 0) {
            System.out.println("Leap Year");
        } else if (n % 100 == 0) {
            System.out.println("It is not leap Year");
        } else if (n % 400 == 0) {
            System.out.println(" leap year: ");
        } else {
            System.out.println("not leap year: ");
        }
    }
}
