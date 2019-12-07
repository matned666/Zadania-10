package zadanie1;

public class Calculator {

    public static double sum (double a, double b){
        return a+b;
    }

    public static double ratio (double a, double b){
        return a*b;
    }

    public static double difference (double a, double b){
        return a-b;
    }

    public static double division (double a, double b){

            return a / b;


    }

    public static double power (double a, double b){
        double result = 1;
        if (b > 0){
            for (int i =1 ; i <= b ; i++){
                result *= a;
            }
        }else if (b == 0){
            result = 1;
        }else if (b < 0){
            for (int i =1 ; i <= Math.abs(b) ; i++){
                result *= a;
            }
            result = 1d/result;
        }
        return result;
    }


}
