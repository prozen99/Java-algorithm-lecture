import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class lecture26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> answer=new ArrayList<>();
        int sum=0;
        int max=0;

        int n=scanner.nextInt();
        int k=scanner.nextInt(); // 몇개씩 싸잡아서 매출을 확인 할 것인지
        int [] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=scanner.nextInt();
        }

        for (int i = 0; i <k ; i++) {
            sum+=a[i];
        }
        answer.add(sum); // 첫번째 값을 넣어 주는 부분을 제대로 확인해야함.
        // sum+a[i]-arr[i-k]  가 제대로 된 알고리즘임.
        for (int i = k; i < n; i++) { // 3부터 10까지
            sum=sum+a[i]-a[i-k]; //이렇게 하면
            answer.add(sum); //모든 합을 넣었겠지
        }

        max=Collections.max(answer);
        System.out.println(max);



    }
}
