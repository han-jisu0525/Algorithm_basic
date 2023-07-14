import java.util.Scanner;

public class total_1231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        if (a.contains("+")) {
            String[] plus = a.split("\\+");
            System.out.printf("%d", Integer.parseInt(plus[0]) + Integer.parseInt(plus[1]));
        }
        else if (a.contains("-")) {
            String[] plus = a.split("-");
            System.out.printf("%d", Integer.parseInt(plus[0]) - Integer.parseInt(plus[1]));
        }
        else if (a.contains("*")) {
            String[] plus = a.split("\\*");
            System.out.printf("%d", Integer.parseInt(plus[0]) * Integer.parseInt(plus[1]));
        }
        else if (a.contains("/")) {
            String[] plus = a.split("/");
            System.out.printf("%d", Integer.parseInt(plus[0]) / Integer.parseInt(plus[1]));
        }


    }
}
