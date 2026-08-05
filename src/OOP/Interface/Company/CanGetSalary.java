/*
Sen şunu fark ettin:

        "İkisi de metod yazmaya zorluyor"

Doğru! Ortak yanları bu. Ama:

Abstract class = "Bana benziyorsun, biraz da kendinden ekle"
Interface = "Sadece şu yetenekleri kazan, kim olduğun önemli değil"

Abstract class = "Yarısı hazır şablon"
Interface = "Sadece kurallar listesi"
*/

package OOP.Interface.Company;

// müşteriler maaş al"abilir"
public interface CanGetSalary {
    public void getSalary();
}
