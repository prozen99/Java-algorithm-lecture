import java.sql.SQLOutput;
import java.util.Scanner;

public class lecture14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        A,B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여
        A가 이기면 A를 출력하고 ,
        B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력하빈다.
        가위,바위,보의 정보는 1:가위 2:바위 3:보로 정하겠습니다
        N=5 라면
        A : 2 3 3 1 3
        B : 1 1 2 2 3
        승패 결과 : A B A B D(DRAW) 입니다.
         */
        int n=scanner.nextInt();//게임 횟수 n만큼 설정함
        int[] p1=new int[n];//플레이어 1의 배열
        int[] p2=new int[n];//플레이어 2의 배열

        // 승리 조건 : a는 c 를이기고 b한테지고
                //   b는 a를 이기고 c한테짐
                //   c는 b를 이기고 a한테짐
        for (int i = 0; i < n; i++) {
            p1[i]=scanner.nextInt();// 2 3 3 1 3


        }
        for (int i = 0; i < n; i++) {
            p2[i]=scanner.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(p1[i]==p2[i])//무승부
            {
                System.out.println("D"); //D출력
            }
            if(p1[i]==1&&p2[i]==3)// //p1이 가위이고 3을 이기니까
            {
                System.out.println("A");
            }
            if(p1[i]==1&&p2[i]==2)
            {
                System.out.println("B");
            }
            if(p1[i]==2&&p2[i]==1)//바위 vs 가위
            {
                System.out.println("A");
            }
            if(p1[i]==2&&p2[i]==3)
            {
                System.out.println("B");
            }
            if(p1[i]==3&&p2[i]==1)
            {
                System.out.println("B");
            }
            if(p1[i]==3&&p2[i]==2)
            {
                System.out.println("A");
            }
        }
    }
}
