// import java.util.Scanner;

// public class GreatestNuminThree {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter Your 1st Number");
//         int num1 = sc.nextInt();
//         System.out.println("Enter Your 2nd Number");
//         int num2 = sc.nextInt();
//         System.out.println("Enter Your 3rd Number");
//         int num3 = sc.nextInt();

//         if (num1 > num2 && num1 > num3) {
//             System.out.println("Greatest Number is;---" + num1);

//         } else if (num2 > num1 && num2 > num3) {
//             System.out.println("Greatest Number is;---" + num2);

//         } else if (num3 > num1 && num3 > num2) {
//             System.out.println("Greatest Number is;---" + num3);

//         }

//         else {
//             System.out.println("All are Equal ");
//         }

//     }
// }

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class GreatestNuminThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter Your 2nd Number");
        int b = sc.nextInt();
        // System.out.println("Enter Your 3rd Number");
        // int c = sc.nextInt();
        int x = 7, y = 4, z = 10, o = 33;

        // for two numbers
        System.out.println(Math.min(a, b));
        System.out.println(Math.min(9, 4));

        System.out.println(Math.max(x, Math.max(y, Math.max(z, o))));

        System.out.println(min(x, min(y, min(z, o))));

    }
}
