package ch.exception;

/**
 * @author Jammy
 * @date 2021/7/9-14:07
 *
 * 表示当用户的姓名有异常时，抛出NameException
 */

public class NameException extends MyUserException{
    public NameException() {
        super();
    }

    public NameException(String message) {
        super(message);
    }
}
