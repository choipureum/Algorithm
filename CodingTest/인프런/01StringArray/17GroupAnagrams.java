import java.util.*;

class Main {
  //Group Anagram
  public static void main(String[] args) {
    String[] list = {"eat","tea","tan","ate","nat","bat"};
    System.out.println(groupAnagrams(list));
  }
  public static List<List<String>> groupAnagrams(String[]strs)
  {
    //1 ds , ec
    List<List<String>> result = new ArrayList<>();
    if(strs ==null || strs.length==0)
    {
      return result;
    }
    Map<String,List<String>>map = new HashMap<>();
    //2
    for(String str: strs)
    {
      char[] charArr = str.toCharArray();
      Arrays.sort(charArr); // [a,e,t]
      String key = String.valueOf(charArr); //"aet"
      if(map.containsKey(key))
      {
        map.get(key).add(str);
      }
      else
      {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(key,list);
      }
    }
    result.addAll(map.values());

    return result;
  }
}


