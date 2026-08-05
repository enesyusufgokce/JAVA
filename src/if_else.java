public class if_else {
    public static void main(String[] args){
        int num1 = 100;
        int num2 = 100;
        if(num1 == num2){
            System.out.println("yes, numbers are equal");
        }
        else{
            System.out.println("no, the numbers are not equal");
        }
        System.out.println("the program is finished");

        System.out.println("-------------------------------");

        if (num1 > num2){
            System.out.println("number 1 is greater than number 2");
        }
        else if(num1 < num2){
            System.out.println("number 1 is smaller than number 2");
        }
        else if(num1 == num2 + 1){
            System.out.println("number1 and number2 are not equal");
        }
        else{
            System.out.println("number 1 is equal to number 2");
        }
        String name1 = "yusuf";
        String name2 = "gökçe";
        if (name1 != name2){
            System.out.println(name1 + " " + name2);
        }
        boolean isstar = false;
        if(!isstar){  // if in çalışabilmesi için parantez içindeki değerin true olması gerek
            System.out.println("xx");
        }
        System.out.println("-----------------------------------");

        if (!(num1 < num2)){
            System.out.println("girdi");
        }
        System.out.println("the program finished");

        double num11 = 3.14;
        double num22 = 3.13;
        if (num11 == num22) System.out.println("girdi");
        else num11 = - num22;
        System.out.println(num11);

        String name = "Ömer";
        if (name == "Yusuf") {
            System.out.println("name is Yusuf");
        }
        else if (name == "Güler") {
            System.out.println("name is Aysu");
        }
        else if (name == "Fatih") {
            System.out.println("name is Tamer");
        }
        else {   // hiç yazmasak da olur mantıken
            System.out.println("name is neither Yusuf, nor Aysu, nor Enes");
        }
        System.out.println("the program finished");
    }
}

// ==
// !=
// < > <= >=
// !