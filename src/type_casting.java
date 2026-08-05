public class type_casting {
    public static void main(String[] args) {
        byte byteNum = 100;
        short shortNum = byteNum;  // byte nin alacağı tüm değerleri short da alabileceği için bunu bilinçsiz
                                    // olarak dönüştürebiliyoz. 100 olan byte yerine int yazınca hata veriyo
        int intNum = 1_000_000;
        long longNum = intNum;

        double doubleNum = 1000.4;
        float floatNum = (float) doubleNum;   // bilinçli casting
        double doubleNum2 = floatNum;
        float floatNum2 = (int) doubleNum2;
        float floatNum3 = intNum;

        long longNum2 = 12345678291232L;
        int intNum2 = (int) longNum2;
        //float floatNum2 = doubleNum2;       error. çünkü float, double ı kapsamaz. yaparsak bilinçli şekilde
        // (float) doubleNum2 dememiz gerekir. (int) doubleNum2 desek de oluyo. bilinçli casting

        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(doubleNum2);
        System.out.println(floatNum2);
        System.out.println(floatNum3);
        System.out.println(intNum2);

        int num2 = 1_000_000;
        short snum2 = (short) num2;
        System.out.println(snum2);    // 1 milyon vermedi çünkü bu değer short u aşıyor

        char yusuf = 'y';   // ys  yazaman, tek bir karakter yazmalıyım
        int chVal = yusuf;  // holds the numeric value of the letter y  (121)
        System.out.println(yusuf);
        System.out.println(chVal);

        int charVal = 10000;
        char gokce = (char) charVal;
        // char gokce = charVal;   int değeri, char ı aşıyor diye hata verdi
        System.out.println(gokce);

        int intnumber = 123;
        float number = intnumber;
        System.out.println(number);

        float floatnumber = 123.123456f;
        int integernumber = (int) floatnumber;
        System.out.println(integernumber);
    }
}
