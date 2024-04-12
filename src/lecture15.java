import java.util.Scanner;

public class lecture15 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        피보나치 수열 피보 나치 수열은 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
        입력은 피보나치 수열의 총 항의 수이다. 만약 7이 입력되면 1 1 2 3 5 8 13 을 출력하면
        된다.
         */
        int n=scanner.nextInt();//반복 횟수 입력
        int [] arr=new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i <n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int x:arr)
        {
            System.out.print(x+" ");
        }
    }
}
