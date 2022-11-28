package ch.exception;

/**
 * @author Jammy
 * @date 2021/7/9-14:07
 *
 * 表示当用户的年龄有异常时，抛出NameException
 */

public class AgeException extends MyUserException{
    public AgeException() {
        super();
    }

    public AgeException(String message) {
        super(message);
    }
}
