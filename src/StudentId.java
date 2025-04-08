public class StudentId {
    private String id;

    public StudentId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getYear() {
        return "20" + id.substring(0, 2);
    }
}
