import kotlin.collections.ArraysKt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class lecture19 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*
        N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을
        작성하세요.
        같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
        즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이된다.

        첫줄에 N이 입력되고 , 두번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.

        입력예제 1
        5
        87 89 92 100 76

        출력예제 1
        4 3 2 1 5
         */
        int n=scanner.nextInt();// 성적을 몇명 입력받을지.
        int r[]=new int[n];//학생 국어 성적을 입력하는 배열 . exit
        int answer []=new int[n];//정답 배열 만들기.

        for (int i = 0; i <n ; i++) {
            r[i]=scanner.nextInt();//국어 성적 입력받기

        } //87 89 92 100 76 이라 치면 어케 하실?
        // 정렬을 해야하지 않을까? 정렬 한대로 점수 두면 되잖음
        for (int i = 0; i <n ; i++) {
            int count=1; // 등수값을 늘리기 위해서 하나 넣어줌 그냥 .
            for (int j = 0; j < n; j++) {
                if(r[j]>r[i])
                {
                    count++;
                }
            }
            answer[i]=count;
        }

        for (int i = 0; i <n ; i++) {
            System.out.print(answer[i]+" ");
        }



    }

}
