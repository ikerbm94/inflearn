package Lecture2;

import java.util.Scanner;

public class Lecture2_4 {

    // 의견 없음
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] iArr = new int[n];
        iArr[0] = 1;
        iArr[1] = 1;

        for (int i = 2 ; i < n ; i++) {
            iArr[i] = iArr[i-2] + iArr[i-1] ;
        }

        for (int i : iArr) {
            System.out.print(i + " ");
        }

    }

}
