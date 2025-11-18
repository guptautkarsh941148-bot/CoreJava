import java.util.*;
public class Assign_8_2 {

	public static void main(String[] args) {
    ArrayList<String>Colors=new ArrayList<>();
    Colors.add("Red");
    Colors.add("Blue");
    Colors.add("Green");
    Colors.add("Yellow");
    Colors.add("White");
    System.out.println("Original list of colors: " + Colors);
    Collections.sort(Colors);
    System.out.println("Sorted list of colors: " + Colors);
	}

}
