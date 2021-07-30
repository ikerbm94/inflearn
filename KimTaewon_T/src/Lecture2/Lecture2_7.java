package Lecture2;

import java.util.Scanner;

public class Lecture2_7 {

    public static int grading(int[] intA) {

        // 선언
        int tmp = 0;
        int result = 0;

        for (int i = 0 ; i < intA.length ; i++) {
            // 맞으면 tmp 올리고 result에 tmp 넣기
            if (intA[i] == 1) {
                tmp++;
                result += tmp;
            // 틀리면 tmp 초기화
            } else if (intA[i] == 0) {
                tmp = 0;
            }
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
        int result = grading(intA);
        System.out.println(result);

    }


}
