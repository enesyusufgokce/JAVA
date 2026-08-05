package OOP.Abstraction.RegionEx;

// Hata şundan kaynaklanıyor: Region sınıfının default (parametresiz) constructor'ı yok, sadece
// Region(int x, int y, int z) constructor'ı var. Java'da bir alt sınıf (subclass) oluşturulduğunda, sen
// yazmasan bile derleyici otomatik olarak üst sınıfın parametresiz constructor'ını çağırmaya çalışır
// (super() şeklinde). Ama Region'da parametresiz constructor olmadığı için derleyici hata veriyor.

// Çözüm 1: Alt sınıfa constructor ekle ve super(...) çağır  -  bunu yaptım şimdi
// Çözüm 2: Region'a parametresiz constructor ekle

public class BlockUpDownRegion extends Region {

    public BlockUpDownRegion(int x, int y, int z){
        super(x, y, z);
    }

    @Override
    public void execute(){
        System.out.println("up down");
    }
}

/*
1 - BlockUpDownRegion(5, 10, 15) constructor'ı çalışmaya başlar.
2 - İçinde super(5, 10, 15) var → Region'ın (int, int, int) constructor'ı çağrılır.
3 - Region constructor'ı çalışır: this.x = 5; this.y = 10; this.z = 15;
4 - Region constructor'ı biter, kontrol BlockUpDownRegion constructor'ına döner.
5 - BlockUpDownRegion constructor'ında başka bir şey yoksa, o da biter.
6 - Nesne hazır.
*/