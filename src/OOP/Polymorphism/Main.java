package OOP.Polymorphism;

import OOP.Interface.AnotherEx.A;

public class Main {
    public static void main(String[] args) {
        Kumtel kumtel1 = new Kumtel();  // sol taraf bu objectin ne yapabileceğini belirler, sağ taraf ise hangi
        // class ın objecti olduğunu belirler.
        kumtel1.cool();
        kumtel1.heat();
        // cool ve heat geliyor. ama ben bunu sadece ısıtıcı olarak kullanabilirim. so:
        Heater kumtel2 = new Kumtel();
        kumtel2.heat();  // yalnızca heat gelir, cool gelmez. çünkü yalnızca Heater deki methodlara
        // erişmene izin verir. yani o bir kumtel olsa da heater olarak davran diyor.
        // kumtel hem bir heater dir, hem bir cooler dir, hem de kumtel dir

        Room room1 = new Room();
        House house1 = new House(room1);
        room1.heatRoom(kumtel1);  // kumtel2 dediğimde hata verdi. çünkü room1 bir Room dur ve Room daki
        // heatRoom methodu parametre olarak Kumtel referans tipi (objecti değil dikkat et) bekliyor.
        // bu yazı, Room daki heatRoom için geçerliydi. biz şimdi Kumtel değil de Heater referans nesnesi
        // istediğimiz için  --public void heatRoom(Heater heater)--  şuan kumtel2 demenin bir sakıncası yok

        room1.heatRoom(kumtel1);  // room1.heatRoom bir heater bekliyor. kumtel zaten bir heater olarak
        // ifade edildiği için Heater kumtel1 olmasa da olur. Kumtel den zaten heater
        // hethodlarına erişebiliyoz implements Heater diyerek

        // Burada sol taraf (Heater) Java'ya "bu referansı sadece bir Heater olarak gör" diyor.
        // Yani derleyici (compiler), kumtel2 üzerinden sadece Heater interface'inde / class'ında tanımlı
        // method'lara erişmene izin verir.

        AirConditioning airConditioning1 = new AirConditioning();
        room1.heatRoom(airConditioning1);  // odamı klima ile ısıtmaya karar verdim istesem kumtelle de ısıtırdım

        Stove stove1 = new Stove();
        Heater stove2 = new Stove();
        stove1.heat(); // Stove deki blabla ya erişebilir
        stove2.heat(); // bu erişemez. bcz reference object i Heater dir ve heater olarak kullanılır Stove olsa da
        stove1.blabla();
        room1.heatRoom(stove2);
        room1.heatRoom(stove1); // reference type i Heater olmamasına rağmen hata vermedi. çünkü implements
        // heater dediğimiz için bu bir heater olarak da kullanılabilir. çünkü her stove bir heater dir aslında,
        // klima da öyle(istesek heater olarak kullanırız yani). ama her heater stove değildir.
        // (upcasting downcasting var bunun için)
        // sobayı serinletici olarak kullanamıyoz. bcz. implements ile o özelliği eklemedik
        Cooler kumtel = new Kumtel();
        kumtel.cool();  // kumtel in sadece cooler özelliği geldi

        Stove stove3 = (Stove) stove2;
        stove3.blabla();  // artık Stove olduğu için(Heater idi)blabla ya erişebildi

        ((Heater)airConditioning1).heat();  // klimanın ısıtıcı özelliğini kullanıyoz
    }
}
// note: polymorphism class lar için de interfaceler için de geçerli

//It is always possible to convert a subclass to a superclass. her soba ya da klima bir ısıtıcıdır hesabı
//Explicit casting must be used when casting an object from a superclass to a subclass. her ısıtıcıyı soba olarak
// almak istiyosak
//This type of casting may not always succeed.