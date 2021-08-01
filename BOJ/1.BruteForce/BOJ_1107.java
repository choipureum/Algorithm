package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    static boolean [] broken_channel;
    static int cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n= Integer.parseInt(br.readLine()); // 채널
        int m = Integer.parseInt(br.readLine()); // 고장난 채널
        broken_channel = new boolean[10]; //0~9 채널생성
        Arrays.fill(broken_channel,false);

        if(m!=0)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<m;i++)
            {
                int idx =Integer.parseInt(st.nextToken());
                broken_channel[idx] = true;
            }
        }
        if(n ==100){
            System.out.println(0);
            return;
        }
        int maxNum = Math.abs(n-100); // 초기채널 최대 버튼 누르기 수

        //전체탐색
        for(int i=0;i<1_000_000;i++) //전체탐색
        {
            int len = check(i);

            if(len>0)
            {
                int press = Math.abs(i-n); //len =5455 , n = 5457 , press =2
                maxNum = Math.min(maxNum,press+len);
            }
        }
        bw.write(maxNum+"\n");
        bw.flush();
        bw.close();
    }
    public static int check(int channel)
    {
        //1. error check => 0이면 나눌때 0나누기 에러
        if(channel ==0)
        {
            if(broken_channel[channel]) //채널 ==0, 깨진것도 0 => 깨진게 잇으면안됨
                return 0;
            else
                return 1;

        }
        //2
        int len=0;
        while(channel>0)
        {
            int idx = channel%10; //한자리식확인
            if(broken_channel[idx]) //깨진게 존재하면
            {
                return 0;
            }
            len+=1;
            channel = channel/10;
        }
        return len;
    }


}
