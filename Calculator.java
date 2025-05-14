import java.util.Scanner;
import java.io.IOException;
 class Calculation {
    Scanner sc = new Scanner(System.in);
    public void add(){
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        int add = firstNumber + secondNumber;
        System.out.println("Addition number is: " + add);
    }
    public void subtract(){
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        int subtract = firstNumber - secondNumber;
        System.out.println("Subtraction is: " + subtract);
    }
    public void multiply(){
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        int multiply = firstNumber * secondNumber;
        System.out.println("Multiplication is: " + multiply);
    }
    public void divide(){
        try{
        System.out.println("Enter Divison number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter Divider number: ");
        int secondNumber = sc.nextInt();
        if(firstNumber % secondNumber == 0){
            int divide = firstNumber / secondNumber;
            System.out.println("Division is: " + divide);
        }
        else if(firstNumber > secondNumber){
            double divide = ((double) firstNumber / secondNumber);
            System.out.println("Division isn't proper : " +divide);
        }
        else{
            throw new RuntimeException("Divison isn't proper!! Please change " + firstNumber );
            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage()+ "Enter First number again: ");
            int firstNumber = sc.nextInt();
        }
    }
}
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: For addition");
        System.out.println("Enter 2: For Subtraction");
        System.out.println("Enter 3: For Multiplication");
        System.out.println("Enter 4: For Divison");
        System.out.println("Enter any number: ");
        int value = sc.nextInt();
        Calculation calculator = new Calculation();
            switch (value) {
                case 1:
                    calculator.add();
                    break;

                case 2:
                    calculator.subtract();
                    break;

                case 3:
                    calculator.multiply();
                    break;

                case 4:
                    calculator.divide();
                    break;

                default:
                    System.out.println("Invalid value, Enter Again!!!!");
                    break;
            }
    }
}

