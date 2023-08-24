package codeup.basic3.total;

import java.util.Scanner;

public class total_1165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int score = sc.nextInt();

        while (min < 90) {
            score++;
            min += 5;
        }
        System.out.println(score);
    }
}
