import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class lecture30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s=scanner.next(); //문자열 하나 받음.
        char[] array = s.toCharArray();
        int ac=0;
        int bc=0;
        int cc=0;
        int dc=0;
        int ec=0;
        int answer=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]=='A')
            {
                ac++;
            }
            if(array[i]=='B')
            {
                bc++;
            }
            if(array[i]=='C')
            {
                cc++;
            }
            if(array[i]=='D')
            {
                dc++;
            }
            if(array[i]=='E')
            {
                ec++;
            }
            answer=Math.max(ac,bc);
        }
        int[] arr1={ac,bc,cc,dc,ec};
        Arrays.sort(arr1);
        int max=arr1[arr1.length-1];
        if(max==ac)
        {
            System.out.println("A");
        }
        if(max==bc)
        {
            System.out.println("B");
        }
        if(max==cc)
        {
            System.out.println("C");
        }
        if(max==dc)
        {
            System.out.println("D");
        }
        if(max==ec)
        {
            System.out.println("E");
        }


    }
}
