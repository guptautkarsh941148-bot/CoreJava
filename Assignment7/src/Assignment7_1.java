 import java.util.*;
 class ExceptionLineTooLong extends Exception{
		public ExceptionLineTooLong() {
			super("The strings is too long");
		}	
	}
 public class Assignment7_1{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String");
		 String s=sc.nextLine();
	try {
		if(s.length()>10) {
			throw new ExceptionLineTooLong();
		}
		else {
			System.out.println("String s length :"+s.length());
		}
	}
	catch(ExceptionLineTooLong e){
		System.out.println(e.getMessage());
	}
	 }
 }