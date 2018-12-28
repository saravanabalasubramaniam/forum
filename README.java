import java.io.*;
import java.util.*;
class Forum
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	System.out.println("enter the value of a:");
        long a=input.nextInt();
	System.out.println("enter the value of b:");
	long b=input.nextInt();
        System.out.println("enter the value of c:");
	long c=input.nextInt();
        long d=(a*b)/c;
        System.out.println("result:"+d);
	}
}        
