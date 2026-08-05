public class scopes {
    public static void main(String[] args){
        int var1 = 100;
        int var2 = 200;

        {
            int var3 = 300;
            System.out.println(var2);
            {
                int var4 = 400;
                System.out.println(var1);
                System.out.println(var4);
                // System.out.println(var5);  error
            }
            int var5 = 500;
            // System.out.println(var4);  error    -     // kendi scope una ve daha dışarıdakilere erişebilir
        }
        int var6 = 600;
        System.out.println(var6);
        // System.out.println(var3);  error   -   I can only reach 1, 2, and 6

    }
}
// the code will be read from top to bottom
// SCOPE UN DIŞINDA VE YUKARIDA KALAN VARİABLES LARA ERİŞEBİLİRİZ SADECE

/*
  multiple command line
 */