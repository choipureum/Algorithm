package com.company;
import java.util.*;


public class Main
{
    static Scanner sc = new Scanner(System.in);
    static String input = "";
    static String result="";
    public static void main(String[] args)
    {
        Stack<Character> left_stack = new Stack<>();
        Stack<Character> right_stack = new Stack<>();

        input = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        //1 ds
        for(char ch : input.toCharArray())
        {
            left_stack.add(ch);
        }
        //{a,b,c,d} { }

        for(int i=0;i<n;i++)
        {
            //L(왼쪽), D(오른쪽), B(삭제),  P $(추가)
            String order = sc.nextLine();
            char flag = order.charAt(0);
            switch (flag)
            {
                case 'L':
                    //존재할때
                    //{a,b,c}{d}
                    //{a,b}{d,c}
                    if(!left_stack.isEmpty())
                    {
                        char ch = left_stack.pop();
                        right_stack.push(ch);
                    }
                    break;
                case 'D':
                    //존재할때
                    //{a,b}{d,c}
                    //{a,b,c}{d}
                    if(!right_stack.isEmpty())
                    {
                        char ch = right_stack.pop();
                        left_stack.push(ch);
                    }
                    break;
                case 'B':
                    if(!left_stack.isEmpty())
                    {
                        left_stack.pop();
                    }
                    break;
                case 'P':
                    char str = order.charAt(2);
                    left_stack.push(str);
                    break;
            }
        }
        // 다시 string 조립
        while(!left_stack.isEmpty()) {
            right_stack.push(left_stack.pop());
        }

        while(!right_stack.isEmpty())
        {
            result+=right_stack.pop();
        }
        System.out.println(result);
    }
}
















