package constrauctor.java;

public class Demo {
    public static void main(String[] args) {
        //Creating Objects
        Student st1;//Student type of class and st1 is a container variable
        st1 = new Student();
        st1.studentName = "RAM";
        st1.studentId = 123;
        st1.studentCity = "DEHLI";

        st1.study();//calling function
        st1.showFullDetails();


        Student st2 = new Student();
        st2.studentId=20076;
        st2.studentName="Ankush";
        st2.studentCity="Begusarai";

        st2.study();
        st2.showFullDetails();


    }
}



