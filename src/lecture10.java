import java.util.Scanner;

public class lecture10 {
    public static void main(String[] args) {
        /*
        한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와
        떨어진 최소거리를 출력하는 프로그램을 작성하세요.

        입력설명 : 첫번재 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만
        주어집니다.
        문자열의 길이는 100을 넘지 않는다.

        출력설명 : 첫번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.

          뭐 만약 t라 치면 어칼거임?

         */
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine().toLowerCase();//문자열과 문자를 소문자로만 입력받기 위해서임.
        String str1=scanner.nextLine().toLowerCase();// 뒤에 문자열 하나 입력받을거임.

       char t=str1.charAt(0);// 내가 입력한 첫번째 문자를 기준으로 생성해줌.

        int []n1=new int[str.length()]; // 문자열 길이 만큼 생성

        for (int i = 0; i <str.length() ; i++) {
        if(str.charAt(i)==t)//t값이랑 같으면 만약에 .
        {
            n1[i]=0;// 인덱스간의 거리가 다르니까.
        }else{
            int d=Math.abs(i-str.indexOf(t));
            n1[i]=d;
        }



        }
        for(int index:n1)
        {
            System.out.print(index+" ");
        }

    }
}
