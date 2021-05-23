import java.util.*;

public class LicenseKeyFormatting {
	public static void main(String[] args) {
		String str ="8F3Z-2e-9-w";
		String str2 = "8-5g-3-J";
		int k=4;
		System.out.println(solve(str2,k));
	}
	public static String solve(String str,int k) {
		String newStr = str.replace("-", "");		
		newStr = newStr.toUpperCase();
		
		int length = newStr.length();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<length;i++) {
			sb.append(newStr.charAt(i));
		}
		//4,8,12
		for(int i=k;i<length;i=i+k) {
			sb.insert(length-i, '-');
		}
		return sb.toString();
	}
}
