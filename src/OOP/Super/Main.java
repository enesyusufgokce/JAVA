// kalıtım alan class, parent class'ın özelliklerine "super" keywordu ile erişebilir

package OOP.Super;

public class Main {
    public static void main(String[] args){
        FallBlock fallBlock = new FallBlock(1,1,1);
        FallBlock fallWithSlope = new FallBlock(1,1,1,0.5);
        BlockUpDown blockUpDown = new BlockUpDown(2,2,2);

        fallBlock.aaa();
        fallBlock.bringCoordinates();  // ilk başta 3 parametreli FallBlock constructor unda super(x,y,z)
        // yi yazmayı unutmuştum ve o yüzden xyz ye 111 diyince o 3 parametreli görünen(aslında parametresiz olan)
        // constructor u değil de moving areadaki {} olan boş(default) constructor u çağırdı. çünkü super(x,y,z)
        // olmayınca koordinatları olmayan, temeli atılmamış bir nesne oluyor. ve java override ettiğini değil,
        // en güvendiği yer olan parent class'ın methodunu çağırıyor
        fallWithSlope.bringCoordinates();
        blockUpDown.bringCoordinates(); // BlockUpDown da override etmediğimiz için parent class taki methodu çağırdı
    }
}