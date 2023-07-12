package basic2.basic_IO;

import java.util.Scanner;

public class IO_1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        // Math.round가 성능면에서 훨씬 좋음.
        System.out.println("Math.round: " + (double)Math.round(x * 100)/100);
        System.out.println("String.format: " + String.format("%.2f", x));
    }
}
