// bir class tek başına bir anlam ifade etmiyorsa
// ama onun içindeki methodlar tekrar tekrar kullanılmasın diye ortak bir yapı niyetiyle de kullanılabiilir
// bir class'ı, bazı davranışları yapmaya zorlamak amacıyla da kullanılabilir

// note: abstact classes can not be instantiated (newleyemezsin)

package OOP.Abstraction;

import OOP.Abstraction.RegionEx.JumpRegion;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.makeSound("Aslan");

        Dog dog = new Dog();
        dog.makeSound("Gümüş");

        // Region region1 = new Region(1,2,3);  // region cannot be instantiateddddd

        JumpRegion jumpRegion1 = new JumpRegion(3,4,5);
        jumpRegion1.execute();
    }
}
