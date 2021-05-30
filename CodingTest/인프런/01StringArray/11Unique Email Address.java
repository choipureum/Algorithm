import java.util.*;

class Main {
  //Unique Email Address
  public static void main(String[] args) 
  {
    String[] emails ={"test.email+james@coding.com",
                      "test.e.mail+todo.jane@coding.com",
                      "testemail+tom@cod.ing.com"};
    System.out.println(numUniqueEmails(emails));
  }
  public static int numUniqueEmails(String [] emails)
  {
    //1 ds
    Set<String> set = new HashSet<String>();
    
    //2 
    for(String email: emails)
    {
      String localName = makeLocalName(email); //testemail
      String domainName = makeDomainName(email); //@code.com
      set.add(localName+"@"+domainName);
    }
    return set.size();
  }
  private static String makeLocalName(String email)
  {
    StringBuilder sb = new StringBuilder();
    
    for(int i=0;i<email.length();i++)
    {
      //1. error check
      if(email.charAt(i) == '.')
      {
        continue;
      }
      else if(email.charAt(i)=='+'||email.charAt(i)=='@')
      {
        break;
      }
      //2. 
      String str = String.valueOf(email.charAt(i));
      sb.append(str);
    }
    return sb.toString();
  }
  private static String makeDomainName(String email)
  { 
    return email.substring(email.indexOf('@')+1);
  }

 
	
}


