import java.io.*;
import java.util.*;
 class Number 
 {
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
		int Number, Count=0;
		Number = sc.nextInt();
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 3 ; 
		}
		System.out.print( Count);
	}
}



