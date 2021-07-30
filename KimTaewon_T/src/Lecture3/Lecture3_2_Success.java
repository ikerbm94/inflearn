package Lecture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lecture3_2_Success {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {

        // 정답을 넣을 변수
        ArrayList<Integer> answer = new ArrayList<>();

        // 일단 오름차순으로 정렬
        Arrays.sort(a);
        Arrays.sort(b);

        // 인덱스 값
        int p1 = 0, p2 = 0;

        // 인덱스 값을 ++하면서 하나씩 비교하면서 지나간다
        // 그러다가 같은 값이 나오면 answer에 값을 넣는다
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1++]);
                p2++;
            } else if (a[p1] < b[p2]) p1++;
            else p2++;
        }

        return answer;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner kb = new Scanner(System.in);

        // 첫 번째 배열
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }

        // 두 번째 배열
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }

        // 출력
        for (int x : solution(n, m, a, b)) System.out.print(x + " ");

    }

}