// not: bir class a erişim olduğu zaman (new ile ya da new olmadan) static methodlar çalıştırılır.
// ama non-staticler için nesne gerek ve nesnenin ne zaman oluşacağı da belli değil
// bu durum hem methodlar hem de fieldlar için geçerli. static veya non-static olmasına bağlı yani.
package OOP.Static;

public class Counter {

    public int counter;
    public static int staticCounter;

    // static demedik çünkü sayacı artırmak için sayaç gerekli ya.
    public void increaseCounter(){
        counter++;
        // staticCounter++; diyebiliriz çünkü nonstaticlerden staticler çağrılabilir
    }

    public static void increaseStaticCounter(){
        staticCounter++;
        // counter++ diyemedik. çünkü staticlerden nonstaticler çağrılamaz. nonstaticler için object gerek ve
        // staticler bu gereksinimi karşılamıyor.
    }

    public static void printStaticCounter(){
        System.out.println(staticCounter); // staticten non-static hiçbir şeyi çağıramadığımız için counter
        // ı yazamadık hiç. direkt hata yani bu. uyarı falan değil
    }
}
