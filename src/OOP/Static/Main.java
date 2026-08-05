// staticler, class a aittir, objectlere değil. o yüzden ortak bir yerden erişilir

// static variables
// static methods
// static blocks

// static yapılar sadece bir kez oluşur

// static variables or methods, non-static yerlerden çağrılabilir ama non-static variables or methods static
// static yerlerden çağrılamazlar. çünkü non-static ler için object gerektiği için (new le yapıyon zaten)
// object varken staticleri çağırmada sıkıntı yok ama static yerlerde nesne gerekemdiği için ama non-staticler
// için nesne gerektiği için
// nesne olmadan çağırmaya çalışma durumu oluşabilir. o yüzden static yerlerden non-static ler çağrılamaz.

// "Non-static'lerden static'ler çağrılabilir" ne demek o zaman?
//Bu kural bir method'un içinden başka bir şey çağırma durumu için
package OOP.Static;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        // counter1. dediğimizde staticCounter gelmiyor. because it is a static variable and can be accessed
        // from the class. not objects;
        Counter.staticCounter = 2;
        counter1.staticCounter = 5;

        Counter counter2 = new Counter();
        counter2.increaseCounter();  // increaseStaticCounter ı göstermedi . diyince çünkü o bir static counter.
        // fakat non-static lerden staticlere erişilebildiği için increaseStaticCounter i desek de sorun
        // çıkarmaz. çünkü kurala uyar. ama sanki Counter.increaseStaticCounter demişiz gibi davranır.
        // çünkü nesneye ihtiyacı yok. sadece class a bakar

        counter1.increaseCounter();
        counter1.increaseCounter();
        counter1.increaseCounter();
        counter2.increaseCounter();
        counter2.increaseCounter();
        counter2.increaseCounter();

        counter1.increaseStaticCounter();
        counter1.increaseStaticCounter();
        counter1.increaseStaticCounter();
        counter2.increaseStaticCounter();
        counter2.increaseStaticCounter();
        counter2.increaseStaticCounter();
        // counter1 için de counter2 için de ortaktır. bu yüzden tek bir tane oluştuğu için onun üstüne ekler

        System.out.println(counter2.counter);
        System.out.println(counter1.counter);
        // ayrı ayrı yazar. çünkü her object in sayacı kendinedir.
        // ama staticler öyle değil. saticler bir kere oluşur ve ortaktır.
        System.out.println(Counter.staticCounter);

        Counter.printStaticCounter();
        Counter.printStaticCounter();
        new Car();
        Counter.printStaticCounter();
        Counter.increaseStaticCounter();
        Counter.printStaticCounter();
    }
}
// nottt: constructordaki method, class ı oluşturduğumuz zaman çağrılır direkt.
// note: static fields or methods are called when we call the relevant class. yani static yapılar, ilk erişim
// olduğu esnada ram da bir kere oluşan ve direkt class name ile çağrılan yapılardır.

// NOTE: static methods cannot be overrided. because we are calling static methods via Class name, not field
// name.