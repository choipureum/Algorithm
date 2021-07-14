package com.company;
import sun.awt.image.ImageWatched;
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main
{
    //bfs
    //Queue 이용
    //Remove Invalid Parentheses
    public static void main(String[] args)
    {
        String s = "(a)())()";
        String s2 = "()())()";
        System.out.println(removeInvalidParentheses(s));
    }
    public static List<String> removeInvalidParentheses(String s)
    {
        List<String> res = new ArrayList<>();
        if(s==null)return res;

        Queue<String>queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(s);
        visited.add(s);
        boolean found = false;

        //뽑기
        while(!queue.isEmpty())
        {
            int size = queue.size();
            for(int i=0;i<size;i++)
            {
                String str = queue.poll();
                if(isValid(str))
                {
                    res.add(str);
                    found = true; //=> 찾았다
                }
                if(found) continue;
                //0~7 => 하나씩 삭제 후 6자리로
                for(int j=0;j<str.length();j++)
                {
                    //1
                    if(str.charAt(j)!=')' && str.charAt(j)!='(') continue; //문자는 제외시킨다.
                    //2
                    String newStr = str.substring(0,j)+str.substring(j+1);
                    if(!visited.contains(newStr))
                    {
                        queue.offer(newStr);
                        visited.add(newStr);
                    }
                }
            }
        }
        return res;
    }
    public static boolean isValid(String str)
    {
        int count =0;
        for(char c: str.toCharArray())
        {
            if(c =='(')
            {
                count++;
            }
            else if(c==')')
            {
                count--; //())( 인경우를 걸러줘야한다 어떻게? => 음수
                if(count<0)
                {
                    return false;
                }
            }
        }
        return count==0;
    }



}
















