package demo1; 
import java.util.Scanner; 
public class Assignment1_2{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double d1;
    double d2;
    if(!sc.hasNextDouble()) {
    	System.out.println("Enter valid double number");
    }
    else {
    	d1=sc.nextDouble();
    	d2=sc.nextDouble();
    	double avg=(d1+d2)+2;
    	System.out.println("Average of two number"+avg);
    }
    	
    }
}
