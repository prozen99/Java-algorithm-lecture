import java.util.ArrayList;
import java.util.Scanner;

public class lecture24_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //앞선 두가지의 배열 문제 투포인터로 풀어보기
        ArrayList<Integer> answer=new ArrayList<>();
        int n=scanner.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int[] b=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=scanner.nextInt();
        }

        int p1=0,p2=0;// 두개의 포인터는 첫번째랑 두번째를 가르킴

        while(p1<n&&p2<m) // 두개의 포인터를 두고
            //p1이나 p2가 되었건 순서 말하는거임
        {
            if(a[p1]<b[p2])
            {
                answer.add(a[p1++]);//값이 작으면 리스트에 넣음.
                //후위 연산자를 이용해서 a[p1]의 값을 넣고 , 그다음에 ++로 넣어줌.
            }
            else{
                answer.add(b[p2++]);
            }
        }
        while(p1<n) answer.add(a[p1++]); // n 배열이 남으면 값을 넣어주는것임
        while(p2<m) answer.add(b[p2++]);

        for (int x:answer)
        {
            System.out.print(x+" ");
        }

    }
}
