import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class lecture31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.next();
        String s2=scanner.next();
        //AbaAeCe 면 일단 = > A(2) b(1) a (1) C(1) e(2)
        Map<Character,Integer> map1=new HashMap<>();//
        Map<Character,Integer> map2=new HashMap<>();//2번째 문자열을 넣을 맵
        for (char c:s1.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c:s2.toCharArray())
        {
             map2.put(c,map2.getOrDefault(c,0)+1);
        } // AbaAeCe => A(2) ,a(1),b(1),C(1),e(2)  baeeACA => b(1) ,a(1),e(2) ,A(2) ,C(1)
        //키값이 같으면 Value값도 같아야함 .
        String answer="YES";
        for (char key:map1.keySet())
        {
            if(map2.containsKey(key)&&map1.get(key)==map2.get(key)) // map1의 key가 map2에도 존재한다면 이때 value값이 같아야함.
            {

            }else{
                answer="NO";
            }

        }
        System.out.println(answer);



    }
}
