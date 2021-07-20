package com.company;
import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException
    {
        String input = br.readLine(); //bakj...
        char [] charArr = input.toCharArray(); //{b,a,k ...}
        StringBuilder sb = new StringBuilder(); //결과 문자열

        int idx;
        for(char ch: charArr)
        {
            if(ch >= 'A' && ch<='Z') //대문자
            {
                idx = ch+13;

                if(idx>'Z')
                {
                    idx -=26;
                }
                sb.append((char)idx);
            }
            else if(ch >= 'a' && ch<='z') //소문자
            {
                idx = ch+13;
                if(idx>'z')
                {
                    idx -= 26;
                }
                sb.append((char)idx);
            }
            else //공백 || 숫자
            {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
        //bw.write(String.format(sb.toString()));
        //bw.flush();
    }
}
















