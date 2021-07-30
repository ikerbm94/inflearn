package Lecture3;

import java.util.Scanner;

public class Lecture3_1 {

    public static int[] sumArray(int n, int m, int[] nArray, int[] mArray) {

        // 합쳐질 int배열 만들기 (결과물)
        int[] result = new int[n+m];
        // result의 index
        int resultIndex = 0;
        // nArray의 index
        int nIndex = 0;
        // mArray의 index
        int mIndex = 0;

        // 두 배열 중 한 쪽의 index가 length와 맞어 떨어질때까지 크기를 비교하며 출력한다
        while ((nIndex != n) && (mIndex != m)) {

            // nArray의 값이 mArray의 값 보다 크면 mArray의 값을 result에 담고 mArray와 result의 index 값을 ++
            if (nArray[nIndex] > mArray[mIndex]) {
                result[resultIndex] = mArray[mIndex];
                resultIndex++;
                mIndex++;
            // nArray의 값과 mArray의 값이 같으면 둘다 result에 담고 모든 index 값을 ++
            } else if (nArray[nIndex] == mArray[mIndex]) {
                result[resultIndex] = nArray[nIndex];
                resultIndex++;
                result[resultIndex] = mArray[mIndex];
                resultIndex++;
                nIndex++;
                mIndex++;
            // mArray의 값이 nArray의 값 보다 크면 nArray의 값을 result에 담고 nArray와 result의 index 값을 ++
            } else if (nArray[nIndex] < mArray[mIndex]) {
                result[resultIndex] = nArray[nIndex];
                resultIndex++;
                nIndex++;
            }

        }

        // 두 배열 중 먼저 끝난 쪽이 nArray라면 mArray의 나머지 뒷부분을 result에 담는다
        if (nIndex == n) {
            while (resultIndex != n+m) {
                result[resultIndex] = mArray[mIndex];
                mIndex++;
                resultIndex++;
            }
        }

        // 두 배열 중 먼저 끝난 쪽이 mArray라면 nArray의 나머지 뒷부분을 result에 담는다
        if (mIndex == m) {
            while (resultIndex != n+m) {
                result[resultIndex] = nArray[nIndex];
                nIndex++;
                resultIndex++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // 값 받기
        Scanner sc = new Scanner(System.in);

        // n배열
        int n = sc.nextInt();
        int[] nArray = new int[n];
        for (int i = 0 ; i < n ; i++) {
            nArray[i] = sc.nextInt();
        }

        // m배열
        int m = sc.nextInt();
        int[] mArray = new int[m];
        for (int i = 0 ; i < m ; i++) {
            mArray[i] = sc.nextInt();
        }

        // 출력
        int[] result = sumArray(n, m, nArray, mArray);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}