// import java.util.Scanner;
public class Patternin {
public static void main(String[] args) {
    //  Scanner sc = new Scanner(System.in);
    //  System.out.println("Enter row ");
    //  int row = sc.nextInt();
    int row =4;

    //  for (int i = 1; i <= row; i++) {
	//      for (int j = 1; j <=i ; j++) 
	// 		System.out.print("*");
	//      System.out.println();
	//  }


     
     	
		// for (int i = 1; i <= row; i++) {
		// 	for (int j = 1; j <= row-i; j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }


          
        // int rows = 4;


        // for (int i = rows; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // for (int i = 2; i <= rows; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



            int n=5;

        	 for (int i=0; i<n; i++){ 
             for (int j=n; j>i+1; j--) 
               System.out.print(" "); 
             for (int j=0; j<=i*2; j++ ) 
               System.out.print("*"); 
          System.out.println(); 
      } 
	  
		
	 }

}
    