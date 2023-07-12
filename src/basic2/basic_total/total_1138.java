package basic2.basic_total;

import java.io.*;

public class total_1138 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//
//        if (x==1) System.out.println("0");
//        else if (x==0) System.out.println("1");
//        else System.out.println("Error!");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int ans = a == 1 ? 0 : 1;

        bw.write(String.valueOf(ans));

        br.close();
        bw.close();

    }
}
