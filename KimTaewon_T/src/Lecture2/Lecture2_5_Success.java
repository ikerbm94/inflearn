package Lecture2;

import java.util.Scanner;

// 강의 내용
public class Lecture2_5_Success {

    public static int countPrime(int n) {

        // 선언
        int answer = 0;
        int[] iArr = new int[n+1];

        // 2부터 시작하여 자연수 n까지 for문 시작
        for (int i = 2 ; i < n + 1 ; i++) {
            // 약수가 한 번도 존재하지 않았으면 인덱스의 값이 0이므로 소수이다
            if (iArr[i] == 0) {
                // 소수이기 때문에 카운트한다
                answer++;
                // 소수로 카운트된 숫자를 약수로 갖는 수들의 인덱스 값을 1로 한다
                for (int j = 0 ; j < n + 1 ; j = j + i) {
                    iArr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 출력
        System.out.println(countPrime(n));

    }

}