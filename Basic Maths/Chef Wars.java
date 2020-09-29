Link-https://www.codechef.com/problems/CHEFWARS

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=0,j=0,T=0,health=0,power=0;
		
		Scanner sc=new Scanner(System.in);
		
		T=sc.nextInt();
		
		for(i=1;i<=T;i++)
		{
		    health=sc.nextInt();
		    power=sc.nextInt();
		    
		    while(power>0 && health>0)
		    {
		        health=health-power;
		        power=power/2;
		    }
		    
		    if(health<=0)
		    {
		        System.out.println(1);
		    }
		    else
		    {
		        System.out.println(0);
		    }
		}
	}
}
