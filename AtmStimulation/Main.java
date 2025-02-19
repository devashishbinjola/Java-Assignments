package Java.AtmStimulation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InsufficientFundsException {
//        Scanner sc= new Scanner(System.in);
//        ATM user=new ATM();
        System.out.println("Welcome to our ATM");
//        System.out.println("Press 1: For Balance \n Press 2: For Deposit \n Press 3: For withdraw");
//        int key= sc.nextInt();
//        int n=1;
//        while(n==1){
//            switch(key){
//                case 1:
//                    if(user){
//
//                    }
//                    System.out.println("Balance: "+ user.getBalance());
//            }
//        }
        ATM user = new ATM(10000);
        System.out.println(user.getBalance());
        user.withdraw(500);
        user.deposit(500);
        user.withdraw(10001);

    }
}