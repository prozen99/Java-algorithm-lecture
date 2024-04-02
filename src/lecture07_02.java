import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.lang.Math;
public class lecture07_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next().toUpperCase();//문자열 하나 입력받기
        int len=s.length();
        String answer="YES";
        Random random=new Random();
        for (int i = 0; i < len/2; i++) {
            if(s.charAt(i)!=s.charAt(len-i-1))
            {
                answer="NO";

            }
        }
        System.out.println(answer);
        System.out.println(random.nextInt(0,6)+1);

    }
}
