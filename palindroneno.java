import java.util.*;

class palindroneno {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        int n = 457;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("Out put :- Palindrome number ");
        else
            System.out.println(" Out put :not A Palindrome Number");
    }
}