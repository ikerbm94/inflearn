package Lecture2;

import java.util.Scanner;

    public class Lecture2_10 {
    
        private static int countPeak(int n, int[][] intA) {
    
            // 카운트
            int count = 0;
    
            // 상하좌우 비교
            for (int i = 1 ; i < n+1 ; i++){
                for (int j = 0 ; j < n+1 ; j++) {
                    if ((intA[i][j] > intA[i+1][j]) && (intA[i][j] > intA[i-1][j]) && (intA[i][j] > intA[i][j+1]) && (intA[i][j] > intA[i][j-1])) {
                        count++;
                    }
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
    
            // n값 받기, int[][] 배열 생성
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] intA = new int[n+2][n+2];
    
            // 격자 자리 0 대입
            for (int i = 0 ; i < n+2 ; i++) {
                intA[0][i] = 0;
            }
            for (int i = 1 ; i < n+2 ; i++) {
                intA[i][0] = 0;
            }
            for (int i = 1 ; i < n+2 ; i++) {
                intA[i][n+1] = 0;
            }
            for (int i = 1 ; i < n+1 ; i++) {
                intA[n+1][i] = 0;
            }
    
            // int[][] 배열에 값 받기
            for (int i = 1 ; i < n+1 ; i++) {
                for (int j = 1 ; j < n+1 ; j++) {
                    intA[i][j] = sc.nextInt();
                }
            }
    
            // 한 번 출력해봄
    //        for (int i = 0 ; i < intA.length ; i++) {
    //            for (int j = 0 ; j <intA.length ; j++) {
    //                System.out.print(intA[i][j] + " ");
    //            }
    //            System.out.println();
    //        }
    
            int result = countPeak(n, intA);
            System.out.println(result);
    
        }
    
    }
