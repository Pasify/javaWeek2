public class Student {
    private Name name;
    private StudentId id;
    private int credits;

    public Student(Name StudentName, StudentId StudentId, int availableCredits) {
        name = StudentName;
        id = StudentId;
        credits = availableCredits;
    }
    public String getName(){
        return name.getFullName();
    }
    public String getId(){
    return id.getId();
    }
    
    public int getCredits(){
    return credits;
    }
    // public void changeName(String replacementName){
    //     name= replacementName;
    // }
    
    /*
     * changeName method
     * This method changes the name of the student to a new name.
     * It takes a string as an argument and sets the name of the student to that string.
     */
    public void changeFirstName(String replacementFirstName) {
        name.setFirstName(replacementFirstName);
    }
    public void changeSecondName(String replacementSecondName) {
        name.setSecondName(replacementSecondName);
    }
    public void changeLastName(String replacementLastName) {
        name.setLastName(replacementLastName);
    }
    public void addCredits(int additionalPoints){
        credits += additionalPoints;
        System.out.println(credits);
    }
    public String getLoginName(){
    return name.getFirstName().substring(0,2) + id.getYear().substring(0, 3);
    }
    
    public void print(){
     System.out.println("Student Name: " + name);
     System.out.println("Student ID: " + id);
        System.out.println("Student Credits: " + credits);
    }
}