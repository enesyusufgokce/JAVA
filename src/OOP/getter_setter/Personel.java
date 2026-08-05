package OOP.getter_setter;

public class Personel {
    private String name;
    private int age;
    private String workingDepartment;

    public Personel(String name, int age, String workingDepartment){
        this.name = name;
        setAge(age);  // constructor düzeyinde kontrol yapmak istersek bunu diyebiliriz
        this.workingDepartment = workingDepartment;
    }
    public String getName(){
        if(name.length() < 3){
            System.out.println("because the name is less than three letter, it returns null");
            return null;
        }
        return name.toUpperCase();
    }
    public int getAge(){
        return age;
    }
    public String getWorkingDepartment(){
        return workingDepartment;
    }
    public void setAge(int age){ // I aim to set the value, not returning. So I made it void
        if(age < 20){
            System.out.println("we don't employee children");
            return;
        }
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setWorkingDepartment(String workingDepartment){
        this.workingDepartment = workingDepartment;
    }
}