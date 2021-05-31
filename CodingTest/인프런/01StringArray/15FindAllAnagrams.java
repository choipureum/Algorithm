import java.util.*;

class Main {
  //Find Anagrams Mapping
  public static void main(String[] args) 
  {
    String txt = "BACDGABCDA";
    String pat ="ABCD";

    System.out.println((findAnagrams(txt,pat)));
  }
  public static List<Integer> findAnagrams(String txt, String pat)
  {
    //1 ds
    List<Integer> result = new ArrayList<>();
    if(txt==null || txt.length()==0 ||pat==null|| pat.length()==0|| txt.length()<pat.length())
    {
      return result;
    }
    //아스키코드 값이 있으면 해당위치  +1
    int[] patArr = new int[256]; // [0,0,0,0,0,0,1,1,1,1,0,0,0]
    for(int i=0;i<pat.length();i++)
    {
      patArr[pat.charAt(i)]++; //해당위치 ++
    }
    for(int i=0;i<txt.length()-pat.length()+1;i++)
    {
      int[] txtArr = new int[256];
      for(int j=0;j<pat.length();j++){
        txtArr[txt.charAt(i+j)]++;
      }
      if(check(patArr,txtArr))
      {
        result.add(i);
      }
    }

    return result;
  }
  // int배열 같은지 비교 
  private static boolean check(int[] txtArr, int[] patArr)
  {
    for(int i=0;i<patArr.length;i++)
    {
      if(patArr[i] != txtArr[i])
      {
          return false;
      }      
    }
    return  true;
  }
 
  
 
}


