package Lecture2;

import java.util.Scanner;

public class Lecture2_9 {

    private static int theLargestSum(int n, int[][] intAA) {

        // 선언
        int result = 0;
        int tmp = 0;

        // 행의 합
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                tmp += intAA[i][j];
            }
            if (result < tmp) {
                result = tmp;
            }
            tmp = 0;
        }

        // 열의 합
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                tmp += intAA[j][i];
            }
            if (result < tmp) {
                result = tmp;
            }
            tmp = 0;
        }

        // 오른쪽 아래로 대각선의 합
        for (int i = 0 ; i < n ; i++) {
            tmp += intAA[i][i];
        }
        if (result < tmp) {
            result = tmp;
        }
        tmp = 0;

        // 왼쪽 아래로 대각선의 합
        for (int i = 0 ; i < n ; i++) {
            tmp += intAA[i][n-1-i];
        }
        if (result < tmp) {
            result = tmp;
        }
        tmp = 0;

        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intAA = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                intAA[i][j] = sc.nextInt();
            }
        }

//        잘 들어왔나 한 번 찍어봄
//        for (int i = 0 ; i < intAA.length ; i++){
//            for (int number : intAA[i]) {
//                System.out.print(number + " ");
//            }
//        }

        // 출력
        int result = theLargestSum(n, intAA);
        System.out.println(result);

    }

}
