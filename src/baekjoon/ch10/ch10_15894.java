package baekjoon.ch10;
import java.io.*;

public class ch10_15894 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine()); //학교의 수
        System.out.print(4 * n);
    }
}
