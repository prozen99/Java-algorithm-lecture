import java.util.ArrayList;
import java.util.Scanner;

public class lecture18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
        여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서
        다음과 같이 점수 계산을 하기로 하였다. 1번 문제가 맞는 경우에는 1점으로 계산한다.
        앞의 문제에 대해서는 답을 틀리다가 답이 맞는  처음 문제는 1점으로 계산한다.
        또한 , 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점 , 세번째문제는 3점
        , K번쨰 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다

           입력예제 1
           10
           1 0 1 1 1 0 0 1 1 0
           출력예제
           10
         */
        int n=scanner.nextInt();
        int [] arr=new int[n];
        int [] result=new int[n];
        int count=0; // 점수 집계를 위한 값.
        int sum=0;
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();//숫자 입력
        }
        for (int i = 0; i < n; i++) {

            if(arr[i]==1)//정답인 경우
            {
                count++;
                sum+=count;

            }
            else if(arr[i]==0){

                count=0;
            }
        }
        System.out.println(sum);





    }
}
