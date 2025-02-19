package Java.BankManagementSystem;

public class Manager extends Employee {
    double bonus;
    public Manager(String name, int id,double salary){
        super(name,id,salary);
    }

    @Override
    double calculateBonus() {
        bonus= 0.2*getSalary();
        return bonus;
    }
}
