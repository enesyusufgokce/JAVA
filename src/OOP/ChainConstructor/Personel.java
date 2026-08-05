package OOP.ChainConstructor;

public class Personel {

    private String name;
    private String surname;
    private int age;

    public Personel(String name){  //  , String surname
        this(name, "no surname");  // aynı class'da başka bir constructor u çağırmak için kullanılır
    }
    public Personel(String name, String surname){
        this(name, surname, 20); // altındaki constructor'ı çağırıyo
    }
    public Personel (String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;  // age yerine 5 desem, personel1.getAge() print edince 5 yazar. chain old. için
                         // adım adım ta bu constructor a ulaşıyor. (sadece 1 parametre ile constructor u
                         // çağırıp 1. constructordan başlayınca mesela)
    }

    public int getAge() {
        return age;
    }
    // this.name = name; (Assigning)
// this(name, surname, age); (Chain Constructor)
}

/*
1. constructor a surname parametresi almasını isteyip de o parametrenin kullanılacağı bir yer girmeyince
niye hata almadığımı merak ettim.

"Bu kapıdan girmek isteyen biri, elinde iki tane String getirmek zorundadır."

Java, içeri giren bu verileri sınıfın içine kaydedip kaydetmediğine bakmaz. Sen o surname bilgisini
içeri alıp sonra hiçbir şey yapmadan çöpe atabilirsin. Bu bir hata değil, sadece gereksiz kod (unused parameter)
kullanımıdır
*/