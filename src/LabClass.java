import java.util.*;

public class LabClass {
    private String instructorName;
    private String room;
    private String timeAndDay;
    private ArrayList<Student> studentsList;

    public LabClass() {
        instructorName = "Tempe wick";
        room = "Room 101";
        timeAndDay = "Monday 10:00";
        studentsList = new ArrayList<>();
    }

    public void enrollStudent(Student studentToEnroll) {
        studentsList.add(studentToEnroll);

    }
    // setters and getters

    public void setInstructorName(String instructorName) {
       this.instructorName = instructorName;
    }

    public void setRoom(String roomInfo) {
        room = roomInfo;
    }
    public int getNumberOfStudents() {
        return studentsList.size();
    }
    public void printList(){
        System.out.println("Lab class " + timeAndDay);
        System.out.println("Instructor: " + instructorName + " room: " + room);
        System.out.println("Class list:");

        for(Student currentStudents: studentsList){
            currentStudents.print();
        }
        System.out.println("Number of students: " + getNumberOfStudents());
    }

     public String labDetails()
    {
        String details = "Lab class " + timeAndDay +"\n"+ "Instructor: " + instructorName + "\n"
            + " room: " + room + "\n" + "Class list:" + "\n";
        for ( Student enrolledStudents : studentsList )
        {
            details = details + enrolledStudents.getName() + " " + enrolledStudents.getId() + "\n";
        }
        return details;
    }
    public boolean removeStudent(String name, String Id){
        int indexOfStudent = 0;
        for (Student studentToRemove : studentsList){
            if(name.equals(studentToRemove.getName()) && Id.equals(studentToRemove.getId())){
                studentsList.remove(indexOfStudent);
                System.out.println("successfully removed");
                return true;
            }
            indexOfStudent++;
        }   
        System.out.println("unable to remove student");
        return false;
    }
}