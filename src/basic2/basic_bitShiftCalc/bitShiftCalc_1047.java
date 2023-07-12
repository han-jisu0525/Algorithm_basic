package basic2.basic_bitShiftCalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitShiftCalc_1047 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.printf("%d", a<<1);
    }
}
