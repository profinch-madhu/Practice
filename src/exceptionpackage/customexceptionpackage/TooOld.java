package exceptionpackage.customexceptionpackage;

public class TooOld extends RuntimeException{
    public TooOld(String message) {
        super(message);
    }
}
