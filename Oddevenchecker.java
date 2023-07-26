import java.util.*;

public class Oddevenchecker {
     public static void main(String[] args){
         
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter Your Num");
        int num= sc.nextInt();  

              
        if(num>0){
            if(num %2==0){
                System.out.println("Even");
            }

            else{
                System.out.println("odd");
            }
        }
            
       
    }
}
 