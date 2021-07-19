package com.company;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine(); //<ab cd>ef gh<ij kl>
        String result ="";
        //1. 공백을 기준으로 reverse
        //2. 태그는 x
        boolean sw =true;
        //임시열
        String tmp ="";

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            switch (ch)
            {
                case '<':
                    if(sw)
                    {
                        result+=reverseString(tmp);
                    }
                    tmp="";
                    result+=ch;
                    sw = false;
                    break;
                case '>':
                    result+=ch;
                    sw= true;
                    break;
                case ' ':
                    if(sw)
                    {
                        result+=reverseString(tmp);
                    }
                    result+=ch;
                    tmp="";
                    break;
                default:
                    if(sw) //true
                    {
                        tmp+=ch;
                    }
                    else //false
                    {
                        result+=ch;
                    }
            }
        }
        if(tmp!="" && sw)
        {
            result+=reverseString(tmp);
        }
        System.out.println(result);

    }
    //문자열 역순
    public static String reverseString(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        String reversedStr = sb.reverse().toString();
        return reversedStr;
    }
}

















