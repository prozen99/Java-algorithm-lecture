import java.util.Scanner;

public class lecture11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // 문자열 하나 입력받기

        // 첫 번째 문자와 반복 횟수 초기화
        char prevChar = str.charAt(0);
        int count = 1;

        // 문자열을 순회하면서 압축된 문자열을 만듦
        for (int i = 1; i < str.length(); i++) {
            // 현재 문자와 이전 문자가 같으면 반복 횟수 증가
            //k2라고 치면 .
            if (str.charAt(i) == prevChar) {
                count++;
            } else { // 다른 문자가 나오면 지금까지의 압축된 문자열을 출력하고 다시 초기화
                if (count > 1) {
                    System.out.print(prevChar + "" + count); // 압축된 문자 출력
                } else {
                    System.out.print(prevChar); // 반복 횟수가 1인 경우 문자만 출력
                }
                // 다음 문자로 이동
                prevChar = str.charAt(i);
                count = 1; // 반복 횟수 초기화
            }
        }

        // 마지막 문자열 처리
        if (count > 1) {
            System.out.print(prevChar + "" + count); // 압축된 문자 출력
        } else {
            System.out.print(prevChar); // 반복 횟수가 1인 경우 문자만 출력
        }
    }
}
