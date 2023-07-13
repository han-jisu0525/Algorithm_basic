package basic3.total;

import java.util.Scanner;

public class total_1162_1163 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        int ans = year - month + day;

        // 1162
        if (ans % 10 == 0) System.out.println("대박");
        else System.out.println("그럭저럭");

        //1163
        if((ans/100) % 2 == 0) System.out.println("대박");
        else System.out.println("그럭저럭");
    }
}
