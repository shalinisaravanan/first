import java.io.*;
import java.util.*;
class large
{
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    Arrays.toString(a);
    StringBuffer sb=new StringBuffer(a);
    sb.reverse();
    System.out.print(Integer.parseInt(sb));
    }
    }
