import java.io.*;
import java.util.*;
public class alphabet
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  char a=s.next().charAt(0);
  byte b=new byte(a);
  if((b>=65)||(b<=90)||(b>=97)||(b<=122))
  {
   System.out.println("alphabets");
  }
  else
  {
  System.out.println("not alphabets");
  }
  }
  }
