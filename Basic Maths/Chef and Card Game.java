Link-https://www.codechef.com/problems/CRDGAME

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,T=0,N=0,chef=0,smith=0,pointC=0,pointS=0,val1=0,val2=0;
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(i=1;i<=T;i++)
		{
		    pointC=0;
		    pointS=0;
		    val1=0;
		    val2=0;
		    chef=0;
		    smith=0;
		    
		    N=sc.nextInt();
		    
		    for(j=1;j<=N;j++)
		    {
		        val1=sc.nextInt();
		        val2=sc.nextInt();
		        
		        chef=power(val1);
		        smith=power(val2);
		        
		        if(chef>smith)
		        {
		            pointC++;
		        }
		        else if(chef<smith)
		        {
		            pointS++;
		        }
		        else
		        {
		            pointC++;
		            pointS++;
		        }
		    }
		    
		    if(pointC>pointS)
		    {
		        System.out.println(0+" "+pointC);
		    }
		    else if(pointC<pointS)
		    {
		        System.out.println(1+" "+pointS);
		    }
		    else
		    {
		        System.out.println(2+" "+pointS);
		    }
		    
		    pointC=0;
		    pointS=0;
		    val1=0;
		    val2=0;
		    chef=0;
		    smith=0;
		}
	}
	
	public static int power(int val)
	{
	    int idigit=0,sum=0;
	    
	    while(val!=0)
	    {
	        idigit=val%10;
	        sum+=idigit;
	        val=val/10;
	    }
	    
	    return(sum);
	}
}
