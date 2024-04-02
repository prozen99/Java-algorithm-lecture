import java.util.Scanner;

public class lecture09 {
    //자료검색 + 내가 혼자 해본 풀이.
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
        만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5 이고 이것을 자연수로 만들면 1205가 됩니다.
        추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

        ex) g0en2T0s8eSoft => 208
        문자열 전체를 한번씩 검사해서. 숫자만 걸러내야함.


         */

        String str=scanner.nextLine();//
        char[] c=str.toCharArray();
        StringBuilder number=new StringBuilder();//추출된 숫자를 하나로 만들기 위한 String Builder
        //char 문자열을 만들거나 String을 char[] 이용할때 결국 답처리는 StringBuilder를 사용해주면 좋다.
        //Charater 클래스를 사용하고 그결과값을 마지막에 String으로 바꾸는 경우 특히.
        //String
        for (int i = 0; i <str.length(); i++) {
            if(Character.isDigit(c[i])) // 문자열에서 숫자를 거르기 위해서 만든 조건문
            {

                number.append(c[i]);// 해당 숫자를 StringBuilder에 더해주기.
            }

        }

        int n =Integer.parseInt(number.toString()); // Integer라는 Wrapper 클래스의 parseInt (문자열 => 정수)
        // 해주는 메소드를 이용해서 StringBuilder 형태인 number를 .toString()으로 String으로 바꿔주고 그걸 다시 정수값으로
        //바꿔서 출력을 해주었다.
        System.out.println(n);



    }


}
