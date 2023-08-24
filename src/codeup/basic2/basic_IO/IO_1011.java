package codeup.basic2.basic_IO;

import java.util.Scanner;

public class IO_1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // toString말고 valueOf를 쓰는 이유: NPE 의미를 모르기 때문.
        // String.valueOf() - 파라미터가 null이면 null을 만들어서 반환
        // toString() - 값이 null이면 NPE발생
        String x = String.valueOf(sc.next().charAt(0));
        System.out.println(x);
    }
}
