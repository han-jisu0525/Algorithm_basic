package basic4_1.total;

import java.util.Scanner;

public class total_1285 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] num = x.split("\\+|-|\\*|/|\\=");
        String[] oper = x.split("1|2|3|4|5|6|7|8|9|0");
        int[] num2 = new int[num.length];
        for (int i = 0; i < num.length; i++) num2[i] = Integer.parseInt(num[i]);
        int sum = num2[0];
        System.out.println(num2.length);
        System.out.println(oper.length);
        for (int i = 1; i < oper.length-1; i++) {
            switch (oper[i]) {
                case ("+"): sum += num2[i+1]; break;
                case ("-"): sum -= num2[i+1]; break;
                case ("*"): sum *= num2[i+1]; break;
                case ("/"): sum = sum / num2[i+1]; break;
                case ("="):
                    System.out.println(sum); break;
                default:
                    System.out.println(sum + " " + oper[i] + " "+ num2[i]);
            }
        }
        System.out.println(sum);

    }
}
