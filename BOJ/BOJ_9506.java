import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
	static List<Integer> arr  = new ArrayList<>();
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st= new StringTokenizer(br.readLine());
	
		Scanner sc=new Scanner(System.in);
		while(true) {
			int n=sc.nextInt();
			if(n==-1) {
				break;
			}
			else {
				if(yaksu(n)==n) {
					System.out.print(n+" = ");
					for(int i=0;i<arr.size();i++) {
						if(i==arr.size()-1) {
							System.out.print(arr.get(i));
						}
						else {						
						System.out.print(arr.get(i)+" + ");
						}
					}
					arr.clear();
					System.out.println();
				}
				else {
					System.out.print(n+" is NOT perfect.");
					System.out.println();
					arr.clear();
				}
			}
		}
		
		}
	  public static int yaksu(int n) {
		  int sum=0;
		 
		  for(int i=1;i<=n/2;i++) {
			  if(n%i==0) {
				  arr.add(i);
				  sum+=i;
			  }
		  }
		  return sum;
	  }
	}
