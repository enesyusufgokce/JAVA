package FinalExamSummary.toString;

public class Personel {

    private String name;
    private int age;

    public Personel(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name: " + name + " Age: " + age;
    }
}
