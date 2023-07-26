import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PrimeNumberRange {
    public static void main(System[] args);
    // System.out.println("Enter ")

    int min, max, flag = 0;
    Scanner sc = new (System.in);
    System.out.println("Enter Your Minimum Value");
    int min = in.nextInt();System.out.println("Enter Your Maximum Value")
    int max = in.nextInt();
    // int n = sc.nextInt();
    for(
    int n = min;n<max;n++)
    {
        for (int i = 2; i < n; i++) {
            if (n % i == o) {
                flag = 1;
                break;
            }
        }

        if (flag == o) {
            System.out.println(n + " ");
        }

    }

}
