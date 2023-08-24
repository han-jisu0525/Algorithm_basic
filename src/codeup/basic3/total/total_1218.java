import java.util.Scanner;

public class total_1218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a==b && b==c) System.out.println("정삼각형");
        else if (a==b || b==c || a== c) System.out.println("이등변삼각형");
        else if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) System.out.println("직각삼각형");
        else if (a + b < c) System.out.println("삼각형");
        else System.out.println("삼각형아님");
    }
}
