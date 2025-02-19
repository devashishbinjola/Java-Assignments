package Java.MulipleRoles;

public class SoftwareEngineer implements Developer,Tester{
    @Override
    public void writeCode() {

        System.out.println("My work is to write code");
    }

    @Override
    public void testSoftware() {

        System.out.println("My work is to test the code");
    }
}
