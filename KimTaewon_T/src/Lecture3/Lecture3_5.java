package Lecture3;

import java.util.Scanner;

public class Lecture3_5 {

    // 1부터 n까지의 합
    public static int sumToN(int n) {
        int result = 0;
        for (int i = 1 ; i <= n ;i++) {
            result += i;
        }
        return result;
    }

    // n부터 m까지의 합 = (1부터 m까지의 합) - (1부터 n까지의 합) + n
    public static int sumNToM(int n, int m) {
        return sumToN(m) - sumToN(n) + n;
    }

    public static void main(String[] args) {

        // 결과값을 담을 변수
        int result = 0;

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 더해질 연속된 값들의 양 끝 값
        int li = 1;
        int ri = 2;

        // n 값의 반을 올림한 수 까지 ri가 움직이도록 while문을 돌리면 된다 (그 이상은 의미가 없다)
        while (ri <= Math.ceil((double)n/2)){

            // li 부터 ri 까지의 값을 더한다
            int tmp = sumNToM(li, ri);

            // tmp가 n보다 크면 li++
            if (tmp > n) {
                li++;
            // tmp와 n이 같다면 result++, 그리고 li++
            } else if (tmp == n) {
                result++;
                li++;
            // tmp가 n보다 작다면 ri++
            } else if (tmp < n) {
                ri += 1;
            }

        }

        System.out.println(result);

    }

}