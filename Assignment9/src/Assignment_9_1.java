 import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
  class Student{
	private int rollno;
	private String name;
	private Double marks;
	public Student(int rollno, String name, Double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
}
public class raj1111 {
	static ArrayList<Student>list=new ArrayList<>();
    public static int menulist() {
    System.out.println("Menulist-- ");	
    System.out.println("1.add the student ");	
    System.out.println("2. Display all the students ");	
    System.out.println("3. search the student on rollno and if found display his details. ");	
    System.out.println("4. sort the students on rollno");	
    System.out.println("5. sort the students on name");	
    System.out.println("6. sort the students on marks");
    System.out.println("Enter your choice");
    Scanner sc=new Scanner(System.in);
    return sc.nextInt();
    }
	public static void main(String[] args) {
    int choice;
    while((choice=menulist())!=0) {
    switch(choice) {
    case 1:
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the rollno");
    	int rollno=sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter the Nmae");
    	String name=sc.nextLine();
    	System.out.println("Enter the Marks");
    	Double marks=sc.nextDouble();
    	Student s=new Student(rollno,name,marks);
    	list.add(s);
    	System.out.println("Succesfully added student details"); 	
    break;
    case 2:
    	System.out.println("2. Display all the students using iterator.");
    	for(Student sh:list) {
    	System.out.println(sh);
    	} 
    	System.out.println("Display All students");
    	break;
    case 3:
    	System.out.println(" search the student on rollno");
    	System.out.println("Enter the rollno");
    	Scanner sca=new Scanner(System.in);
    	int roll=sca.nextInt();
    	Boolean isfound=false;
    	for(Student f:list) {
    	if(f.getRollno()==roll){
    	System.out.println(f);
    	isfound=true;
    	}
    	}
    	if(!isfound) {
    		System.out.println("rollno not found");
    	}
    	break;
    case 4:
    	System.out.println("4. sort the students on rollno ");
    	Collections.sort(list,(a,b)-> a.getRollno()-b.getRollno());
    		System.out.println(list);
    	break;
    case 5:
    Collections.sort(list,(a,b)-> a.getName().compareTo(b.getName()));
    for (Student s1 : list) {
        System.out.println(s1);
    }
    System.out.println("Students sorted by marks successfully.");

    break;
    case 6:
    	System.out.println("Sort the students on marks ");
    	Collections.sort(list,(a,b)-> Double.compare(a.getMarks(),b.getMarks()));
    	break;
    case 0:
        System.out.println("Program exited successfully.");
break;
    }
    }

	}

}
