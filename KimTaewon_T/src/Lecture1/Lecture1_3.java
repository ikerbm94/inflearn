package Lecture1;

import java.util.Scanner;

// 강의 내용
public class Lecture1_3 {

    public static void main(String[] args) {

        // 선언
        String answer = "";
        int m = Integer.MIN_VALUE;

        // String 입력받기
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // 공백으로 나누어서 배열에 넣기
        String[] s = input.split(" ");

        // 배열의 String의 길이 비교해서 제일 큰 것 가리기
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }

        // 제일 큰거 출력
        System.out.println(answer);

    }

}

// Scanner sc = new Scanner(System.in);
// String str = sc.nextInt();
// => next()와 달리 nextInt()는 공백도 입력 받기 가능

// Integer.MAX_VALUE => 정수의 최댓값
// Integer.MIN_VALUE => 정수의 최솟값

// String[]
// String = str = "abc def";
// String[] strArr = str.split(" ");
// => "abc def"에서 공백을 찾아 기준으로 문자 나누기