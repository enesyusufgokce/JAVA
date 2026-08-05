package OOP.Constructor;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("mitsubishi", 2003);
        // c1.model ="Nissan";  // her bir class'ı new leyip elde ettiğimiz object için java tarafından default
        // olarak aranan bir constructor var. Her bir class, instance üretmeden önce bu constructor'ı
        // çalıştırıyor.
        c1.model = "nissan";  // demesek mitsubishi yazardı
        c1.printCar();  // producingYear ı yazdırmadı çünkü onu c1 için eklemedik ve 1. constructor un içine
                        // girdi pe printCar methodunun içindeki producingYear a default 0 verdi
                        // 2003 yazınca 2.constructor a girdi ve orda da producionYear old. için onu yazdırabildi
    }
}
