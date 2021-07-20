package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        String input;

        while((input = br.readLine()) != null)
        {
            char [] splitStr = input.toCharArray();
            int [] type = new int[4];
            int strLength = splitStr.length;

            for(int i=0;i<strLength;i++)
            {
                char ch = splitStr[i];

                if(ch>='a' && ch<='z') //소문자
                {
                    type[0]++;
                }
                else if(ch>='A' && ch<='Z') //대문자
                {
                    type[1]++;
                }
                else if(ch>='0' && ch<='9') //숫자
                {
                    type[2]++;
                }
                else if(ch ==' ') // 공백
                {
                    type[3]++;
                }

            }
            print(type);
            bw.flush();
        }
    }
    private static void print(int [] arr) throws IOException
    {
        for(int n: arr)
        {
            bw.write(String.format(n+" "));
        }
        bw.write(String.format("\n"));
    }
}
















