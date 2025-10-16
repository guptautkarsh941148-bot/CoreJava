
public class Assignment5_3 { 
	    public static void main(String[] args) {
	        String s = "My name is Utkarsh";
	        int Count = countWords(s);
	        System.out.println("The original string is: "+ s );
	        System.out.println("The number of words in the string is: " +Count);
	    } 
	    public static int countWords(String str) { 
	    	if (str == null || str.trim().isEmpty()) {
	            return 0;
	        } 
	        String trimmedString = str.trim(); 
	        String[] words = trimmedString.split("\\s+"); 
	        return words.length;
	    }
	}
