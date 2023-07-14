import java.util.Scanner;

public class total_1230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int carHeight = 170;
        int[] tunnels = new int[3];

        for (int i = 0; i < tunnels.length; i++) tunnels[i] = sc.nextInt();

        int i = 0;
        while (i < tunnels.length) {
            if (carHeight >= tunnels[i]) {
                System.out.printf("CRASH %d", tunnels[i]);
                break;
            }
            i++;
            if (i == tunnels.length) System.out.println("PASS");
        }
    }
}
