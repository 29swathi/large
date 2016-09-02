import java.util.*;
import java.io.;
class largeno
{
  public static void main(String ar[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.next();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   a[i]=sc.nextInt();
  }
  Arrays.sort(a);
  StringBuffer sb=new StringBuffer();
  for(int i=n-1;i>=0;i--)
  {
   sb.append(a[i]);
  }
  int output=Integer.parseInt(String.valueOf(sb));
  System.out.println(output);
 }
}
