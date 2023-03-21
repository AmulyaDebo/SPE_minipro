package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {
        disableWarning();
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;


        int choice;

        while (true) {
            System.out.println("Scientific Calculator Program. \n Choose operation:");
            System.out.print("1. Factorial\n2. Square root\n3. Power\n4. Natural Logarithm\n" +
                    "5. Exit\nEnter your choice: ");

            choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // Square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is : " + calculator.squareRoot(number1));
                    System.out.println("\n");


                    break;
                case 3:
                    // Power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(number1 + " raised to power " + number2 + " is : " + calculator.power(number1, number2));
                    System.out.println("\n");
                    break;
                case 4:
                    // Natural log
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Natural log of " + number1 + " is : " + calculator.naturalLog(number1));
                    System.out.println("\n");

                    break;
                 case 5:
                   
                    System.out.println("Exiting....");
                 

                    break;
                default:
                    System.out.println("Invalid option....");
                    return;
            }
        }
    }


    public double factorial(double number1) {

        if(number1 < 0){
            logger.info("Factorial of negative number is not possible!");
            return Double.NaN;
        }

        else{
            logger.info("[FACTORIAL] - " + number1);
            double fact = 1;
            for(int i = 1; i <= number1; i++){
                fact *= i;}
             logger.info("[RESULT - FACTORIAL] - " + fact);
            return fact;}
    }



    public double squareRoot(double number1) {
        logger.info("[SQ ROOT] - " + number1);
        double result = Math.sqrt(number1);
            logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }


    public double power(double var1, double var2) {
        logger.info("[POWER - " + var1 + " RAISED TO] " + var2);
        double result = Math.pow(var1,var2);
         logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double naturalLog(double number1) {
        double result = 0;
        if(number1<0)
        {
            logger.info("Natural Logarithm is not defined for negative numbers");
            return Double.NaN;
        }
        else {
            logger.info("[NATURAL LOG] - " + number1);
        result =  Math.log(number1);
        logger.info("[RESULT - NATURAL LOG] - " + result);

        return result;}
    }
    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }
}
