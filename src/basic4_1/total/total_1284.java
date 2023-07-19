package basic4_1.total;

import java.util.ArrayList;
import java.util.Scanner;

public class total_1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i < n ; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        if (arr.size() == 2) {
            System.out.println(arr.get(0) + " " + arr.get(1));
        } else System.out.println("wrong number");
    }
}
