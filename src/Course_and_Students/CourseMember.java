package Course_and_Students;

public abstract class CourseMember {
    protected String name;
    protected int id;
    public CourseMember(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public abstract double calculateScore();
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

