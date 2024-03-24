import java.util.Scanner;
// index of 와 SubString으로 문제를 풀어보자 .
public class lecture03_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();//문자열 하나 입력받기
        String answer=""; // 결과값을 위해서 빈 문자열 만들기
        int max=Integer.MIN_VALUE;
        int pos;//변수 선언

        while((pos=s.indexOf(" "))!=-1) //
           //지금 이코드는 공백이 발견되면 그 해당 인덱스 값을 내뱉고
            // 공백을 발견못하면 -1을 내뱉는다.
        {
            String tmp=s.substring(0,pos);//0부터 pos -1까지의 값을 내뱉어줌
            //예를들어 hello  => substring (2,4) 라고 하면 ll이 출력됨 인덱스로 2번과3번
            int len=tmp.length();//어차피 반복문 돌때마다 초기화 한다고 해도 상관없음 최댓값만 추출
            if(len>max)// 같다라고 한다하면 뒤쪽에서 똑같은 최댓값이 나오게 된다면 뒤쪽 단어로 갱신이 되버린다.
            {
                max=len;
                answer=tmp;
            }
            s=s.substring(pos+1);// pos(공백의 바로 다음글자)인덱스부터
            //끝 문자열 까지 를 시켜줌.
        }
        if(s.length()>max) //현재 s자체는 마지막 문자인 study이다
        {
            answer=s;
        }
        System.out.println(answer);
    }
}
