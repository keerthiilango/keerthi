import java.io.*;
import java.util.*;
public class even
{
 public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  if((n%2==0)&&(n!=0))
  {
   System.out.println("even number");
  }
  else if(n!=0)
  {
   System.out.println("odd number");
  }
  else
  {
   System.out.println("zero");
  }
  
  }
 } 
   
