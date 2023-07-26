import java.util.Scanner;

public class PrimeNumberCheck {
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();

    if(n%2==0)
    System.out.println("It is not Prime Number");
    else
    System.out.println("It is Prime Number");


   }
}
