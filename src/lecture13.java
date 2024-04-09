import java.util.Scanner;

public class lecture13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서있는 학생의 키가 앞에서 부터 순서대로
        주어질 때 , 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
        (어떤 학생이 자기 앞에 서 있는 학생들보다 크면 그 학생은 보이고 , 작거나 같으면
        보이지 않습니다)

        입력예제
        8
        130 135 148 140 145 150 150 153
         */
        int n=scanner.nextInt();
        int [] arr=new int[n];
        int max=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();//8개 숫자 입력받기.

        }
        for (int i = 0; i <n; i++) {
           if(arr[i]>max)
           {
               max=arr[i];
               count++;
           }
        }
        System.out.println(count);
    }
}
