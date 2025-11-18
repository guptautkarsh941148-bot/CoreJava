package tester;
import java.util.Scanner;

import com.app.geometry.*;
public class TestPoint {
	public static void acceptPoint(Point2D p) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x cordinate:");
		int x = sc.nextInt();
		p.setX(x);
		System.out.print("Enter y cordinate:");
		int y = sc.nextInt();
		p.setY(y);
	}
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		acceptPoint(p1);
		Point2D p2 = new Point2D();
		acceptPoint(p2);
		
		System.out.println("Point P1 "+p1.getDetails());
		System.out.println("Point P2 "+p2.getDetails());
		
		if(p1.isEqual(p2)) {
			System.out.println("Points are same");
		}
		else {
			System.out.println("Points are different");
			System.out.println("Distance between points is:"+p1.calculateDistance(p2));
		}

	}

}
