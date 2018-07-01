import java.io.*;
import java.util.*;
class largest
{
public static void main(String args[])
{
int x,y,z,largest;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
largest=(x>y)?(y>z?y:z):(z>x?z:x);
System.out.print("largest number:"+largest);
}
}
