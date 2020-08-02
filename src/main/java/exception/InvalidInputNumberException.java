package exception;

/**
 * @author Max
 * @create 2020-08-03 0:13
 */
public class InvalidInputNumberException extends Exception {
    public InvalidInputNumberException() {
        super("Wrong Input，Input again");
    }
}
