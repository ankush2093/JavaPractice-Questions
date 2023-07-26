import java.util.*;

public class Switchstaement {
    public static void main(String[] arrr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Valid day i.e (MON,TUE,WED,THRU,FRI,SAT)");
       // String day= sc.nextInt(); 
        String day= sc.nextLine(); 
       // String day = "MON";
        switch (day) {
            case "MON":
                System.out.println("It is monday");
                break;
            case "TUE":
                System.out.println("It is tuesday");
            case "WED":
                System.out.println("It is Wesnesday");
                break;
            case "THRU":
                System.out.println("It is Thrusday");
                break;
            case "FRI":
                System.out.println("It is Friday");
                break;
            case "SAT":
                System.out.println("It is Saturday");
                break;

            default:
                System.out.println("Indvalid Choise");
        }

    }
}
