package Lecture3;

import java.util.Scanner;

public class Lecture3_3 {

    public static int sumMax (int n, int k, int[] nArr) {

        // 결과값 선언
        int result = 0;

        // k번의 연속된 숫자를 모두 더한 값들을 비교하여 가장 큰 값을 result에 담는다
        for (int i = 0 ; i < n-k+1 ; i++) {
            int tmp = nArr[i] + nArr[i+1] + nArr[i+2];
            if (result < tmp) {
                result = tmp;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        int k = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            nArr[i] = sc.nextInt();
        }

        // 출력
        int result = sumMax(n, k, nArr);
        System.out.println(result);

    }

}