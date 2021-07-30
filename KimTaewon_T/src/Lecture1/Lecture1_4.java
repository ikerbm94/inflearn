package Lecture1;

import java.util.Scanner;

public class Lecture1_4 {

    public static void main(String[] args) {

        // 선언
        int inputInt;
        String[] strArr;

        // 정수 N 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.println("3에서 20사이의 정수를 입력해주세요");
        inputInt = sc.nextInt();

        // 무한루프로 3 ~ 20 사이 숫자 정수를 입력하면 탈출
        while (!(3 <= inputInt && 20 >= inputInt)) {
            System.out.println("틀린 정수입니다. 3에서 20사이의 정수를 입력해주세요.");
            inputInt = sc.nextInt();
        }

        // 배열 크기 생성
        strArr = new String[inputInt];

        // 정수 N 만큼 단어 입력받기
        for (int i = 0 ; i < inputInt ; i++) {
            strArr[i] = sc.next();
        }

        // 입력받은 String 뒤집고 출력까지
        for (String str : strArr) {
            System.out.println((new StringBuffer(str)).reverse().toString());
        }

    }

}

// String str = "abcde";
// StringBuffer sb = new StringBuffer(str);
// sb.reverse().toString();
// => StringBuffer를 활용하여 문자열 뒤집기