Link-https://www.codechef.com/submit/ZUBREACH

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,x=0,y=0,T=0,Rx=0,Ry=0,M=0,N=0,len=0;
		StringBuffer sb=new StringBuffer();
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(i=1;i<=T;i++)
		{
		    x=0;
		    y=0;
		   
		    M=sc.nextInt();
		    N=sc.nextInt();
		   
		    Rx=sc.nextInt();
		    Ry=sc.nextInt();
		    
		    //sc.nextInt();
		    
		    len=sc.nextInt();
		    
		    //sc.nextInt();
		    
		    String sequence=sc.next();
		    
		    solve(M,N,Rx,Ry,len,sequence);
		}
		

	}
	
	public static void solve(int M,int N,int Rx,int Ry,int len,String sequence)
	{
	    int i=0,j=0,x=0,y=0;
	    
	        for(j=0;j<len;j++)
		    {
		        char ch=sequence.charAt(j);
		        if(ch=='R')
		        {
		            x++;
		        }
		        else if(ch=='U')
		        {
		            y++;
		        }
		        else if(ch=='L')
		        {
		            x--;
		        }
		        else if(ch=='D')
		        {
		            y--;
		        }
		        
		    }
		    
		    if(x==Rx && y==Ry)
		    {
		        System.out.println("Case "+i+":"+" "+"REACHED");
		    }
		    else
		    {
		        if(x<0)
		        {
		            System.out.println("Case "+i+":"+" "+"DANGER");
		        }
		        
		        else if(y<0)
		        {
		            System.out.println("Case "+i+":"+" "+"DANGER");
		        }
		        
		        else if(x>M)
		        {
		            System.out.println("Case "+i+":"+" "+"DANGER");
		        }
		        
		        else if(y>N)
		        {
		            System.out.println("Case "+i+":"+" "+"DANGER");
		        }
		        
		        else
		        {
		            System.out.println("Case "+i+":"+" "+"SOMEWHERE");
		        }
		    }
	    }
}
