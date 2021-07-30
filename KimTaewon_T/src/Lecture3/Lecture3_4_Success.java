package Lecture3;

import java.util.Scanner;

// 강의 내용
public class Lecture3_4_Success {

    public static int solution(int n, int m, int[] arr) {

        // 수열의 양 끝 index로서 두 개의 index를 활용한 방법
        int answer = 0, sum = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= arr[lt++];
                if (sum == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        // 출력
        System.out.print(solution(n, m, arr));

    }

}