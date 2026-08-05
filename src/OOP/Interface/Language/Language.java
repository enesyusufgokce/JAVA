package OOP.Interface.Language;

public interface Language {

    // interfacede oluşturulan her variable default olarak public static final olarak gelir
    String a = "blabla";

    // interfacede oluşturulan her method default olarak public olarak gelir.
    // public void greed(); ile aynı şey
    void greed();

    // body si dolu kod yazmak için başına default keywordu getiririz
    default void printed(){
        System.out.println("printed in Language Interface");
    }

    // note: static methodlar, kendi yapıları gereği override edilemezler
    static void staticPrinted(){
        System.out.println("printed static in Language Interface");
    }
}