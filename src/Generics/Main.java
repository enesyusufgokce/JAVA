// Generics are tho types:
// 1. Generic method
// 2. Generic class
// generics only work with objects, primitive types are not supported
// T -> Type, E -> Element, K -> Key, N -> Number, V -> Value, S, U,V -> 2nd, 3rd, 4th types
// (common usages, they are not necessary)
package Generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.money = 100;
        player.name = "yusuf";

        Location playerLocation = new Location();
        playerLocation.x = 1;
        playerLocation.y = 2;
        playerLocation.z = 10;

        Pair <Player, Location> firstPair = new Pair<>(player, playerLocation);
        firstPair.firstObject = player; // constructorda atadığımız için bu iki satır artık gereksiz
        firstPair.secondObject = playerLocation; // çünkü aynı değerleri tekrar atıyorlar

        User user = new User();
        user.name = "ömer";
        user.school = "TOBB Science High Scool";

        Pair <String, User>secondPair = new Pair<>("12345678912", user);
        secondPair.firstObject = "12345678912"; // constructorda atadığımız için bu iki satır artık gereksiz
        secondPair.secondObject = user; // çünkü aynı değerleri tekrar atıyorlar

        printPlayerLocation(firstPair);
        // printPlayerLocation(secondPair);  printPlayerLocation a gönderemiyorum. çünkü java bunun String
        // ve User ikilisi olduğunu biliyor. Player ve Location ikilisi olmadığı için java,, sen burda generic
        // bir yapı kullandın ve ben artık bunların türlerini senin bana verdiğin bilgiler aracılığıyla
        // biliyorum o yüzden senin burda bu methoda bunları gönderebilmenin imkanı yok diyo.

        // printPlayerLocation(secondPair);
        // patladık. generşic tam olarak burdaki sorunu çözmek için var
        // ben bu methoddaki pairin generics sayesinde hangi türleri alabileceğini belirteyim ki objectteki
        // belirsizliği çözebileyim
        // alttaki örnekte castlemek zorunda kaldığımız için runtimede karar vermek durumundayız. generics
        // sayesinde runtime de değil de compile time de kararını ver demiş oluyoz.

        ArrayList <String> a = new ArrayList<>();
        a.add("asdfghdfg");
        System.out.println(a);
        // a.add(1);  <String> diyince kızdı çünkü bizden sadece string bekliyo şuan. bunu yazmasaydık object
        // olarak farz eder ve istediğimiz türü ekleyebilirdik
    }

    public static void printPlayerLocation(Pair <Player, Location> pair){
        // casting maliyeti var sürekli
        // System.out.println(((Player)pair.firstObject).name); // firstObject ve secondObject in type ı Object idi
        // System.out.println(((Location)pair.secondObject).x); // ve castlemek zorundaydık
        System.out.println(pair.firstObject.name);
        System.out.println(pair.secondObject.x);
    }
}