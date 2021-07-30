package Lecture3;

import java.util.Scanner;

public class Lecture3_6 {

    private static int longer(int n, int[] nArr) {

        // 결과를 담을 변수
        int result = 0;
        // 수열의 길이
        int tmp = 0 ;

        // 배열의 연속부분수열 중 가장 긴 길이를 계산
        for (int i = 0 ; i < n ; i++) {
            if (nArr[i] == 1) {
                tmp++;
            } else if (nArr[i] == 0) {
                if(result < tmp) {
                    result = tmp;
                    tmp = 0;
                }
            }
        }

        // 결과
        return result;
    }

    private static int longest(int n, int k, int[] nArr) {

        // 결과를 담을 변수
        int result = 0;
        // k번 까지 카운트
        int count = 0;
        // nArr 초기화를 위한 배열
        int[] copy = new int[n];
        for (int i = 0 ; i < n ; i++) {
            copy[i] = nArr[i];
        }

        // 앞에서부터 0을 1로 k번씩 교체할때마다 나오는 배열의 가장 긴 연속부분수열들의 길이를 비교
        for (int i = 0 ; i < n ; i++) {
            // 첫 번째로 0이 나오면
            if (nArr[i] == 0) {
                // 해당 index의 값을 1로 바꿔주고
                nArr[i] = 1;
                // k번 까지를 위해 카운트
                count++;
                // 카운트수가 k를 만족 시키면
                if (count == k) {
                    // nArr의 가장 긴 연속부분수열의 길이를 계산
                    int tmp = longer(n, nArr);
                    // 이전의 result 값보다 크다면 변경
                    if (result < tmp) {
                        result = tmp;
                    }
                    // nArr 초기화
                    for (int j = 0 ; j < n ; j++) {
                        nArr[i] = copy[i];
                    }
                    // count 초기화
                    count = 0;
                }
            }
        }

        // 결과
        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            nArr[i] = sc.nextInt();
        }

        // 출력
        int result = longest(n, k, nArr);
        System.out.println(result);

    }

}