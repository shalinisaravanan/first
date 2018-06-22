import java.io.*;
import java.util.*;
class character
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
{
System.out.print("vowel");
}
else
{
System.out.print("consonant");
}
}
}
