package Java.Calculator;

//Multiple Exception Handling in a Calculator
//Implement a calculator that:
//Accepts two numbers and an operation (+, -, *, /).
//Throws:
//ArithmeticException for division by zero.
//        IllegalArgumentException for invalid operations.
//Handle exceptions with try-catch.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Please Enter the operator");
       String op=sc.next();
       try {
            switch (op) {
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "/":
                    try{
                        System.out.println(a / b);
                    }catch (ArithmeticException e) {
                        System.out.println(e);
                    }
                    break;
                default:

                    throw new IllegalArgumentException("Illegal Operator");
            }
        }catch (Exception e){
           System.out.println(e);
       }

    }


}
