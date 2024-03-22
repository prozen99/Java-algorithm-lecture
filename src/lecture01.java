import java.util.*;
public class lecture01 {

    public int solution(String str,char t)
    {
        int answer=0;
        str=str.toUpperCase();
        t=Character.toUpperCase(t);
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i)==t) answer++;
//        }ㅇㅇㅇㅇ


        for(char x :str.toCharArray())  // for each 에서 : 이후는 iterator가 와야함 배열 , 컬렉션객체
        {
            if(x==t)
            {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {


        lecture01 T =new lecture01();
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        char c=scanner.next().charAt(0);
        System.out.println(T.solution(str,c));



    }
}
