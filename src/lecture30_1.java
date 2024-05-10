import java.util.HashMap;
import java.util.Scanner;

public class lecture30_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str=scanner.next();//문자열 하나 입력받기
        char answer=' ';
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x: str.toCharArray())
        {
            map.put(x,map.getOrDefault(x,0)+1); // getOrDefault => key가 존재하지 않으면 0 을 가져오는거임.
        }
        int max=Integer.MIN_VALUE;
        for(char key : map.keySet())//keySet이 존재하는 key를 다 탐색해줌
        {
            if(map.get(key)>max)
            {
                max=map.get(key);
                answer=key;//알파벳이었으니까 key가 답임.

            }
        }
        System.out.println(answer);

    }
}
