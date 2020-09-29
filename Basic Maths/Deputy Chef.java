Link-https://www.codechef.com/problems/DEPCHEF

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int i=0,j=0,T=0,size=0,pLeft=0,pRight=0,def=0,max=0;
	    
	    Scanner sc=new Scanner(System.in);
	    
	    T=sc.nextInt();
	    
	    for(i=1;i<=T;i++)
	    {
	        max=0;
	        def=0;
	        pLeft=0;
	        pRight=0;
	        
	        size=sc.nextInt();
	        
	        int attack[];
	        attack=new int[size];
	        
	        int defense[];
	        defense=new int[size];
	        
	        for(j=0;j<size;j++)
	        {
	            attack[j]=sc.nextInt();
	        }
	        
	        for(j=0;j<size;j++)
	        {
	            defense[j]=sc.nextInt();
	        }
	        
	        for(j=0;j<size;j++)
	        {
	            if(j==0)
	            {
	                pLeft=attack[size-1];
	                pRight=attack[j+1];
	                def=defense[j];
	                
	                if(def>pLeft && def>pRight && def>(pLeft+pRight))
	                {
	                    max=Math.max(max,defense[j]);
	                }
	            }
	            
	            else if(j==size-1)
	            {
	                pLeft=attack[0];
	                pRight=attack[j-1];
	                def=defense[j];
	                
	                if(def>pLeft && def>pRight && def>(pLeft+pRight))
	                {
	                    max=Math.max(max,defense[j]);
	                }
	            }
	            
	            else
	            {
	                pLeft=attack[j-1];
	                pRight=attack[j+1];
	                def=defense[j];
	                
	                if(def>pLeft && def>pRight && def>(pLeft+pRight))
	                {
	                    max=Math.max(max,defense[j]);
	                }
	            }
	 
	        }
	        if(max>0)
	        {
	            System.out.println(max);
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	        max=0;
	        def=0;
	        pLeft=0;
	        pRight=0;
	       
	    }
	}
}
