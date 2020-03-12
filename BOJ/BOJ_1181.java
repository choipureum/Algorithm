import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt(); //testcase 
		String[] arr = new String[n];
		//입력받기
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}//입력완료
		
		Arrays.sort(arr,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()<o2.length()) {
					return -1;
				}
				else if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}
				return 1;
			}
		});
		List <String>list  =new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(i!=n-1&& arr[i].equals(arr[i+1])) {
				continue;
			}
			else {
				list.add(arr[i]);
			}
		}
		for(String i : list) {
			System.out.println(i);
		}
		
		} // end of main	
	} // end of class
