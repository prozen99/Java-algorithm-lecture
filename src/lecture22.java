import java.util.Scanner;

public class lecture22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        임시반장 정하기
        김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
        김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에
        정식으로 선거를 통해 반장을 선출하려고 한다.
        그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던
        사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
        그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만듬
         5
    2 3 1 7 3
    4 1 9 6 8
    5 5 2 4 4
    6 5 2 6 7
    8 4 2 2 2
            예시출력
            4
         */

        int n=scanner.nextInt();
        int [][] arr=new int[n+1][6];//1~5학년 크기를 j열에 만들기 위해서 6으로 고정시켜줌.
        //학생자체는 사람이 많을수도 있으니 n+1로해줌.
        int max=0;
        int answer=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=5 ; j++) { //학년
                arr[i][j]=scanner.nextInt();
            }
        }
        for (int i = 1; i <= n; i++) { //i번쨰 학생
            int result=0;
            for (int j = 1; j <=n ; j++) { //j번째 학생
                for (int k = 1; k <=5; k++) { //학년
                    if(arr[i][k]==arr[j][k])
                    {
                        result++;
                        break;
                    }
                }
            }
            if(result>max)
            {
                max=result;
                answer=i;
            }
        }
        System.out.println(answer);



    }
}
