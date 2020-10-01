link-https://www.codechef.com/submit/LINCHESS

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,T=0,K=0,N=0,min=0,ret=-1,pos=0,steps=0;
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
	
		for(i=1;i<=T;i++)
		{
		    N=sc.nextInt();
		    K=sc.nextInt();
		    min=Integer.MAX_VALUE;
		    ret=-1;
		    
		    for(j=1;j<=N;j++)
		    {
		        
		        //steps=0;
		        
		        pos=sc.nextInt();

    		    if((K%pos==0) && (pos<=K))
    		    {
    		        steps=K/pos;
    		       // System.out.println(steps);
    		        if(steps<min)
    		        {
    		            ret=pos;
    		            min=steps;
    		        }
    		    }
    		    
		    }
		    
		    System.out.println(ret);
		}
		
		
	}
}
