import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.*;
public class lecture16 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        /*
        자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요
        만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로
        총8개입니다.

        첫줄에 자연수의 개수 N이 주어집니다

         */
        int n=scanner.nextInt();
        int [] ch=new int [n+1]; // 크기만 지정했으니 0값으로 초기화됨.
        int count=0;
        for (int i = 2; i <n+1 ; i++) {
            if(ch[i]==0)
            {
                count++;
                for (int j = i; j <n+1 ; j=j+i) {
                    ch[j]=1;
                }
            }
        }
        System.out.println(count);

    }
}
