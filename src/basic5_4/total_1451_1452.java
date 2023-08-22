package basic5_4;

import java.util.Scanner;

public class total_1451_1452 {
    public static void sort(int[] a) {
        m_pivot_sort(a, 0, a.length-1);
    }
    /*
    @param a  // 정렬할 배열
    @param lo // 현재 부분배열의 왼쪽
    @param hi // 현재 부분 배열의 오른쪽
    */
    public static void m_pivot_sort(int[] a, int lo, int hi) {
        // lo가 hi보다 크거나 같다면 정렬 원소가 1개이므로 정렬 X. 바로 리턴.
        if (lo >= hi) {return;}

        int pivot = partition(a, lo, hi);

        m_pivot_sort(a, lo, pivot);
        m_pivot_sort(a, pivot+1, hi);
    }
    /*
    @param a		정렬 할 배열
    @param left	현재 배열의 가장 왼쪽 부분
    @param right	현재 배열의 가장 오른쪽 부분
    @return		최종적으로 위치한 피벗의 위치(hi)를 반환
    */
    private static int partition(int[] a, int left, int right) {
        int lo = left - 1;
        int hi = right + 1;
        int pivot = a[(left + right) / 2];  // 부분리스트의 중간 요소를 피벗으로 지정.

        while (true) {

            do {
                lo++;
            } while (a[lo] < pivot);

            do {
                hi--;
            } while (a[hi] > pivot && lo <= hi);

            if (lo >= hi) {return hi;}

            swap(a, lo, hi);
        }
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
//        int temp = 0;

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
//        // 1451
//        Arrays.sort(a);

        m_pivot_sort(a, 0, N-1);

        for (int i = 0; i < N; i++) {
            System.out.println(a[i]);
        }
    }
}
