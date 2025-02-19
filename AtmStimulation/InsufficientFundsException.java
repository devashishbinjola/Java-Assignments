package Java.AtmStimulation;
public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "Your balance is low";
    }
}
