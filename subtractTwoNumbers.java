import java.util.Scanner;

public class subtractTwoNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double result =  subtractTwoNumbers (20, 2, 12);
        System.out.println("The result is " + result);
    }
    public static double subtractTwoNumbers(int valueA, double valueB, int valueC){
        return valueA - valueB - valueC;
    }
}
