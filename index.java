import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args)
	{
		// your code goes here
		
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int flag=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]==i)
    	{
    		System.out.print(a[i]+" ");
    		flag=1;
    	}
    	
    }
    if(flag==0)
    {
    	System.out.print("-1");
    }
   }
}
