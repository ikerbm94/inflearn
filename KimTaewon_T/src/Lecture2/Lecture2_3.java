package Lecture2;

import java.util.Scanner;

public class Lecture2_3 {

    public static char[] resultRSP(int n, int[] input_A, int[] input_B) {

        // 결과를 담을 배열
        char[] cArr = new char[n];

        for (int i = 0; i < n; i++) {
            // A가 이기는 경우
            if (((input_A[i] == 1) && (input_B[i] == 3)) || (((input_A[i] == 2) && (input_B[i] == 1))) || ((input_A[i] == 3) && (input_B[i] == 2))) {
                cArr[i] = 'A';
            // A가 지는 경우
            } else if (((input_A[i] == 1) && (input_B[i] == 2)) || (((input_A[i] == 2) && (input_B[i] == 3))) || ((input_A[i] == 3) && (input_B[i] == 1))) {
                cArr[i] = 'B';
            // 비기는 경우
            } else if (input_A[i] == input_B[i]) {
                cArr[i] = 'D';
            }
        }

        return cArr;
    }

    public static void main(String[] args) {

        // 값 담기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input_A = new int[n];
        int[] input_B = new int[n];
        for (int i = 0; i < n; i++) {
            input_A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            input_B[i] = sc.nextInt();
        }

        // 출력
        char[] cArr = resultRSP(n, input_A, input_B);
        for (char c : cArr) {
            System.out.println(c);
        }

    }

}
