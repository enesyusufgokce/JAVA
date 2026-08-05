// examining the byte codes

public class if_vs_switch {
    public static void main(String[] args) {
        int age = 8;
        if (age == 18){
            System.out.println("your age is 18");
        }
        else if (age == 25){
            System.out.println("your age is 25");
        }
        else {
            System.out.println("what is your age !!!");
        }

        switch (age) {
            case 18:
                System.out.println("your age is 18");
                break;
            case 25:
                System.out.println("your age is 25");
                break;
            default:
                System.out.println("what is your age !!!!!!");
        }
    }
}
