package exceptions;

public class NotFoundVendorException extends RuntimeException {

    public NotFoundVendorException() {
        super("Данный вендор не поддерживается");
    }
}
