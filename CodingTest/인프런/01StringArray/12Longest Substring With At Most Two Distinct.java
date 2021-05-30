import java.util.*;

class Main {
  //Longest Substring With At Most Two Distinct
  public static void main(String[] args) 
  {
    String s = "ccaabbb";
    System.out.println(solve(s));
  }
  public static int solve(String s)
  {
    //1 ds
    int start =0,end=0,length=0, counter=0;
    Map<Character,Integer> map = new HashMap<>();
    
    //2 
    while(end < s.length())
    {
      char endChar = s.charAt(end); //c
      map.put(endChar, map.getOrDefault(endChar,0)+1);//c=2, a=2, b=3
      if(map.get(endChar)==1)
      {
        counter++;
      }
      end++;

      //3 C 2개삭제
      while(counter>2)
      {
        char startChar = s.charAt(start);
        map.put(startChar,map.get(startChar)-1);
        if(map.get(startChar)==0)
        {
          counter--;
        }
        start++;
      }

      length = Math.max(length, end-start);
    }
    return length;
  }
 
}


