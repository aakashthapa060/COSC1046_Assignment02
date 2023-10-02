import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Decimal Format
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        System.out.println("Enter the investment amount: ");
        double investmentAmount = validator("Investment");

        System.out.println("Enter The Annual Interest: ");
        double annualInterest = validator("Annual Interest");

        System.out.println("Enter The Numbers of Years: ");
        double numberOfYears = validator("Number of Years");

        double futureInvestmentFinal = futureInvestmentValue(investmentAmount, annualInterest, numberOfYears);

        System.out.println("Accumulated value is " + df.format(futureInvestmentFinal));

    }

    public static double futureInvestmentValue(double investmentAmount, double annualInterest, double numberOfYears) {
        double monthlyInterestRate = annualInterest / 12 / 100;
        double futureInvestmentTotal = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        return futureInvestmentTotal;

    }

    public static double validator(String valueName) {
        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();
        while (number < 0) {
            System.out.println("Please Enter the positive " + valueName + " amount: ");
            number = input.nextDouble();
        }

        return number;
    }

}