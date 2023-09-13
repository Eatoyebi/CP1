import java.util.Random;
import java.util.Scanner;
class ArrayTesting {
    {
        int sum = 0;
        int[] values = new int[0];
        for (int value : values) {
            sum += value;
        }
        int average = sum / values.length;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        int[] dataPoints;
        int sum = 0;
        int userInput;
        int count = 0;
        int max = 0;

        dataPoints = new int[50];

        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rnd.nextInt(50) + 1;
            System.out.println(dataPoints[x]);
        }
        for (int dataPoint : dataPoints) {
            System.out.printf("%d | ", dataPoint);
        }
        for (int dataPoint : dataPoints) {
            sum += dataPoint;
        }
        System.out.println("\n The sum of the array is: " + sum);
        System.out.println("The average in this array is: " + sum / dataPoints.length);
       }}
