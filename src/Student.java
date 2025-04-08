public class Student {
    private String name;
    private String id;
    private int credits;

    public Student(String StudentName, String StudentId, int availableCredits) {
        name = StudentName;
        id = StudentId;
        credits = availableCredits;
    }
    public String getName(){
        return name;
    }
    public String getId(){
    return id;
    }
    
    public int getCredits(){
    return credits;
    }
    public void changeName(String replacementName){
        name= replacementName;
    }
    
    public void addCredits(int additionalPoints){
        credits += additionalPoints;
        System.out.println(credits);
    }
    public String getLoginName(){
    return name;
    }
    
    public void print(){
     System.out.println("Student Name: " + name);
     System.out.println("Student ID: " + id);
        System.out.println("Student Credits: " + credits);
    }
}