import java.util.*;

class Main {
  //Find Anagrams Mapping
  public static void main(String[] args) 
  {
    int [] A = {11,27,45,31,50};
    int [] B = {50,11,31,45,27};

    int [] result = anagramMapping(A,B);
    System.out.println(Arrays.toString(result));
  }
  public static int[] anagramMapping(int[]A,int[]B)
  {
    //1. ds
    int [] result = new int[A.length];
    Map<Integer,Integer> map = new HashMap<>();

    //2
    for(int i=0;i<A.length;i++)
    {
      map.put(B[i], i); //1 4 3 2 0
    }
    for(int i=0;i<A.length;i++)
    {
      result[i] = map.get(A[i]);
    }
    return result;


  }
 
  
 
}


