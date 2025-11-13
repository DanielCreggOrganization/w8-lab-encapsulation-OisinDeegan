package ie.atu.encapsulation;

public class Main {
    public static void main(String[] args) {

        /* 
        Student stu = new Student(null, 0, 0);
        
        System.out.println(stu);
        */
        SecretMessage secret = new SecretMessage();

        System.out.println(secret.getMessage());

        Temperature temp = new Temperature();

        temp.setCelsius(23.4);

        System.out.println(temp.getCelsius());

        Grade gra=new Grade(-69, "", "LONG AS I CAN BE BOTHERED TO TYPE, RAAAGH");
        System.out.println("Name: "+gra.getStudentName());
        System.out.println("Grade: "+gra.getGrade());
        System.out.println("Course Code: "+gra.getCourseCode());
        

    }
}
