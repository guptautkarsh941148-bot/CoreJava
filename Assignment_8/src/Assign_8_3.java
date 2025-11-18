import java.util.ArrayList;

public class Assign_8_3 {

	public static void main(String[] args) {
		ArrayList<String>Colors=new ArrayList<>();
	    Colors.add("Red");
	    Colors.add("Blue");
	    Colors.add("Green");
	    Colors.add("Yellow");
	    Colors.add("White");
	    System.out.println("Original list of colors: " + Colors);
	    String Newelement="purple";
	    String replace=Colors.set(1,Newelement);	    
	    System.out.println("Updated list of colors: " + Colors);
	}

}
