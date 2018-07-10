import java.io.*;
import java.util.*;
class sum
{
public static void main(String args[])
{
int number,i,sum=0;
Scanner sc=new Scanner(System.in);
number=sc.nextInt();
for(int i=0;i<=number;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}
