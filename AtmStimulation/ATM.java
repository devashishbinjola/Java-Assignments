package Java.AtmStimulation;
public class ATM {
    private double balance;

    public ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException{
//        if(checkLowBalance(amount)){
//            throw new InsufficientFundsException("Your balance is low");
//        }else {
//            balance-=amount;
//            System.out.println("After Withdrawl, the balance is: "+balance);
//        }
        if(!checkLowBalance(amount)){
            balance-=amount;
        System.out.println("After Withdrawl, the balance is: "+balance);
        }
        else {
            throw new InsufficientFundsException("Your balance is low");
        }

    }
    public void deposit(int amount){
        balance +=amount;
        System.out.println("After Deposit, the balance is: "+balance);
    }
    public double getBalance(){
        return balance;
    }
    public boolean checkLowBalance(int amount){
        if(balance<=0 || balance<amount){
           return true;
        }
            return false;

    }
}
