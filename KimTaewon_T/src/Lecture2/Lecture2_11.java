package Lecture2;

import java.util.Scanner;

public class Lecture2_11 {

    private static int tmpPresident(int n, int[][] intAA) {

        // 임시로 사용할 변수
        int tmp = 0;
        // 각 학생들의 같은 반이었던 학생들의 숫자 집합
        // 각 i번 학생들의 같은 반이었던 학생들의 숫자가 count[i+1]에 담길 것이다
        int[] count = new int[n];
        // 같은 반이었던 학생들의 숫자 중 가장 큰 숫자
        int largest = 0;
        // 최종 학생의 번호
        int result = 0;

        // 1번 학생부터 n번 학생까지
        for (int i = 0 ; i < n ; i++) {
            // i+1번 학생의 1학년부터 5학년까지
            for (int j = 0 ; j < 5 ; j++) {
                // i+1번째 학생이 j+1학년일때의 반 번호를 tmp에 넣는다
                tmp = intAA[i][j];
                // 1번 학생부터 i-1번째 학생까지, j학년일때의 반 번호를 tmp와 비교
                for (int k = 0 ; k < i ; k++) {
                    if (tmp == intAA[k][j]) {
                        // 반이 같으면 i+1번째 학생의 count 값을 +1
                        count[i]++;
                    }
                }
                // i+1번째 학생부터 n번째 학생까지, j학년일때의 반 번호를 tmp와 비교
                for (int k = i+1 ; k < n ; k++) {
                    if (tmp == intAA[k][j]) {
                        // 반이 같으면 i+1번째 학생의 count 값을 +1
                        count[i]++;
                    }
                }
            }
        }

        // count의 값들 중 가장 큰 값을 구함
        largest = count[0];
        for (int i = 1 ; i < n ; i++) {
            tmp = count[i];
            if (largest < tmp) {
                largest = tmp;
            }
        }

        // count의 값들 중 가장 큰 값과 처음으로 같은 값을 가진 학생의 번호를 출력
        for (int i = 0 ; i < n ; i++) {
            if (count[i] == largest) {
                result = i+1;
                break;
            }
        }

        // 최종 학생의 번호
        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intAA = new int[n][5];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                intAA[i][j] = sc.nextInt();
            }
        }

        // 출력
        int result = tmpPresident(n, intAA);
        System.out.print(result);

    }

}