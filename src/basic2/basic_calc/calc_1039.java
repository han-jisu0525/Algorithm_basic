package basic2.basic_calc;

import java.io.IOException;
import java.util.Scanner;

public class calc_1039 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] num = br.readLine().split(" ");
//        long result = Long.parseLong(num[0]) + Long.parseLong(num[1]);
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();

        System.out.println(x+y);

    }
}
