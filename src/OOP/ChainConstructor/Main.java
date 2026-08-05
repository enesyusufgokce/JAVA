package OOP.ChainConstructor;

public class Main {
    public static void main(String[] args) {
        Personel personel1 = new Personel("yusuf");
        Personel personel2 = new Personel("yusuf", "gökçe");
        Personel personel3 = new Personel("yusuf", "gökçe", 20);

        System.out.println(personel1);
        System.out.println(personel2);
        System.out.println(personel3);
        System.out.println(personel1.getAge());
    }
}
