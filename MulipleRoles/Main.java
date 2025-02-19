package Java.MulipleRoles;

//Employee with Multiple Roles
//Create an interface Developer with:
//Method writeCode()
//Create another interface Tester with:
//Method testSoftware()
//Create a class SoftwareEngineer that:
//Implements both Developer and Tester.
//Overrides both methods.
//Demonstrate multiple inheritance by creating an instance.

public class Main {
    public static void main(String[] args) {
        SoftwareEngineer sa = new SoftwareEngineer();
        sa.writeCode();
        sa.testSoftware();

    }


}
