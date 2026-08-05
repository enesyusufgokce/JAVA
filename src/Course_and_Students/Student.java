package Course_and_Students;

public class Student extends CourseMember{

    private double midterm;
    private double lab;
    private double final_;

    public Student(double midterm, double lab, double final_, String name, int id){
        super(name, id);
        this.midterm = midterm;
        this.lab = lab;
        this.final_ = final_;
    }
    public double calculateScore(){
        return 0.35 * midterm + 0.15 * lab + 0.5 * final_;
    }
    public String toString(){
        return toString() + "Midterm: " + midterm + "Lab: " + lab + "Final: " + final_ +
                "Score: " + calculateScore();
    }
}