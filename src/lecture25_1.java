import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lecture25_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> answer=new ArrayList<>();

        int n=scanner.nextInt();
        int [] a=new int[n];

        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int [] b=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=scanner.nextInt();
        }
        int p1=0,p2=0;
        Arrays.sort(a);//오름차순 정렬  했음
        Arrays.sort(b);// 오름차순 정렬 했음
        // 1 2 3 5 9      4 5 6 7 8
        // 2 3 5 7 8      1 2 3 4 5
        while(p1<n&&p2<m)
        {
          if(a[p1]==b[p2]) // 값이 같으면
          {
              answer.add(a[p1++]); // p1의 값을 뒤에서 늘려주는거임.
          }
          else if(a[p1]<b[p2])
          {
              p1++;
          }
          else if(a[p1]>b[p2])
          {
              p2++;
          }

        }
        for(int x:answer)
        {
            System.out.print(x+" ");
        }




    }
}
