package Lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// Time Limit Exceeded
public class Lecture3_2_Time_Limit_Exceeded {

    public static ArrayList<Integer> commonArray(int n, int m, int[] nArray, int[] mArray) {

        // 결과값을 넣을 ArrayList
        ArrayList<Integer> result = new ArrayList<Integer>();

        // 일단 nArray 오름차순 정렬
        Arrays.sort(nArray);
        // for문으로 nArray의 모든 값을 mArray의 값들과 비교
        for (int i = 0; i < n; i++) {
            int tmp = nArray[i];
            for (int j = 0; j < m; j++) {
                // 그 중 같은 것이 있으면 result에 값 넣기
                if (tmp == mArray[j]) {
                    result.add(mArray[j]);
                }
            }
        }

        return result;
}

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);

        // n배열
        int n = sc.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = sc.nextInt();
        }

        // m배열
        int m = sc.nextInt();
        int[] mArray = new int[m];
        for (int i = 0; i < m; i++) {
            mArray[i] = sc.nextInt();
        }

        // 출력
        ArrayList<Integer> result = commonArray(n, m, nArray, mArray);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}