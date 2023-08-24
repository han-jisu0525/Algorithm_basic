import java.util.Arrays;
import java.util.Scanner;

public class total_1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ans = new int[7];
        int[] my = new int[6];

        int score = 0;
        int bonus = 0;

        for (int i = 0; i < ans.length; i++) ans[i] = sc.nextInt();
        for (int i = 0; i < my.length; i++) my[i] = sc.nextInt();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (ans[i] == my[j]) score++;
            }
        }
        for (int j = 0; j < my.length-1; j++) {
            if (ans[6] == my[j]) bonus++;
        }
        if (score == 6) System.out.println("1");
        else if (score == 5 && bonus == 1) System.out.println("2");
        else if (score == 5) System.out.println("3");
        else if (score == 4) System.out.println("4");
        else if (score == 3) System.out.println("5");
        else System.out.println("0");
    }
}
