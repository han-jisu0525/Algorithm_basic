import java.util.Scanner;

public class loop_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.nextLine().charAt(0);
        for (char i = 'a'; i <= x; i++) {
            System.out.print(i + " ");
        }
    }
}
