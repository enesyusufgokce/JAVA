package OOP.AccessModifiers;

/*
                        default     private     protected    public

same class       :        yes         yes           yes       yes

same package     :        yes         no            yes       yes  // extend ettiğinde
subclass

same package     :        yes         no            yes       yes  // extend etmediğinde
non-subclass

different package:        no          no            yes       yes
subclass

different package:        no          no            no        yes
non-subclass

*/


import OOP.AccessModifiers.Model.Car;

public class Main extends Car{
    public void main(String[] args) {
        int a = rate;  // kapişş
        Car car1 = new Car();
        car1.color = "green"; // color a erişebildim nonsubclass olamsına rağmen. (açıklama aşada)
    }
}

/*
Sen Main sınıfı içinde bir Car nesnesi oluşturuyorsun: Car car1 = new Car();.
Burada Java şöyle düşünür: "Main sınıfı Car'ın bir alt sınıfı evet, ama car1
nesnesi Main'in bir örneği değil, doğrudan Car'ın bir örneğidir. Farklı pakette olduğumuz için
Car nesnesinin içindeki korumalı alana dışarıdan dokunamazsın."

3. Çözüm: Nasıl Erişebilirsin?
Eğer rate alanına erişmek istiyorsan, bunu bir nesne üzerinden değil, Main sınıfının
bir parçasıymış gibi kullanmalısın.
*/