import java.util.ArrayList;
import java.util.Scanner;

public class lecture12_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> answer=new ArrayList<Integer>();

        /*
        N(1<=N<=100) 개의 정수를 입력받아 , 자신의 바로
        앞 수 보다 큰 수만 출력하는 프로그램을 작성하세요
        (첫번째 수는 무조건 출력한다)
        입력 예시
        6
        7 3 9 5 6 12

        출력 예시
        7 9 6 12
         */

        int n=scanner.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
            // 7 3 9 5 6 12 입력받음.
        }
        answer.add(arr[0]); // 첫번째 꺼는 무조건 출력
        for (int i = 1; i < n; i++) {
            if(arr[i]>arr[i-1]) //자신의 바로 앞수를 비교해서 큰수를 뽑아내는 것.
            {
                //System.out.print(arr[i+1]+" ");
                //근데 이런식으로 구현하려고 하니까
                //일반 배열로는 첫번째 항을 가져가면서 출력하는 것이 생각이 안남
                //그래서 answer 라는 ArrayList를 써야함
                // 동적 배열 => ArrayList => 일반 적인 배열로 특정조건을 만족하는
                // 애들을 넣어서 새로운 배열을 만들기가 편함.
                answer.add(arr[i]);

            }
        }
        for (int x:answer)
        {
            System.out.print(x+" ");
        }
    }

}
