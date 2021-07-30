package Lecture2;

import java.util.ArrayList;
import java.util.Scanner;

// 강의 내용
public class Lecture2_1 {

    public static ArrayList<Integer> solution(int[] input_iArr) {

        // ArrayList<Integer> 선언
        ArrayList<Integer> result = new ArrayList<>();

        // 첫 번째는 일단 add
        result.add(input_iArr[0]);

        // 앞에꺼보다 크면 add
        for (int i = 1; i < input_iArr.length; i++) {
            if (input_iArr[i] > input_iArr[i - 1]) {
                result.add(input_iArr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input_i = sc.nextInt();
        int[] input_iArr = new int[input_i];
        // 받음과 동시에 int배열로 넣는다
        for (int i = 0 ; i < input_i ; i++) {
            input_iArr[i] = sc.nextInt();
        }

        // 결과값 출력
        ArrayList<Integer> result = solution(input_iArr);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}
