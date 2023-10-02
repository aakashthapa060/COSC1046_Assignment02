import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Decimal Format
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(3);

        Scanner input = new Scanner(System.in);

        /*
         * Created numbers array to store 5 numbers
         * and asked user input 5 times using for loop
         */
        int[] numbers = new int[5];
        int arrLength = numbers.length;
        for (int i = 0; i < arrLength; ++i) {
            System.out.println("Please Enter a Number: ");
            int number = input.nextInt();
            numbers[i] = number;
        }

        double[] squareRoot = squareRootConvertor(numbers);
        double[] cubeRoot = cubeRootConvertor(numbers);

        System.out.println("Numbers\t\tSquareroot\t\tCuberoot");
        for (int i = 0; i < arrLength; ++i) {
            System.out.println(numbers[i] + "\t\t\t" + df.format(squareRoot[i]) + "\t\t\t" + df.format(cubeRoot[i]));

        }

    }

    /* Method Created to Follow DRY principles. */

    public static double[] squareRootConvertor(int[] numbers) {
        double[] squareRoot = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            squareRoot[i] = Math.sqrt(numbers[i]);
        }
        // Returns an array with squareroot values
        return squareRoot;
    }

    public static double[] cubeRootConvertor(int[] numbers) {
        double[] cubeRoot = new double[5];

        for (int i = 0; i < numbers.length; i++) {
            cubeRoot[i] = Math.cbrt(numbers[i]);
        }

        // Returns an array with cuberoot values
        return cubeRoot;
    }

}
