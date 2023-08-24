import java.util.Scanner;

public class total_1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int our_score = sc.nextInt();
        int ano_score = sc.nextInt();

        while (min < 90) {
            our_score++;
            min += 5;
        }
        if (our_score == ano_score) System.out.println("same");
        else if (our_score > ano_score) System.out.println("win");
        else System.out.println("lose");
    }
}
