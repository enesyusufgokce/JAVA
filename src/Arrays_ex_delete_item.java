import java.util.Scanner;

public class Arrays_ex_delete_item {
    public static void main(String[] args) {
        int[] myArr = {1,2,3,4,5};
        int[] newArr = new int[myArr.length - 1];  // assume we can delete only one item

        for (int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which number you want to delete");
        int deleteNumber = scanner.nextInt();
        for (int i = 0, k = 0; i < myArr.length; i++){
            if (myArr[i] != deleteNumber){
                newArr[k++] = myArr[i];
            }
        }
        for (int i = 0; i < newArr.length; i++) System.out.print(newArr[i] + " ");
    }
}
