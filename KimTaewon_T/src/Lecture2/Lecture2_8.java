package Lecture2;

import java.util.Scanner;

public class Lecture2_8 {

    public static int[] grading(int[] intA) {

        // 선언
        int[] result = new int[intA.length];
        // 1등부터 시작해서 등수 내리기
        int tmp = 1;

        for (int i = 0 ; i < intA.length ; i++) {
            for (int j = 0 ; j < intA.length ; j++) {
                // 등수가 높은 학생이 있을때마다 등수 내리기
                if (intA[i] < intA[j]) {
                    tmp++;
                }
                // 등수 값 넣기
                result[i] = tmp;
            }
            // 등수 초기화
            tmp = 1;
        }

        return result;
    }


    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intA = new int[n];
        for (int i = 0 ; i < n ; i++) {
            intA[i] = sc.nextInt();
        }

        // 출력
        int[] result = grading(intA);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}