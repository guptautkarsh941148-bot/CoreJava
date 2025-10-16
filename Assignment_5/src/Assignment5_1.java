
class Assignment5_1 {
    public static void rev(char[] s){ 
    int a= 0;
    int b= s.length-1;
    while(a<b) {
    char temp=s[a];
    s[a]=s[b];
    s[b]= temp;
    a++;
    b--;
    }
    System.out.print("Reverse String :");
    for(int i=0;i<s.length;i++) {
    System.out.print(s[i]);
    }
    }
    public static void main(String[] args) {
     String str="Aditi";
     char[]a=str.toCharArray();
     rev(a);
    }
}