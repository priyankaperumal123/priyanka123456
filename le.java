import java.io.*;
import java.util.*;
 class leap 
 {
public static void main(String[] args) 
{
      int x;
    	Scanner sc = new Scanner(System.in);
    	x = sc.nextInt();
      boolean isLeap = false;
      if(x % 4 == 0)
        {
            if(x % 100 == 0)
            {
                if (x % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(x + " is a Leap Year.");
        else
            System.out.println(x + " is not a Leap Year.");
    }
}
