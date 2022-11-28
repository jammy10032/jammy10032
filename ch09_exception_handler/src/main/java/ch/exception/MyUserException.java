package ch.exception;

/**
 * @author Jammy
 * @date 2021/7/9-14:05
 */
public class MyUserException extends Exception{

    public MyUserException() {
        super();
    }

    public MyUserException(String message) {
        super(message);
    }
}
