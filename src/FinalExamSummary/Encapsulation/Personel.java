package FinalExamSummary.Encapsulation;

public class Personel {
    private int age;
    private String name;
    private String workingDepartment;

    public Personel(String name, int age, String workingDepartment){
        this.name = name;
        this.age = age;
        this.workingDepartment = workingDepartment;
    }
    public int getAge(){
        return age;
    }
    public String getWorkingDepartment(){
        return workingDepartment;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWorkingDepartment(String workingDepartment){
        this.workingDepartment = workingDepartment;
    }
}
