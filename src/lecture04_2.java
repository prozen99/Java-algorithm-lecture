import java.util.ArrayList;
import java.util.Scanner;

public class lecture04_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        문자 뒤집기 만약에
        good 라면 = g랑 d로 뒤집고
        남은 oo끼리 짝지어서 뒤집음

         */
        int n=scanner.nextInt();//문자열 입력받을 개수
        String[] str=new String[n];
        ArrayList<String> answer=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            str[i]=scanner.next();//각각의 문자 hello ,good 같은 문자열 입력받기
        }

        for(String x:str) //문자 하나하나 교환하려면 String이 아닌 Char로 해야함.
        {
            char[] s=x.toCharArray();// x라는 단어를 가지는 String이 char 배열이 됨
            // 뭐 ex) hello 면 ['h','e','l','l','o']
            int lt=0, rt=x.length()-1; // 뭐 study라 치면 s가 lt y가 rt인거임
            //그래서 시작인덱스와 마지막 인덱스를 구성
            while(lt<rt)
            {
                char tmp=s[lt]; // s는지금char형 배열이고 삼단 교환하는 알고리즘
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;//마지막에서 하나씩 뒤로 가야 짝을 맞추면서 계속 바꿔줄수 있음.
                rt--;//마지막에서 하나씩 앞으로 와줘야 계속 바꿔내야함

            }
            String tmp=String.valueOf(s);
            answer.add(tmp);

        }
        for (String t:answer)
        {
            System.out.println(t);
        }


    }
}
