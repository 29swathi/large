import java.io.*;
import java.util.*;
class repeted
{
 public static void main(String ar[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  for(int i=0;i<n-1;i++)
  {
   for(int j=i+1;j<n;j++)
    {
     if(a[i]==a[j])
     {
      System.out.println(a[i]);
      System.exit();
     }
    }
  }
 }
}
