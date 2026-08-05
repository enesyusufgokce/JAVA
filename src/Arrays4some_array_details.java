public class Arrays4some_array_details {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = array1;

        int num1 = 10;
        int num2 = num1;
        num2 = 20;

        System.out.println(num1);
        System.out.println(num2);


        array2[1] = 3213;

        for (int i = 0; i < array1.length; i++){    // array2 de yaptığımız değişiklik array1 i de değiştirdi.
            System.out.print(array1[i] + " ");      // çünkü değerler değil adres kopyalandı
        }                                           // adresini değil de ana objeden bağımsız bir kopyasını
        System.out.println();                       // istersen  int[] array2 = array1.clone();  dersin
        for (int i = 0; i < array2.length; i++){
            System.out.print(array2[i] + " ");
        }

    }
}
