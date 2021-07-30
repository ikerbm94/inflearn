package Lecture2;

import java.util.Scanner;

public class Lecture2_6 {

    public static int intReverse(int input) {

        // StringBuffer 준비
        StringBuffer sb = new StringBuffer();

        // 받은 int를 일단 char배열로 변형
        String str = Integer.toString(input);
        char[] cArr = str.toCharArray();

        // 앞에 0을 없애기 위함
        int tmp = 0;

        // 뒤집기
        for (int i = cArr.length - 1 ; i >= 0 ; i--) {
            if (cArr[i] != 0 || tmp == 1) {
                sb.append(cArr[i]);
                tmp = 1;
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static boolean isPrime(int input) {

        // 1은 소수가 아니다
        if (input == 1) {
            return false;
        }

        // 2는 소수다
        if (input == 2) {
            return true;
        }

        // 3은 소수다
        if (input == 3) {
            return true;
        }

        // 4는 소수가 아니다
        if (input == 4) {
            return false;
        }


        for (int i = 2 ; i < input/2 ; i++) {
            // 1과 input 사이에 있는 숫자로 input을 나누었을때 나머지가 0이면 소수가 아니다
            if (input % i == 0) {
                return false;
            }
        }

        // 나눈 나머지가 전부 0이 아니면 소수다
        return true;
    }

    public static void main(String[] args) {

        // 받기 & 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            int input = sc.nextInt();
            // 뒤집기
            int reverse = intReverse(input);
            // 소수면 출력
            if (isPrime(reverse)) {
                System.out.print(reverse + " ");
            }
        }

    }

}