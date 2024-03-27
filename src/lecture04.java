import java.util.ArrayList;
import java.util.Scanner;

public class lecture04 {
    /*
    두번쨰 줄부터 N개의 단어가 각 줄에 하나씩 주어진다 . 단어는 영어 알파벳으로만 구성되어 있다.
    good = >  d o o g 로 만드는 알고리즘 생각
    0,1,2,3  => 3 2 1 0 으로 순서를 바꿔야함
    ArrayList를 이용한 구현
     */
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      int n=scanner.nextInt();//문자열을 받아올만큼 입력
        ArrayList<String> answer=new ArrayList<>(); // 컬렉션 ArrayList를 사용해줌
        String[] str=new String[n];// 입력받고 싶은 문자열 만큼 크기조정
        for (int i = 0; i < n; i++) {
            str[i]=scanner.next();//문자열 입력
        }
        for (String x:str) // 향상된 for문을 이용해주는 부분이고 ,
        {
            String tmp=new StringBuilder(x).reverse().toString();
            //입력받은 배열의 각각의 요소x를 stringBuilder로 만들어서 하나의 문자열 생성하고
            // 그 문자열을 reverse 뒤집어주고 이 뒤집어준 것들은 다시toString으로 형변환을 해줘야 (Object =>String)
            // tmp에다가 넣을수 있다
            //그리고 컬렉션 ArrayList는 값을 넣어줄때 .add로 값을 추가해주는 것 잊지 말자.
            answer.add(tmp); // answer 의 값은 olleh , hello , good 입력시 = > hello , olleh , doog 로 나옴.


        }
        for(String x:answer)
        {
            System.out.println(x);//배열의 각요소를 출력하고 싶어서 향상된 for문 이용
            //원래는 answer만 출력하게 될 경우 [hello,olleh,doog]만 출력되게 된다.
        }


    }
}
