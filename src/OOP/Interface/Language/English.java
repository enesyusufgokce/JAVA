package OOP.Interface.Language;

// illa kelime olarak abilir ebilir gibi yaklaşmamız gerekmiyo. uluslararası anlaşma gibi düşünebilirsin.
// tr, yunanistan, ispanya imzaladı ve artık bu üçü, anlaşmaya uygun kalmak zorunda kalıyor.
// ingilizce de bir dil olduğu için dil in anlaşmasına, kurallarına uymak zorunda
public class English implements Language {

    @Override
    public void greed(){
        System.out.println("HELLO");
    }
}