import java.util.Arrays;
import java.util.Scanner;

public class lecture27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=scanner.nextInt();
        }

        int count=0;
        for (int i = 0; i <n ; i++) {
            int sum=arr[i];
            for (int j = i+1; j <n ; j++) {
                sum=sum+arr[j];
                if(sum==m)
                {
                    count++;
                }
                else if(sum>=m)
                {
                    break;
                }

            }
        }

        System.out.println(count);








    }
}
