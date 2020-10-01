Link-https://www.codechef.com/submit/XYSTR

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,T=0,pairs=0;
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(i=1;i<=T;i++)
		{
		    String s=sc.next();
		    
		    pairs=util(s);
		    
		    System.out.println(pairs);
		}
		
	}
	
	public static int util(String s)
	{
	    int i=0,j=0,pairs=0;
	    char arr[];
	    arr=s.toCharArray();
	    
	    for(i=0;i<arr.length-1;i++)
	    {
	        char ch1=arr[i];
	        char ch2=arr[i+1];
	        
	        if((ch1=='x' && ch2=='y')||(ch1=='y' && ch2=='x'))
	        {
	            pairs++;
	            arr[i]='\0';
	            arr[i+1]='\0';
	        }
	    }
	    
	    return(pairs);
	}
}
