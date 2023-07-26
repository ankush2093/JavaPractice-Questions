import java.util.Scanner;
         
public class SumofNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N mumbers");
        int n = sc.nextInt();
        // int sum=0;
        // for(int i=1; i<=n;i++ )
        // sum+=i;
        // System.out.println(sum);

        // Scanner sc =new Scanner(System.in);
        // System.out.println( "Enter N mumbers");
        // int n = sc.nextInt();
        // if (n > 0)
        // System.out.println("Positive Number");
        // else if (n < 0)
        // System.out.println("Negative Number");
        // else
        // System.out.println("Zero");

        // if(n%2==0){
        // System.out.println("Even");
        // }
        // else{
        // System.out.println("Odd");
        // }

        //     int sum=0;
        // for(int i =1; i<=n;i++){
        //    sum = sum+i;
        // System.out.println(sum);
        // }
        
            for(int i=1; i<=10; i++)
            {
                System.out.println(n*i);
            }

    }
}
