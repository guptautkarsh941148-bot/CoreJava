package demo1;
import java.util.*;
public class Assignment1_3 {
	public static int form(){
		Scanner sc=new Scanner(System.in);
		System.out.println("0.Exit");
		System.out.println("1.Vanila");
		System.out.println("2.Mango");
		System.out.println("3.Cherry");
		return sc.nextInt();
		}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n;
    while((n=form())!=0) {
    	
    int price=0;
    int totalbill=0;
    {
    switch(n) {
    case 1:
    price=20;
    System.out.println("1.Vanila");
    break;
    case 2:
        price=30;
        System.out.println("2.mango");
        break;
    
    case 3:
        price=40;
        System.out.println("3.mazaa");
        break;
    }
 
	}
    }
    int qty=sc.nextInt();
    int  bill=qty*price; 
    totalbill+=bill;
   System.out.println(totalbill);
	}
}
