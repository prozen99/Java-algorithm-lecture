import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Scanner;

public class lecture05 {
    /*
    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
a#b!GE*T@S
S#T!EG*b@a

=> 알파벳이면 뒤집고 특수문자면 아무 일 안하게 두기
=> 알파벳인지 // 특수문자인지 구분하는게 필요함 .
=> 아스키코드를 이용하자 , 어차피 알파벳이면 뒤집으니까 => 알파벳이 아니면 ? 이라는 거로 접근하자
=>

     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();//문자열 하나를 입력받음
        char c[]=str.toCharArray();//char형 문자열로 바꿈 어차피 문자열 하나니까.
        String answer="";
        int lt=0;// 맨앞 문자를 가르킴
        int rt=str.length()-1; // 맨끝 문자를 가르킴
        while(lt<rt) // 이 알고리즘을 기억을 남기자 .
        {
            if(!Character.isAlphabetic(c[lt])) //lt가 알파벳이 아니면
            {
               lt++;
            }
            else if(!Character.isAlphabetic(c[rt])) //rt가 알파벳이아니면
            {
                rt--;
            }
            else{ //이러면 둘다 알파벳인거임
                char tmp=c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;
                rt--;
            }


        }
        answer=String.valueOf(c);//c 라는 char 배열을 String으로 변경시켜준다

        System.out.println(answer); // 어차피 char 출력보다는 String으로 변경시키는게 더 편리하다.






    }
}
