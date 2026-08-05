package OOP.Inheritance.MultilevelInheritance;

public class Banana extends PeelableFruit{
    public void eatBanana() { // override ettiğimiz için peelFirst deki eat methodu, banana'nın içinden çağrılıyo
        peelFirst();
        // eat ı da direkt çağırabiliriz, çünkü banana peelableFruit u extend ediyo, peelableFruit de Fruit u
        // extend ediyor
    }
    @Override
    public void eat(){
        System.out.println("banana is eating");
    }
    @Override
    public void peelFirst(){
        System.out.println("banana is pealing");
        eat();
    }
}

/*
// Override superclass ın methodunu ezmektir
// superclass ın methodunun aynı isme, aynı return type'ına ve parametre listesine sahip olması gerekir
// final ve static işaretlenmemesi gerekir. bu methodlar override edilemezler.
// superclass abstract ise abstract class lar her zaman override edilmeli

// note: subclass larda, sadece superclass ın erişim belirleyicisiyle aynı ya da daha büyük erişim sağlayan erişim
// belirleyicilerini kulllanabiliriz.
ex: PeelableFruitteki peelFirst in access modifierini protected yaparsak, banana içinde override ederken
ya protected, ya da public kullanmak zorundayız. (yoksa mesela override ettiğimize erişemiyor olacağından
gidip de PeelableFruit teki methodu kullanmak durumunda kalacağı içindir sebep)
*/
