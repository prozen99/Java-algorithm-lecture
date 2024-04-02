import java.util.ArrayList;
import java.util.Scanner;

public class lecture06 {
    /*
    소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고
    출력하는 프로그램을  작성하세요
    중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다

    aabbcc => a bc
    ksekkset => kset 이렇게 나와야하고 .
    문자열이 같다 ?

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();//문자열 하나 입력받기
        //aabbcc => 어떻게 확인할거야 ? 하나씩 ?
        //중복제거
        String answer="";//결과값을 담을 String.

        for (int i = 0; i <s.length() ; i++) {
            //System.out.println(s.charAt(i)+" "+i+" "+s.indexOf(s.charAt(i)));
            if(i==s.indexOf(s.charAt(i)))//참일때만 중복이 안된거임
            {
                answer=answer+s.charAt(i);
            }
        }
        System.out.println(answer);


    }
}
