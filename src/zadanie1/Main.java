package zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

//        Scanner insertData = new Scanner(System.in);
//        Scanner insertString = new Scanner(System.in);
//
//
//
//        double a = 0;
//        double b = 0;
//        String c = "+";
//
//        try {
//            a = insertData.nextDouble();
//            c = insertString.nextLine();
//            b = insertData.nextDouble();
//            System.out.println("=");
//        }catch (InputMismatchException exception){
//            System.out.println("Tylko liczby!!");
//        }
//
//
//
//            if (c.equalsIgnoreCase("+")){
//                System.out.println(Calculator.sum(a,b));
//
//            }else if (c.equalsIgnoreCase("-")){
//
//                System.out.println(Calculator.difference(a,b));
//            }else if (c.equalsIgnoreCase("*")){
//                System.out.println(Calculator.ratio(a,b));
//
//            }else if (c.equalsIgnoreCase("/")) {
//                if (b != 0) {
//                    System.out.println(Calculator.division(a, b));
//                } else {
//                    System.out.println("Nie można dzielić przez zero!!");
//                }
//            }else if (c.equalsIgnoreCase("^")){
//                System.out.println(Calculator.power(a,b));
//            }
        StaticMethodsPersons.showPeople();


    }
}
