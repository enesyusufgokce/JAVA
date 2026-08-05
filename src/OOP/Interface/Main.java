// bir class, birden fazla interface'i implemente edebilir
// bir interface birden fazla interface'i extends edebilir
// tüm methodlar override edilip uygulanmalı

// abstraction'da bazılarını abstract, bazılarını normal yapabilirken interfaceler tamamen abstractlardı eskiden
// ama eklenen default keywordu bu özelliğini değiştirmiştir

// abstraction "-dır, -dir, -dur, -dür" anlamı katarken interfaceler çoğunlukla "-ebilir, -abilir" anlamı katar
package OOP.Interface;

import OOP.Interface.Company.Personel;
import OOP.Interface.Language.*;

public class Main {
    public static void main(String[] args){
        Personel personel = new Personel();
        personel.takeLeave();  // abstractiondan farkı ebilir, abilir anlamı katıyor

        Language language1 = new English();
        Language language2 = new Turkish();
        Turkish language3 = new Turkish();
        Language language4 = new Java();
        Java java1 = new Java();
        // Java ların bu durumu polymorphism dir. ya da Turkish in hem Turkish hem Language olması.
        ProgrammingLanguages language5 = new Java();

        language1.greed();
        language2.greed();
        language3.greed();
        language4.greed();
        language5.greed();

        language1.printed();
        language3.printed();
        language4.printed();
        java1.printed();
        java1.greed();
    }
}
