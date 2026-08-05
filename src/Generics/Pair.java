package Generics;

// player in location unu bulmak istiyosan pairin birinci elementine player i, ikinci elementine
// locationu koyarsın
public class Pair <T, V> {  // birinci tür olarak T, ikinci tür olarak V
    public T firstObject;   // public Object firstObject; şeklindeydi. ama generic yaptık sonra
    public V secondObject;
// Pair i tamamen generic hale getirdik
    public Pair(T first, V second){  // constructor. int, String falan yazmıyoz da T, V yazıyoz.
        this.firstObject = first;
        this.secondObject = second;
    }
}

/*
Özet mantık
Generic'in tek cümlelik özü: "Belirsizliği (Object'in getirdiği belirsizliği) runtime'dan
compile-time'a çekmek." Yanlış türü koyarsan/verirsen program çalışmadan önce, derleyici sana söylüyor.
Cast'tan kurtuluyorsun, tür güvenliği kazanıyorsun.
*/