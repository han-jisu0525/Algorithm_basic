import java.util.Scanner;

public class total_1228_1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        double std_weight = 0;

        // 1229
        if (height < 150) std_weight = height - 100;
        else if (height < 160) std_weight = (height - 150)/2 + 50;
        else std_weight = (height - 100) * 0.9;

        double bmi = (weight - std_weight) * 100 / std_weight;

        if (bmi <= 10) System.out.println("정상");
        else if (bmi <= 20) System.out.println("과체중");
        else System.out.println("비만");
    }
}
