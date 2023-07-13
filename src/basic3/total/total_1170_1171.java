package basic3.total;

import java.util.Scanner;

public class total_1170_1171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();
        int cls = sc.nextInt();
        int num = sc.nextInt();

//        //1170
//        if (num < 10) System.out.printf("%d%d0%d", grade, cls, num);
//        else System.out.printf("%s%d%d", grade, cls, num);

        //1171
        if (cls < 10){
            if (num < 10) System.out.printf("%d0%d00%d", grade, cls, num);
            else if (num < 100) System.out.printf("%d0%d0%d", grade, cls, num);
            else System.out.printf("%d0%d%d", grade, cls, num);
        } else {
            if (num < 10) System.out.printf("%d%d00%d", grade, cls, num);
            else if (num < 100) System.out.printf("%d%d0%d", grade, cls, num);
            else System.out.printf("%d%d%d", grade, cls, num);
        }

    }
}
