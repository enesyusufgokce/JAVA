package OOP.Super;

public class BlockUpDown extends MovingArea{

    public BlockUpDown(int x, int y , int z){  // parent class'ta default constructor u yazdığımız için hata
        // vermedi. yazmamış olsaydık parametreli constructor'u yazmamız gerkirdi. super yazınca parametreliyi
        // kullanmaya başlar
        super(x,y,z);
    }
}
/*
2. "Default Constructor" Neyi Kurtardı?
Önceki Durum: MovingArea içinde sadece parametreli constructor vardı. Java gizlice super();
(parametresiz olanı) çağırmaya çalışıyor ama karşılık bulamıyordu. Bu yüzden hata veriyordu.
Şimdiki Durum: MovingArea sınıfına boş bir public MovingArea(){} ekledik. Artık Java'nın gizlice
eklediği o super(); çağrısının gidebileceği bir adres var

3. Biz Zaten Parametre Atamadık mı?
BlockUpDown(int x, int y, int z) içine bu parametreleri yazdık ama
onları kullanmadık.

BlockUpDown constructor'ının parantez içindeki x, y, z değerleri sadece o constructor'a gelen
"hammaddelerdir". Eğer sen bu hammaddeleri super(x, y, z) diyerek yukarı (parent class'a) göndermezsen,
o değerler havada asılı kalır ve üst sınıfa asla ulaşmaz.
  required: int,int,int
  found:    no arguments   diyo hatta error kısmında
*/