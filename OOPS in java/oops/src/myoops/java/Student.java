package myoops.java;

 class Student {
    ///data memebers i.e object
    int studentId;
    String studentName;
    String studentCity;
    //Behavior : member methods (function)
    public void study(){
        System.out.println(studentName+ "is studying");

    }
//making function i.e methods
    public void showFullDetails(){
        System.out.println("My name is" +studentName);
        System.out.println("My id is" +studentId);
        System.out.println("My city is"+studentCity);

}


    public class Demo{
        public static void main(String[] args) {
            ///Creating Objects
            Student st1;
            st1=new Student();
            st1.studentName="RAM";
            st1.studentId=123;
            st1.studentCity="DEHLI";

            st1.study();

        }
    }

}
