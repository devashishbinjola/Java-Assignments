package Java.BankManagementSystem;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Employee Management system :)");
        Developer d1=new Developer("Devashish",102,50000);
        Manager m1=new Manager("Prayag",101,60000);
        System.out.println(d1.getSalary());
        System.out.println(d1.calculateBonus());

        System.out.println(m1.getSalary());
        System.out.println(m1.calculateBonus());
    }
}