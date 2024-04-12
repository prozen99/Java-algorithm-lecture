import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class lecture17 {
    public static boolean isPrime(int num)
    {
        if(num==1) return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면  그 소수를
        출력하는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면 23이고, 23은 소수이다.
        그러면 23을 출력한다. 단 910을 뒤집으면 19로 숫자화 해야한다. 첫 자리부터의
        연속된 0은 무시한다.

        입력예제
        9
        32 55 62 20 250 370 200 30 100

        출력예제
        23 2 73 2 3

         */
        int n=scanner.nextInt();//숫자 입력받기
        int[] arr=new int[n];// 입력받은 만큼의 수를 위한 배열 생성
        ArrayList<Integer> answer=new ArrayList<>(); //정답을 받을 ArrayList만듬.
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();//숫자 입력
            //32 55 62 20 250 370 200 30 100 등등

        }
        // 밑에 Swap 하는 알고리즘 구현 .
        for(int i=0;i<n;i++)
        {
           int tmp=arr[i]; // 만약 32라고 하면 32를 입력받고
           int res=0; // reverse를 위한 변수 res 만들고
            while(tmp>0)
            {
                int t=tmp%10; //t값은 32 => 2 참고: 어떤수를 10으로 나눈나머지는
                // 항상 나머지가 일의 자리의 수가 됨 여기서는 t=2
                res=res*10+t;//res는 2로 변함 1트에
                tmp=tmp/10;//tmp는 32니까 3

                /*
                    2회 시행때는 tmp는 3 res는 2니까
                    2*10 +3 =23이 되고
                    3회 시행에는 tmp가 3이 되고 3/10 =0 이 되버리면서
                    조건문을 탈출 하게 된다.
                 */
                arr[i]=res;
            }

        }
        for (int i = 0; i < n; i++) {
            if(isPrime(arr[i]))
            {
                answer.add(arr[i]);
            }
        }

        for (int x:answer)
        {
            System.out.print(x+" ");
        }





    }
}
