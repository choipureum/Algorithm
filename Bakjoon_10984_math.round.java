package mainproject;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.swing.JOptionPane;
import java.util.*;
import java.util.*;
class Main {
  public static void main(String[] args) throws Exception {
	  Scanner sc=new Scanner(System.in);
	  int N=sc.nextInt();	  
	  int sum=0;
	  double answer=0;
	  outline:for(int i=0;i<N;i++) {
		  int subject_num=sc.nextInt();
		  int [] point=new int [subject_num];
		  double [] GPA= new double [subject_num];
		  		for(int j=0;j<subject_num;j++) {
		  			point[j]=sc.nextInt();
		  			GPA[j]=sc.nextDouble();
		  }
		  for(int k=0;k<subject_num;k++) {
			  sum+=point[k];
		  }
		  for(int u=0;u<subject_num;u++) {
			 answer+=(double)point[u]*GPA[u];
	  }
		  System.out.println(sum+ " " + Math.round(answer*10/sum)/10.0);
		  sum=0;answer=0;
  }
	  }
}
	

  

    

  
  




  
/*

 */