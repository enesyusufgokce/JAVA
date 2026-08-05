package OOP.ToString;

public class Personel {
    private String name;
    private int age;

    public Personel(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + " Age: " + age;
    }
}

/*
Neden override oldu: Java'da oluşturduğun her sınıf (sen yazmasan bile) aslında arka planda Object isimli
bir sınıftan türer. Object sınıfının içinde de zaten hali hazırda tanımlanmış bir toString() metodu vardır.
amacımız, object'i print ettiğimizde toString çalıştığı için yeni bir toString ile override ederek hash code'u
değil de istediğimiz çıktıyı yazdırsın istedik.
*/