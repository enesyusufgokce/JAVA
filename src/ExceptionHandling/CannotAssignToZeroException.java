package ExceptionHandling;

// exception ennihayetinde bir catch exceptiondur. o yüzden uncheck olarak extend etmediğim sürece onu try catch
// içine almak zorundasın. ama biz runtime exception u extend ettiğimiz için sıkıntı yok
public class CannotAssignToZeroException extends RuntimeException{
    public CannotAssignToZeroException(String message){
        super(message); // tek parametreli parent constructoruna message parametresini gönderiyor
    }
}
