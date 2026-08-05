package OOP.Introduction;

public class Calculator {
    double total = 0;

    void add(int num1, double num2){ // static diyince static bir methoddan non-static bir context'e
        total = total + num1 + num2; // erişmeye çalıştığımız için hata verdi.
    }
    // method overloading
    void add(int num1){
        total += num1;
    }
    double returnValue(){
        return total;
    }
}

/*
Stack'teki verilere sadece o an çalışan metod erişebilir. Ama Heap'teki bir nesneye tüm metodlar
erişebilir. Nesneler her zaman Heap'te yaşadığı için, içindeki primitive'ler de mecburen Heap'te
yaşar (ex: total). Eğer her şey Stack'te (metodların içinde) olsaydı, bir metod bittiği an o metodun içindeki
tüm veriler yok olurdu. Heap teki değer, method bitse de silinmez.
Java gidiyor, Heap'teki o tek bir tane olan total kutusunu buluyor, içindeki değeri değiştiriyor. Kutunun
kendisi orada sabit durduğu için, sen daha sonra returnValue ile geldiğinde o kutuyu güncellenmiş buluyorsun.
*/

/*
Seni çok iyi anlıyorum, "Neden orası?" diye sorgulaman harika. Java'nın bu değişkeni Heap'e koymasının
tek bir sebebi var: Birliktelik. Java'da bir kural vardır: Nesneler (Objects) her zaman Heap'te yaşar.
*/

/*
staticler, objectler için ortaktır
ama instance variables ler farklı. her bir object in ram bölgesinde kendine özgü değeri oluyor
*/