package sbu.cs.CalculatePi;
import java.math.BigDecimal;
import java.util.Random;
public class PiCalculator {

    /**
     * Calculate pi and represent it as a BigDecimal object with the given number of digits after the decimal point.
     * There are several algorithms designed for calculating pi, it's up to you to decide which one to implement.
     * Experiment with different algorithms to find accurate results.
     *
     * You must design a multithreaded program to calculate pi. Creating a thread pool is recommended.
     * Create as many classes and threads as you need.
     * Your code must pass all of the test cases provided in the test folder.
     *
     * @param decimalPlaces the exact number of digits after the decimal point
     * @return pi in string format (the string representation of the BigDecimal object)
     */

    // Euler
    public BigDecimal computePiEuler(int decimalPlaces) {
        return null;
    }

    public String calculate(int decimalPlaces) {
        BigDecimal piValue = computePiEuler(decimalPlaces);
        return piValue.toString();
    }

    public static void main(String[] args) {
        double insideCircle = 0;
        double outsideCircle = 0;
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 10000; i++) {
                Random randomGen = new Random();
                int xCoord = randomGen.nextInt(-1000, 1000);
                xCoord = xCoord * xCoord;
                int yCoord = randomGen.nextInt(-1000, 1000);
                yCoord = yCoord * yCoord;

                if (xCoord + yCoord < 1000 * 1000) {
                    insideCircle++;
                } else {
                    outsideCircle++;
                }
            }
            System.out.println(j);
        }
        System.out.println(insideCircle / outsideCircle);
    }
}