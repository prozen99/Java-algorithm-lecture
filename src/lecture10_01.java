import java.util.Scanner;

public class lecture10_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();//문자열 하나 입력받기
        char c=scanner.next().charAt(0);//입력 받은 문자열의 맨앞 글자를칭함.
        int [] answer=new int[s.length()]; // 거리를 계산할 배열을 하나만듬.
        int p=1000; // 거리를 저장할 변수를 하나 만듬 근데 엄청나게 크게 거리를만듬.
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==c) //그 문자열인지 확인함.
            {
                p=0;
            }
            else{
                p++;
            }
            answer[i]=p;
        }
        p=1000; // 다시 거리를 초기화시켜줌
        // 뭐 만약 teacher e라치면
        // 1001 0 1 2 3 0 1 이렇게 될텐데.
        // 이걸 1 0 3 2 1 0 1001 이렇게 거꾸로 한번더 스캔 해줄 거임
        //    1001 vs 1 이 되는데 작은값으로 answer[i]=Math.min(answer[i],p);일케해줌
        // 1골라줌 0
        for (int i=s.length()-1;i>=0;i--) // 마지막 인덱스 length()-1부터 뺴줌
        {
            if(s.charAt(i)==c) p=0;//p값은 0 넣으면 됨.
            else{
                p++;
                answer[i]=Math.min(answer[i],p); // 거꾸로 돌아서
                // 비교하는데 만약에 뭐
            }
        }
        for(int idx:answer)
        {
            System.out.print(idx+" ");
        }
    }
}
