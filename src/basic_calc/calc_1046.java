package basic_calc;

import java.util.Scanner;

public class calc_1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] num = a.split(" ");
        int sum = 0;
        for (String s : num) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);

        double avg = (double) sum / num.length;
        System.out.printf("%.1f", avg);
    }
}
