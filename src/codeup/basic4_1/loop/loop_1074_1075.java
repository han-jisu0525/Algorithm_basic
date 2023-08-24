import java.util.Scanner;

public class loop_1074_1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

//        // 1074
//        while (x>=1) {
//            System.out.println(x);
//            x--;
//        }

        // 1075
        while (x > 0) {
            System.out.println(x-1);
            x--;
        }
    }
}
