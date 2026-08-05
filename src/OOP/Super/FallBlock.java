package OOP.Super;

public class FallBlock extends MovingArea{

    private double slope;

    public FallBlock(int x, int y, int z){
        super(x,y,z);
    }

    public FallBlock(int x, int y, int z, double slope){
        super(x, y, z);  // super benden x y z bekliyo.       super.x y z falan yazamamamızın nedeni onların private olması. başka sebepten değil.
        this.slope = slope; // ama eğim bizim kendi class ımızın. buraya ben this.slope yazarım.
        // yapıyı hazırlarken önce parent class ın temelini kurarız, sonra istersek child
        // class için ayrıca özellikler ekleyebiliriz.
    }
    @Override
    public void bringCoordinates(){
        // private olan x y z pointlere erişebilmek için getterleri yazdık ve onları çağırırız erişmek istersek
        // super i kullanınca getter setterlere burası için gerek kalmadı
        super.bringCoordinates();
        System.out.println("Slope: " + slope);  // burda override etme amacımız ekstradan özellik eklemek
    }
}


/*
Harika bir ayrım yakaladın! Aslında super(...) ile o değerlere erişmedin, sadece onları teslim ettin.
Bu ikisi arasındaki farkı anlamak, Java'daki miras (inheritance) mantığını tamamen çözmeni sağlar.

Şu tabloya bir göz atalım:
Yöntem               Ne Yapmış Olursun?                             Yetki Durumu
-> super(x, y, z)    Değerleri paketleyip parent class'ın constructor'ına "Al bunları, sen ayarla" dersin.
İçerideki private değişkeni yine de göremezsin.
-> Getter / Setter    Oluşturulmuş bir nesnenin içindeki değerleri okumak veya sonradan değiştirmek için kullanırsın.
private değişkenlere güvenli bir kapıdan erişirsin.
*/