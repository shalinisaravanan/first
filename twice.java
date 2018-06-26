import java.io.*;
import java.util.*;
class repeat
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int flag=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(int i=0;i<a.length-1;i++)
  {
    for(int j=0;j<a.length;j++)
  {
      if(i!=j)
  {
    if(a[i]!=a[j])
    {
    flag=1;
    }
     else
    {
       flag=0;
       break;
    }
  }
  }
      if(flag==1)
      {
        System.out.print(a[i]+" "); 
      }
  }
  }
}
