package Lecture2;

import java.util.Scanner;

public class Lecture2_5_Time_Limit_Exceed {

    public static boolean isPrime(int number) {

        // number가 2이면 소수 (true)
        if (number == 2) {
            return true;
        }

        // number를 1과 number 사이에 있는 모든 자연수로 나누었을때 나머지가 0인 숫자가 하나라도 있으면 소수가 아니다 (false)
        for (int i = 2 ; i < number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        // 나머지가 0인 숫자가 하나도 없으면 소수이다 (true)
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 2 ; i < n + 1 ; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        System.out.print(count);

    }

}
