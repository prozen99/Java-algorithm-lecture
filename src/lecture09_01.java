import java.util.Scanner;

public class lecture09_01 {
    /*
    선생님 풀이
    수학적 식을 이용해서 풀어주기
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int answer=0;
        String str=scanner.nextLine();//문자열 하나받기.
        for(char x:str.toCharArray())
        {
            if(x>=48 && x<=57) //아스키 넘버 '0' =48이고 '9'가 57인데 자주나오는 부분이니까
                //암기 해놓으면 좋음
            {
                answer=answer*10+(x-48);//문자열 x가 48이면 0이니까.
                //십의 자리와 일의자리를 구현해주는 부분인것 같다.
                //char는 정수형 ,
            }
        }
        System.out.println(answer);
    }
}
