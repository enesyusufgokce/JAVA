package OOP.getter_setter;

public class Main {
    public static void main(String[] args) {
        Personel p1 = new Personel("Yusuf", 22, "Engineer");
        Personel p2 = new Personel("xy", 15, "Engineer");
        System.out.println(p1.getName());
        System.out.println(p2.getName());

        System.out.println(p1.getAge());
        System.out.println(p1.getWorkingDepartment());
        p1.setWorkingDepartment("Football Player");
        System.out.println(p1.getWorkingDepartment());
    }
}