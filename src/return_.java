// method seviyesindeki scope dan çıkıyo ve methodun çağırımı tamamen bitiyor

public class return_ {
    public static void main(String[] args) {
        for (int j = 0; j < 20; j++) {
            for (int i = 0; i < 10; i++) {
                if (i > 5) {
                    return;
                }
                System.out.println(j + " " + i);
            }
            System.out.println("the program is over");  // did not print because it exited from the method,
        }                                               // not just the scope which contains the return statement
    }
}
