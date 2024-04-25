
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lecture25 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> answer=new ArrayList<>();
        int n=scanner.nextInt();
        int[] a=new int[n];

        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }

        int m=scanner.nextInt();
        int[] b=new int[m];

        for (int i = 0; i <m ; i++) {
            b[i]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                if(a[i]==b[j])
                {
                    answer.add(a[i]);
                }
            }
        }
        Collections.sort(answer);

        for (int x:answer)
        {
            System.out.print(x+" ");
        }




    }
}
