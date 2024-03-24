import java.util.Scanner;

public class lecture03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        한개의 문장이 주어지면 그 문장속에서 가장 긴 단어를 출력하는 프로그램
        문장속의 각 단어는 공백으로 구분 .
         ex) it is time to study => it // is // time // to // study
         이렇게 해서 공백기준으로 문자열을 구분해야함

         1.문자열을 일단 분리해야함

         */
        String s=scanner.nextLine();//문자열 하나 입력받기.
        String answer="";//정답이 들어갈 문자열
        int max=Integer.MIN_VALUE;//가장 작은숫자로 저장됨 -21341231어쩌구
        String [] s1=s.split(" ");//it is time to study 이렇게 하나씩 떨어져서 되어있을거임
        for(String x:s1) // 향상된 포문 배열 전체 찍기
        {
            int len=x.length(); //각각의 문자열에서 막힌거긴 했는데 배열의 각요소에 길이를 구해줘야함.
            if(len>max) //문자열의 길이가 최댓값보다 크면 max값에다가 len값을 넣어주게 되는거임.
            {
                max=len;
                answer=x; //최대일때 문자열을 넣어주는것임.
            }

        }
        System.out.println(answer);






    }
}
