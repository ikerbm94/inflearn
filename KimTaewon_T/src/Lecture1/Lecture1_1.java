package Lecture1;

import java.util.Scanner;

public class Lecture1_1 {

    // 만약 대문자면 소문자로 바꾸는 메서드
    public static char makeLower(char alphabet) {

        if (Character.isUpperCase(alphabet)) {
            return Character.toLowerCase(alphabet);
        } else {
            return alphabet;
        }

    }

    public static void main(String[] args) {

        // 선언
        int count = 0;

        // String 2개 입력 받기
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();



        //
        for (int i = 0; i < input1.length(); i++) {

            // 첫 째로 받은 String에 대문자가 있으면 소문자 char로 바꾸기
            char unit = makeLower(input1.charAt(i));
            // 두 번째로 받은 String이 대문자면 소문자 char로 바꾸기
            char compare = makeLower(input2.charAt(0));

            // 비교해서 같으면 0
            int rs = Character.compare(unit, compare);

            // 0이면 카운트
            if (rs == 0) {
                count++;
            }

        }

        // 카운트한 것 출력
        System.out.println(count);

    }
}

// String str = "abcde";
// str.charAt(i);
// => "abcde"의 i번째 인자를 char로 리턴
// (a는 0번째 인자)

// Character.compare(char x, char y);
// => x와 y를 비교하여, 같으면 0을 리턴, x가 크면 양수를 리턴, y가 크면 음수를 리턴

// Character.isUpperCase(char x);
// => x가 대문자면 true를 리턴, 소문자면 false를 리턴
// (Character.isLowerCase는 반대임)

// Character.toUpperCase(char x);
// => x를 대문자로 리턴
// (그대로 char로 리턴)
// (Character.toLowerCase는 반대임)