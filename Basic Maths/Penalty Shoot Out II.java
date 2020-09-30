Link-https://www.codechef.com/submit/PSHOT

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,T=0,chances=0,chA=0,chB=0,Sa=0,Sb=0,ret=0;
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(i=1;i<=T;i++)
		{
		    chances=sc.nextInt();
		    String sequence=sc.next();
		    
		    ret=solve(sequence,chances,chances);
		    
		    System.out.println(ret);
		}
	}
	
	public static int solve(String sequence,int chA,int chB)
	{
	    int i=0,j=0,flag=0,ret=0,Sa=0,Sb=0;
	    
	    for(i=0;i<sequence.length();i++)
	    {
	        char ch=sequence.charAt(i);
	        
	        if(i%2==0)
	        {
	            chA--;
	            
	            if(ch=='1')
	            {
	                Sa++;
	                
	            }
	        }
	        
	        else
	        {
	            chB--;
	            
	            if(ch=='1')
	            {
	                Sb++;
	                
	            }
	        }
	        
	        if(Sa>Sb && Sa>(chB+Sb))
	        {
	            flag=1;
	            ret=i+1;
	            break;
	        }
	        
	        else if(Sb>Sa && Sb>(chA+Sa))
	        {
	            flag=1;
	            ret=i+1;
	            break;
	        }
	    }
	    
	    if(flag==1)
	    {
	        return(ret);
	    }
	    
	    else
	    {
	        return(sequence.length());
	    }
	}
}
