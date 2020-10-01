import java.util.*;
public class factorial
{
 public static int fact(int i)
 {
   if(i==1)
     return 1;
   else
     return i*fact(i-1);
 }

 public static void main(String args[])
 {
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   System.out.println(fact(n));
 }
}
