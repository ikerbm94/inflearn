package Lecture2;

import java.util.Scanner;

public class Lecture2_12_Error {

    public static int mentoring(int n, int m, int[][] intAA) {

        // 선언
        int tmp = 0;
        int count = 0;

        // 경우의 수를 먼저 배열로 만든다
        int[][] cases = new int[n][n];
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {
                cases[i][j] = Integer.parseInt(Integer.toString(i+1) + Integer.toString(j+1));
            }
        }

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < n ; j++) {

                // 각각의 경우의 수를 준비한 후에 (mentor, mentee)
                int mentor = Integer.toString(cases[i][j]).charAt(0)-'0';
                int mentee = Integer.toString(cases[i][j]).charAt(1)-'0';

                // m번의 테스트 동안 모두 mentor가 mentee보다 순위가 높은지 확인하자
                for (int k = 0 ; k < m ; k++) {

                    // k번째 테스트의 멘토의 순위
                    int mentorGrade = 0;
                    // k번째 테스트의 멘티의 순위
                    int menteeGrade = 0;

                    // mentor와 mentee의 k번째 테스트의 순위 값 넣기
                    for (int l = 0 ; l < n ; l++) {
                        if (intAA[k][l] == mentor) {
                            mentorGrade = l+1;
                        }
                        if (intAA[k][l] == mentee) {
                            menteeGrade = l+1;
                        }
                    }

                    // mentor의 순위가 mentee보다 높으면 tmp++, 그렇지 않으면 tmp 초기화 후에 다음 경우의 수로
                    if (mentorGrade < menteeGrade ) {
                        tmp++;
                    } else {
                        tmp = 0;
                        break;
                    }

                    // mentor가 mentee보다 모든 테스트에서 순위가 앞선다면 tmp = m이므로 tmp 초기화 후에 count++하고 다음 경우의 수로
                    if (tmp == m) {
                        tmp = 0;
                        count++;
                    }

                }

            }

        }

        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 학생 수
        int n = sc.nextInt();
        // 테스트 수
        int m = sc.nextInt();
        // 등수
        int[][] intAA = new int[m][n];
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                intAA[i][j] = sc.nextInt();
            }
        }

        // 출력
        int result = mentoring(n, m, intAA);
        System.out.println(result);

    }

}
