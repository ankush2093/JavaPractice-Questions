import java.util.Scanner;

class PosivtiveNegaitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice");
        int num = sc.nextInt();
        // int num;

        if (num < 0)
            System.out.println("The Number is Negitive");
        else if (num > 0)
            System.out.println("The number is Positive");
        else
            System.out.println("Zero");

    }
}