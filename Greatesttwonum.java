import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.sound.sampled.SourceDataLine;

public class Greatesttwonum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your 1st Number");
        int num1 = sc.nextInt();
        System.out.println("Entert Yoyr 2nd Number");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Greatest Number is:--" + num1);

        }

        else if (num1 < num2) {

            System.out.println("Greatest Number is:--" + num2);
        }

        else {
            System.out.println("Both Are Equals");
        }

    }
}
