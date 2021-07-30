package Lecture3;

import java.util.Scanner;

public class Lecture3_4_Time_Limit_Exceeded {

    private static int sequenceSum(int n, int m, int[] nArr) {

        // 결과값인 갯수를 넣을 변수
        int result = 0;

        // i개의 원소를 가진 연속부분수열을 차례대로 계산한다
        for (int i = 1 ; i <= n ; i++) {

            // i개의 원소를 계산할때, 마지막 수열의 맨 앞자리의 index는 (배열의 길이 - i)이다
            for (int j = 0 ; j < n-i+1 ; j++) {

                // m과 비교할 값을 임시로 넣을 변수
                int tmp = 0;
                // i개의 원소만큼 더하기 위한 변수
                int count = 0;
                // 원하는 index에서 시작하기 위한 변수
                int index = j;

                // 원하는 index에서 i개의 원소만큼 더한 값을 tmp에 넣는다
                while (count != i) {
                    tmp += nArr[index];
                    count++;
                    index++;
                }

                // tmp와 m 비교하여 같으면 result++
                if (tmp == m) {
                    result++;
                }

            }

        }

        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        int m = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            nArr[i] = sc.nextInt();
        }

        // 출력
        int result = sequenceSum(n, m, nArr);
        System.out.println(result);

    }

}