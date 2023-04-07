package preFinal;
import java.math.BigDecimal;
import java.util.Random;

public class test13 {
  public static void main(String[] args) {
    // Create a Random object to generate random numbers
    Random rand = new Random();

    // Generate two random real numbers between -1000.0 and 1000.0
    double num1 = rand.nextDouble() * 2000.0 - 1000.0;
    double num2 = rand.nextDouble() * 2000.0 - 1000.0;

    // Multiply the two numbers
    double result = num1 * num2;

    // Create BigDecimal objects with the scaled value of the result
    BigDecimal bd1 = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP);
    BigDecimal bd2 = new BigDecimal(1000.0).setScale(2, BigDecimal.ROUND_HALF_UP);

    // Subtract bd2 from bd1
    BigDecimal finalResult = bd1.subtract(bd2);

    // Print the final result
    System.out.println("The final result is: " + finalResult);
  }
}

