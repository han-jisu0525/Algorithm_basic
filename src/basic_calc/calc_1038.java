package basic_calc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class calc_1038 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] num = br.readLine().split(" ");
//        int result = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x+y);
    }
}
