package Java.BankManagementSystem;

public class Developer extends Employee {
    double bonus;
   public Developer(String name, int id,double salary){
       super(name,id,salary);
   }

    @Override
    double calculateBonus() {
       bonus= 0.1*getSalary();
        return bonus;
    }
}
