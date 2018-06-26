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
    Arrays.sort(a);
    for(int i=0;i<a.length-1;i++)
    {
    for(int j=i+1;j<a.length;j++)
{
        if(a[i]==a[j])
        {
          System.out.print(a[i]);
          flag=1;
          break;
        }
      }
    }
      if(flag==0)
    {
    	System.out.print("Unique");
    }
  }
}
