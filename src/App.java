public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Name StudentName = new Name("John", "Doe", "Smith");
        StudentId JohnStudentId = new StudentId("24030474");
        
        System.out.println("Student ID: " + JohnStudentId.getYear());
        System.out.println("Student Name: " + StudentName.getFullName());


        Student realStudent = new Student(StudentName, JohnStudentId, 30);
        
        realStudent.getName();
        realStudent.addCredits(3);
    }
    
}
