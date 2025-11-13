package ie.atu.encapsulation;

public class Grade {
    private String Studentname;
    private int numericgrade;
    private String CourseCode;

    public Grade(int Grade, String name, String code){
        Studentname=validateStudentName(name);
        numericgrade=validateGrade(Grade);
        CourseCode=validateCode(code);
    }

    private String validateStudentName(String input){
        if (input.isEmpty()) {
            return "Unknown";
        } else {
            return input;
        }
    }

    private int validateGrade(int input){
        if (input>=0&&input<=100) {
            return input;
        } else {
            return 0;
        }
    }

    private boolean validateCourseCodeHasNumLetter(String input){
        if (input.matches(".*\\d.*")&&input.matches(".*[A-Za-z].*")) {
            return true;
        }else{
            return false;
        }
    }

    private boolean validateCCodeLength(String input){
        if (input.length()==5) {
            return true;
        } else {
            return false;
        }
    }
    
    private String validateCode(String input){
        if (validateCourseCodeHasNumLetter(input)&&validateCCodeLength(input)) {
            return input;
        } else {
            return "Invalid Code";
        }
    }
    public String getCourseCode(){
        return CourseCode;
    }
    public String getStudentName(){
        return Studentname;
    }
    public int getGrade(){
        return numericgrade;
    }

    public void setStudentName(String Student){
        Studentname=validateStudentName(Student);
    }
    public void setCode(String Code){
        CourseCode=validateCode(Code);
    }
    public void setGrade(int Grade){
        numericgrade = validateGrade(Grade);
    }
    
}
