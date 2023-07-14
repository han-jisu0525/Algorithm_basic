import java.util.Scanner;

public class loop_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int[] num = new int[x];
        for (int i = 0; i < num.length; i++) num[i] = sc.nextInt();

        for (int i = 0; i < num.length; i++) System.out.println(num[i]);
    }
}
