package baekjoon.ch6;

import java.util.Scanner;

public class ch6_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[20];
        float[] H = new float[20];
        String[] grade = new String[20];
        float[] ggrade = new float[20];

        float sum = 0;
        float H_sum = 0;
        float P_NP_H = 0;

        for (int i = 0; i < 20; i++) {
            name[i] = sc.next();
            H[i] = sc.nextFloat();
            grade[i] = sc.next();
        }

        for (int i = 0; i < 20; i++) {
            if (grade[i].equals("A+")) ggrade[i] = 4.5F;
            if (grade[i].equals("A0")) ggrade[i] = 4.0F;
            if (grade[i].equals("B+")) ggrade[i] = 3.5F;
            if (grade[i].equals("B0")) ggrade[i] = 3.0F;
            if (grade[i].equals("C+")) ggrade[i] = 2.5F;
            if (grade[i].equals("C0")) ggrade[i] = 2.0F;
            if (grade[i].equals("D+")) ggrade[i] = 1.5F;
            if (grade[i].equals("D0")) ggrade[i] = 1.0F;
            if (grade[i].equals("F")) ggrade[i] = 0;
            if (grade[i].equals("P")) {
                ggrade[i] = 0;
                P_NP_H += H[i];
            }
        }

        for (int i = 0; i < 20; i++) {
            sum += (H[i]*ggrade[i]);
            H_sum += H[i];
        }

        System.out.printf("%.6f", sum/(H_sum - P_NP_H) );

    }
}
