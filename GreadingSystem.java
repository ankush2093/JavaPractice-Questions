
//ladder if else
import java.util.*;
public class GreadingSystem {
 
    public static void main(String[] args){
        // int m=79;

        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Your Marks");
        int m= sc.nextInt();  

        if(m>90){
            System.out.println("Grade A");
        }

        else if (m>80 && m<=90) {
            System.out.println("Grade B");

            
        }
        else if(m>70 && m<=80){
            System.out.println("Grade C");
        }
        else if (m>60 && m<=70){
            System.out.println("Grade D");

        }
        else{
            System.out.println("Fail");
        }
    }
}
 