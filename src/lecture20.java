import java.util.Scanner;

public class lecture20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        /*
        5*5 격자판에 아래로 같이 숫자가 적혀있습니다
        10 18 10 12 15
        12 30 30 25 11
        11 25 50 53 15
        19 27 29 37 27
        19 18 30 13 19
        각 행의 합 , 각 열의 합 , 두 대각선의 합 중 가장큰합을 출력합니다.

         */
        int n=scanner.nextInt();
        int [][] arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scanner.nextInt();
            }
        }
        int hsum;// 행의 합
        int csum;//열의합
        int answer=Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            hsum=csum=0;
            for (int j = 0; j <n ; j++) {
               hsum+=arr[i][j];//행번호 고정
               csum+=arr[j][i];// 열번호 고정
            }
            answer=Math.max(answer,hsum);//두값중 최댓값 초기화
            answer=Math.max(answer,csum);//두값중 최댓값 초기화
        }
        hsum=csum=0;
        for(int i=0;i<n;i++)
        {
            hsum+=arr[i][i];//행열 번호가같음.
        }

        for(int i=n-1;i>=0;i--)
        {
            csum+=arr[i][i];
        }

        answer=Math.max(answer,hsum);
        answer=Math.max(answer,csum);
        System.out.println(answer);


    }
}
