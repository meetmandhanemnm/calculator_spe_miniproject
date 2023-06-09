package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    // function to perform square root function
    public static double square_root(double a) {
        logger.info("In square_root function!!");
        return Math.sqrt(a);
    }

    // function to perform factorial
    public static int factorial(int a) {
        logger.info("In factorial function!!");
        int res = a;
        for(int i=a-1;i>=1;i--) {
            res *= i;
        }
        return res;
    }

    // function to perform natural log
    public static double natural_log(double a) {
        logger.info("In natural log function!!");
        return Math.log(a);
    }

    // function to perform power
    public static double power(double a, double b) {
        logger.info("In power function!!");
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Calculator!!\n");
        Scanner sc = new Scanner(System.in);
        int opt=1;
        while (opt != 5) {
            try {
                logger.info("Taking input from user");
                System.out.println("Enter a choice: \n1. Square Root\n2. Factorial\n3. Natural log\n4. Power\n5. Exit");
                opt = sc.nextInt();
                int a, b;
                double x, y;
                switch (opt) {
                    case 1:
                        System.out.println("Enter a number to perform square root:");
                        x = sc.nextDouble();
                        logger.info("CASE 1");
                        System.out.println("Square root of " + x + " is: " + square_root(x));
                        break;
                    case 2:
                        System.out.println("Enter a number to perform factorial:");
                        a = sc.nextInt();
                        logger.info("CASE 2");
                        System.out.println("The factorial of " + a + " is: " + factorial(a));
                        break;
                    case 3:
                        System.out.println("Enter a number to perform natural log:");
                        x = sc.nextDouble();
                        logger.info("CASE 3");
                        System.out.println("The natural log of " + x + " is: " + natural_log(x));
                        break;
                    case 4:
                        System.out.println("Enter a,b to perform power operation (a^b):");
                        x = sc.nextDouble();
                        y = sc.nextDouble();
                        logger.info("CASE 4");
                        System.out.println("Power operation " + x + " ^ " + y + " results in : " + power(x, y));
                        break;
                    case 5:
                        System.out.println("Thank you for using Calculator!!! BYE!!!!");
                        break;
                    default:
                        System.out.println("Please enter correct option\n");
                        break;
                }
            }
            catch(Exception e) {
                System.out.println("Invalid Input!! Please select the correct option!");
                sc.next();
            }
        }
    }
}
