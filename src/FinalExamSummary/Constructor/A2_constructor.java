package FinalExamSummary.Constructor;

public class A2_constructor {
    public int height;
    public String name;
    public String school;

    public A2_constructor(int height, String name){
        this.height = height;
        this.name = name;
    }

    public A2_constructor(int height, String school, String name){
        this.height = height;
        this.school = school;
        this.name = name;
    }
}
