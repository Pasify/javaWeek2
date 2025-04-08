public class Name {
    private String firstName;
    private String lastName;
    private String secondName;

     /**
     *  Constructor for objects of class Name
     *  Only a first and last
     */
     public Name(String firstName, String lastName) {
         this.firstName = firstName;
         this.lastName = lastName;
     }
    
     /*
      * Constructor for objects of class Name
      * first, second and last
      */
     public Name(String firstName, String secondName, String lastName) {
         this.firstName = firstName;
         this.secondName = secondName;
         this.lastName = lastName;
     }

      // Getters
    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }

    public String getLastName() {
        return lastName;
    }
    
    // setters 
    public void setFirstName(String firstName) {
        this.firstName= firstName;
    }
    public void setSecondName(String secondName) {
        this.secondName= secondName;
    }
    public void setLastName(String lastName) {
        this.lastName= lastName;
    }

    public String getFullName() {
        String name = "";
        if (firstName != null) {
            name += firstName;
        }
        if (secondName != null) {
            name += " " + secondName;
        }
        if (lastName != null) {
            name += " " + lastName;
        }
        return name;
    }
}
