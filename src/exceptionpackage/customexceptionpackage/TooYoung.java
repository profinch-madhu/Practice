package exceptionpackage.customexceptionpackage;

public class TooYoung extends RuntimeException{
    public TooYoung(String message){
        super(message);
    }
}
