import java.util.Scanner;

public class lecture28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        만약 N=15이면
        7+8=15
        4+5+6=15
        1+2+3+4+5=15
        양의 정수 N을 입력받으면 2개 이상의 연속된 자연수의 합으로 정수N을 표현하는 방법의 가짓수를 출력하는 프로그램
        작성

        "연속된 " 자연수의 합  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        2개이상
        3개이상
        4개이상 등등
         */
        int n=scanner.nextInt(); // n을입력받는데 입력 case 생각하면 15라 생각
        int count=0;
        int start=1;
        int last=1;
        int sum=1; // 배열 없이 그냥 인덱스로만 해보자
        while(last<n)
        {
            if(sum==n)
            {
                count++;
                last++;
                sum=sum+last;
            }else if(sum>n)
            {
                sum=sum-start;
                start++;
            }
            else if(sum<n)
            {
                last++;// 1 2 3 4 5 6=> 15면 처음에 sum 1 이니까 last 2로 올림
                sum=sum+last;
            }

        }
        System.out.println(count);




    }
}
