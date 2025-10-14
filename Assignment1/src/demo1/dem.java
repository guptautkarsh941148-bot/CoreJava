package demo1;
import java.util.*;
public class dem {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enternumber");
	int n=sc.nextInt();
	System.out.println("Enter Number :"+n);
	System.out.println("Given Number :"+n);
	String a=Integer.toBinaryString(n);
	String b=Integer.toOctalString(n);
	String c=Integer.toHexString(n);
	System.out.println("Binary equivalent  :"+a);
	System.out.println("Octal equivalent "+b);
	System.out.println("Hexadecimal equivalent "+c);
	
	}

}
