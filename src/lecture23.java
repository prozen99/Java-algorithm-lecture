import java.util.Scanner;

public class lecture23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        문제가 너무길어서  패스
         */
        int n= scanner.nextInt();//4 학생수
        int m=scanner.nextInt();//3 테스트 회수
        int answer=0;
        int [][]arr=new int[m][n];// 학생수 4x4
        for (int i = 0; i < m; i++) { //1 ~n
            for (int j = 0; j < n; j++) { // 1 ~n
                arr[i][j]=scanner.nextInt();
            }
        }

        for (int i = 1; i <=n ; i++) { //학생 1번이 2번보다 m번의 테스트에서 앞에 있는지 체크해야하니까, 이중 포문
            for (int j = 1; j <=n ; j++) { //학생번호로 1부터 4까지
                int cnt=0;
                for (int k = 0; k <m ; k++) {
                    int pi=0; int pj=0;
                    for (int s = 0; s <n ; s++) { // 0등부터 라는 표현이 이상하긴 하지만 , 학생수가 4명이면 등수는 0,1,2,3
                        if(arr[k][s]==i)// k번째 테스트의 s등수인 사람이 i 라면
                        {
                            pi=s; // 등수값
                        }
                        if(arr[k][s]==j)//k번째 테스트의 s등수인 사람이 j 라면
                        {
                            pj=s; // 그때의 등수값
                        }

                    }
                    if(pi<pj)// i학생이 j 학생보다 등수가 높다면
                    {
                        cnt++;
                    }

                }
                if(cnt==m) // i학생이 j학생보다 등수가 높은 상황이 테스트 횟수 만큼 반복되면
                {
                    answer++;//정답인 경우니까 하나의 경우의수로 취급하는 것임.
                }
            }
            
        }
        System.out.println(answer);

        // (3,1) , (3,2) ,(4,2)가 정답임.


    }
}
