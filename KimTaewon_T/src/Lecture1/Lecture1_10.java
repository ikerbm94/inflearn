package Lecture1;

import java.util.Scanner;

// 강의 내용
public class Lecture1_10 {

    // 반복문으로 앞에서 뒤로 한 번, 뒤에서 앞으로 한 번씩 거쳐가면서 거리를 계산한다
    public static int[] evaluateDistance(String input1, char input2) {

        // 받은 문자열과 길이가 같은 int배열을 따로 하나 만든다
        int[] iArr = new int[input1.length()];
        // 비교값을 아무렇게 잡아도 상관없는 이유는 앞뒤로 처음 해당 글자가 나올때까지의 거리는 단순히 ++이거나 --이기 때문이다
        // 하지만 반드시 문자열의 길이보다는 높게 잡는 것이 좋다
        int compare = 100;

        for (int i = 0 ; i < input1.length() ; i++) {
            // i번째에 해당 글자가 있다면 비교값에 1을 더하고 int[i]에 비굣값을 넣는다
            if (input1.charAt(i) == input2) {
                compare = 0;
                iArr[i] = compare;
            // 해당 글자가 아니라면 비교값에 1을 더하고 그 비굣값을 int[i]에 넣는다
            } else {
                compare++;
                iArr[i] = compare;
            }
        }

        // 비교값 초기화
        compare = 100;

        for (int i = input1.length() - 1 ; i >= 0 ; i--) {
            // 다시 뒤에서 부터 오면서 해당 글자가 나오면 비교값을 0으로 초기화한다
            if (input1.charAt(i) == input2) {
                compare = 0;
            // 해당 글자와의 거리를 앞쪽에서 쟀을때와 뒤쪽에서 쟀을때, 둘 중 거리가 짧은 수를 iArr[i]에 넣는다
            } else {
                compare++;
                iArr[i] = Math.min(iArr[i], compare);
            }
        }

        // 완성
        return iArr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        char input2 = sc.next().charAt(0);
        int[] iArr = evaluateDistance(input1, input2);

        // 출력하기
        for (int i = 0 ; i < iArr.length ; i++) {
            if (i != iArr.length - 1) {
                System.out.printf("%d ", iArr[i]);
            } else {
                System.out.print(iArr[i]);
            }
        }

    }

}

// System.out.println(Arrays.toString(배열));
// 배열 출력 방법

// Math.min(int i1, int i2)
// 둘 중 작은 수