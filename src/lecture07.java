import java.util.ArrayList;
import java.util.Scanner;

public class lecture07 {
    /*
    앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 한다.
    문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES" , 회문 문자열이 아니면 "NO"를 출력하는
    프로그램을 작성하세요.
    단 회문 검사할때 대소문자 구분하지 않음
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next().toLowerCase();//문자열 하나입력받기
        int len=s.length();//문자열 길이 받기
        boolean isPaln=true; // 불리언 값 판단하기 .
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i)!=s.charAt(len-i-1))
            {
               isPaln=false;
               return;
            }



        }
        if(isPaln)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }
}
