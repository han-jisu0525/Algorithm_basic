import java.util.Scanner;

public class total_1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int not_ad = sc.nextInt();
        int ad = sc.nextInt();
        int no_matter = sc.nextInt();

        int ad_max = Math.max(not_ad, ad);
        int real_max = Math.max(ad_max, no_matter);
        if (real_max == not_ad) System.out.println("do not advertise");
        else if (real_max == ad) System.out.println("advertise");
        else System.out.println("does not matter");

    }
}
