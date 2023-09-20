package baekjoon.ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ch12_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int x = 0, y = 0;

/*  // 런타임 에러
        if (a == d) {
            y = (c-f) / (b-e);
            x = (c - (b*y)) / a;
        } else if (b == e) {
            x = (c-f) / (a-d);
            y = (c - (a*x)) / b;
        } else {
            int temp = a;
            a *= d; b *= d; c *= d;
            e *= temp; f *= temp;

            y = (c-f) / (b-e);
            x = (c - (b*y)) / a;
        }
*/
        for(int i = -999; i < 1000; i++){
            for(int j = -999; j < 1000; j++){
                if((a*i+b*j == c)&&(d*i+e*j == f)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        System.out.printf("%d %d", x, y);
    }
}
