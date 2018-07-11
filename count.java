import java.io.*;
import java.util.*;
class count
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
		int Number, Count=0;	
		Number = sc.nextInt();
		while(Number > 0) 
    {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.print( Count);
	}
}
