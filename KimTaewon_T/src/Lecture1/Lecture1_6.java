package Lecture1;

import java.util.Scanner;

public class Lecture1_6 {

    public static void main (String[]args){

        // 선언
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String rs = "";

        // 포함여부 확인후 추가
        for (int i = 0; i < input.length(); i++) {
            if (!(rs.contains((input.charAt(i) + "")))) {
                rs += input.charAt(i) + "";
            }
        }

        // 출력
        System.out.println(rs);

    }

}

// String str = "abcde";
// CharSequence cs = "ab";
// str.contains(cs);
// => String안에 주어진 CharSequence의 값이 존재하면 true를, 존재하지 않으면 false를 리턴한다

// CharSequence는 인터페이스이고 String, StringBuffer 등은 클래스이다
// 즉 CharSequence는 문자열이다

// char c = 'A';
// String str = c+"";
// => 한 개의 문자를 문자열로 바꾸는 방법