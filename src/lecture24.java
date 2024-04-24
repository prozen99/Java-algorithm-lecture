import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lecture24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

         */
        int n=scanner.nextInt();
        int[] arr1=new int[n]; //3


        ArrayList<Integer> answer=new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            arr1[i]=scanner.nextInt();
            answer.add(arr1[i]);
        }
        int p=scanner.nextInt();
        int[] arr2=new int[p];//

        for (int i = 0; i < p; i++) {
            arr2[i]=scanner.nextInt();
            answer.add(arr2[i]);
        }
        Collections.sort(answer);

        for(int x:answer)
        {
            System.out.print(x+" ");
        }





    }
}
