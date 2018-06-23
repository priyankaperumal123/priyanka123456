import java.io.*;
import java.util.*;
class alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c='a';
if((c >='a' && c <='z') || (c >='A' && c <='Z'))
System.out.println("it is alphabet");
else
System.out.println("it is not an alphabet");
}
}
