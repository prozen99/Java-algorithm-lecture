import java.util.Scanner;

public class lecture08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        앞에서 읽을 때나 뒤에서 읽을때나 같은 문자열을 팰린드롬
        이라고 합니다
        문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES" 아니면 "NO" 를 출력하는 프로그램을 작성하세요
        단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며 , 대소문자를 구분하지 않습니다.
        알파벳 이외의 문자들은 무시합니다.

        => 알파벳만 회문검사함.
        */
        String str=scanner.nextLine();//한줄 읽기
        String answer="NO";
        str=str.toUpperCase().replaceAll("[^A-Z]",""); // 대문자 A부터 Z까지가 아니면
        //^가 부정임 그리고 replaceAll 자체는 정규식 쓸수있는데 , replace는 정규식 사용못함.
        //System.out.println(str);// 대문자로 바꾸고 알파벳만 딱 가져옴
        //FOUNDTIMESTUDYYDUTSEMITDNUOF 이렇게 나옴 결과값이
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp))
        {
            answer="YES";
        }
        System.out.println(answer);




    }
}
