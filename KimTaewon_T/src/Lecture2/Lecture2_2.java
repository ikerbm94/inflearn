package Lecture2;

import java.util.Scanner;

public class Lecture2_2 {

    private static int iCanSee(int[] input_iArr) {

        // 맨 앞의 학생은 무조건 보이므로 일단 count를 +1하고 시작한다
        int count = 1;
        // 맨 앞의 학생의 키를 compare에 넣는다
        int compare = input_iArr[0];

        // i 번째의 학생이 i-1 번째의 학생보다 키가 크면 카운트를하고 compare에 i 번재 학생의 키를 넣는다
        // 그렇지않으면 패스
        // 이런식으로 한 줄을 통과한다
        for (int i = 1 ; i < input_iArr.length ; i++) {
            if (input_iArr[i] > compare) {
                count++;
                compare = input_iArr[i];
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 배열의 맨 뒤의 인덱스를 비워두기 위해 +1 한다
        int input_i = sc.nextInt() + 1;
        // +1된 int배열을 선언한다
        int[] input_iArr = new int[input_i];
        // 마지막 인덱스를 비워두고 받은 숫자로 배열을 채운다
        for(int i = 0 ; i < input_i - 1 ; i++) {
            input_iArr[i] = sc.nextInt();
        }
        // 마지막 인덱스는 0으로 채운다
        input_iArr[input_i - 1] = 0;

        // 결과값 출력
        int result = iCanSee(input_iArr);
        System.out.println(result);

    }

}
