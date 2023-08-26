package baekjoon.ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class ch6_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String p = br.readLine();
        String[] P = p.split("");

        if (P.length==1) {
            System.out.println("1");
        } else if (P.length%2==1) {
            for (int i = 0; i < P.length/2; i++) {
                if (!Objects.equals(P[i], P[(P.length - 1) - i])) {
                    System.out.println("0");
                    break;
                } else if (i+2 == (P.length-1)-i && Objects.equals(P[i], P[(P.length - 1) - i])) {
                    System.out.println("1");
                    break;
                }
            }
        } else {
            for (int i = 0; i < P.length/2; i++) {
                if (!Objects.equals(P[i], P[(P.length - 1) - i])) {
                    System.out.println("0");
                    break;
                } else if (i+1 == (P.length-1)-i && Objects.equals(P[i], P[(P.length - 1) - i])) {
                    System.out.println("1");
                    break;
                }
            }
        }

    }
}
