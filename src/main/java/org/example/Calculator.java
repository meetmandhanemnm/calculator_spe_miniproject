package org.example;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static int add(int a, int b) {
        logger.info("In add function!!");
        return a+b;
    }

    public static int sub(int a, int b) {
        logger.info("In subq function!!");
        return a-b;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opt=1;

        while(opt!=3) {
            logger.info("Taking input from user");
            System.out.println("Enter a choice: \n1. Addition\n2. Subtraction\n3. Exit");
            opt = sc.nextInt();
            int a,b;
            switch (opt) {
                case 1:
                    System.out.println("Enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    logger.info("CASE 1");
                    System.out.println("The result is: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Enter two numbers:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    logger.info("CASE 2");
                    System.out.println("The result is: " + sub(a, b));
                    break;
            }
        }
    }
}
