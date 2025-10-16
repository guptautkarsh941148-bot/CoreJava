
public class Assignment5_2 {
    public static Boolean isPalindrome(String s) {
    char[] c=s.toCharArray();
    int a=0;
    int b=c.length-1;
    while(a<b) {
    	char temp=c[a];
    	c[a]=c[b];
    	c[b]=temp;
    	a++;
    	b--;
    } 
    String g=new String(c);
    return g.equals(s);
    }
	public static void main(String[] args) {
	String s="aaa";
	if(isPalindrome(s)) {
	System.out.println("Valid Palindrome");	
	}
	else {
		System.out.println("InValid Palindrome");	
	}
	}

}
