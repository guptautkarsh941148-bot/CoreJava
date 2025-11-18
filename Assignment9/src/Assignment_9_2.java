import java.util.*; 
class Project{
	private int id;
	private String title;
	private int teamsize;
	private double projectCost;
	private String technology;
	public Project(int id, String title, int teamsize, double projectCost, String technology) {
		super();
		this.id = id;
		this.title = title;
		this.teamsize = teamsize;
		this.projectCost = projectCost;
		this.technology = technology;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public double getProjectCost() {
		return projectCost;
	}
	public void setProjectCost(double projectCost) {
		this.projectCost = projectCost;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamsize=" + teamsize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return id == other.id;
	} 
}
public class Assignment_9_2 {
	static HashSet<Project>projectSet =new HashSet<>();
    static ArrayList<Project> list = new ArrayList<>();

    public static int menulist() {
    System.out.println("--Menulist");
    System.out.println("1. Add Dummy Data of Projects");
    System.out.println("2. Input a Project from user ");
    System.out.println("3. Display all Projects");
    System.out.println("4. Delete a Project by Id");
    System.out.println("5. Copy All Projects");
    System.out.println("6. Display all Projects");
    System.out.println("7. Sort all Projects in List by cost ");
    System.out.println("8. Find project with Max team size using Collections.max()");
    System.out.println("0.Exit");
    System.out.println("Enter your choice");
    Scanner scq=new Scanner(System.in);
    return scq.nextInt();
    }
    public static void main(String[] args) {
    int choice;
    while((choice=menulist())!=0){
    	switch(choice) {
    	case 1:
    		System.out.println("Enter the details");
    		projectSet.add(new Project(1, "Train Reservation System",2, 5000000, "Java"));
    		projectSet.add(new Project(2, "Airline Reservation System",3, 6000000, ".NET"));
    		projectSet.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
    		projectSet.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
    		projectSet.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
    		projectSet.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
    		for(Project s:projectSet)
    		System.out.println(s);
    		break;
    	case 2:
    		Scanner sca=new Scanner(System.in);
    		System.out.println("id");
    		int id=sca.nextInt();
    		sca.nextLine();
    		System.out.println("Title");
    		String title=sca.nextLine();
    		System.out.println("teamSize");
    		int teamSize=sca.nextInt();
    		sca.nextLine();
    		System.out.println("projectCost");
    		double projectCost=sca.nextDouble();
    		sca.nextLine();
    		System.out.println("technology");
    		String technology=sca.nextLine();;
    		Project p=new Project(id,title,teamSize,projectCost,technology); 
    		if (projectSet.add(p))
				System.out.println("Project added successfully!");
			else
				System.out.println("Duplicate project ID! Not added.");
    		break;
    	case 3:
    		System.out.println("Display all Projects");
    		for(Project p1:projectSet) {
    		System.out.println(p1);	
    		}
    			break;
    	case 4:
    		System.out.print("Enter project id to delete: ");
    		Scanner scr=new Scanner(System.in);
    		int iid = scr.nextInt();
    		boolean removed = false;

    		for (Project p1 : projectSet) {
    		    if (p1.getId() == iid) {
    		        projectSet.remove(p1);
    		        removed = true;
    		        break;
    		    }
    		}

    		if (removed)
    		    System.out.println("Project deleted successfully!");
    		else
    		    System.out.println("Project not found!");

    		break;
    	case 5:
    		list.addAll(projectSet);
    		break;
    	case 6:
    		for(Project q:list) {
    			System.out.println(q);
    		}
    			break;
    	case 7:
    		Collections.sort(list,(a,b)-> Double.compare(a.getProjectCost(), b.getProjectCost()));
    		System.out.println(" Sort all Projects in List by cost");
    		for(Project w:list) {
    			System.out.println(w);
    		}
    		break;
    	case 8:
    		System.out.println(" Find project with Max team size using Collections.max() ");
    		Project maxTeam = null;
    		int max = 0;
    		for (Project pr : projectSet) {
    		    if (pr.getTeamsize() > max) {
    		        max = pr.getTeamsize();
    		        maxTeam = pr;
    		    }    		
    }
    		break;
	}
    }
}

} 