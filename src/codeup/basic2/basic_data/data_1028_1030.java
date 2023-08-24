package codeup.basic2.basic_data;

import java.util.Scanner;

public class data_1028_1030 {
    public static void main(String[] args) {
        // java에는 long long이 없기 때문에 1028과 1030의 답이 같다.
        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();  // long --> int보다 큰 범위
        System.out.println(x);
    }
}

