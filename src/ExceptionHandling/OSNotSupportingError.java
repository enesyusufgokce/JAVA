// user defined exception
// bir şeyi throw edebilmek için throwable ı extend etmesi lazım.(Error bunu yapıyor ve biz de Error o extend ettik)
package ExceptionHandling;

public class OSNotSupportingError extends Error{  // kendimiz bir error türü yazdık. halihazırdaki Error dan
    // extend ederek

    public OSNotSupportingError(String message){
        super(message);
    }
}