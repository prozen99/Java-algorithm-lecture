import java.util.Scanner;

public class lecture02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char [] t=s.toCharArray();
        String s1="";



        for (int i = 0; i < t.length; i++) {
            if(Character.isLowerCase(t[i]))
            {
                s1+=Character.toUpperCase(t[i]);


            }
            else if(Character.isUpperCase(t[i]))
            {
                s1+=Character.toLowerCase(t[i]);

            }
        }
        System.out.println(s1);
    }
}
