package Lecture1;

import java.util.Scanner;

// 강의 내용
public class Lecture1_11 {

    public static String charConuter(String input_str) {

        // 결과값
        String result = "";
        // for문에서 맨 뒤에 칸도 필요하기 때문에 하나 비워주기
        input_str = input_str + " ";
        // 카운트
        int count = 1;

        for(int i = 0 ; i < input_str.length() - 1 ; i++) {
            // 현재 문자랑 한 칸 뒤의 문자랑 같으면 카운트 하나 올리기
            if(input_str.charAt(i) == input_str.charAt(i+1)) {
                count++;
            // 다르면 현재 문자를 result에 추가하고 카운트도 추가하고 카운트 초기화
            // 단, count가 1이라면 그냥 지나가기
            } else {
                result += input_str.charAt(i);
                if (count > 1) {
                    result += count;
                    count = 1;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input_str = sc.next();
        System.out.println(charConuter(input_str));

    }

}