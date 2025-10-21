
public class Assignment2_q2 {
 
	    static class Employee {
	        private String firstName;
	        private String lastName;
	        private double monthlySalary; 
	        public Employee(String firstName, String lastName, double monthlySalary) {
	            this.firstName = firstName;
	            this.lastName = lastName;
	            setMonthlySalary(monthlySalary);
	        }
 
	        public void setFirstName(String firstName) {
	            this.firstName = firstName;
	        }

	        public String getFirstName() {
	            return firstName;
	        }

	        public void setLastName(String lastName) {
	            this.lastName = lastName;
	        }

	        public String getLastName() {
	            return lastName;
	        }

	        public void setMonthlySalary(double monthlySalary) {
	            if (monthlySalary > 0) {
	                this.monthlySalary = monthlySalary;
	            } else {
	                this.monthlySalary = 0; // if invalid, set to 0
	            }
	        }

	        public double getMonthlySalary() {
	            return monthlySalary;
	        } 
	        public double getYearlySalary() {
	            return monthlySalary * 12;
	        }
 
	        public void giveRaise(double percent) {
	            monthlySalary += monthlySalary * percent / 100;
	        }
	    }
 
	    public static void main(String[] args) {
	        Employee emp1 = new Employee("Utkarsh", "Gupta", 40000);
	        Employee emp2 = new Employee("Aman", "Singh", 30000);

	        System.out.println("Before Raise:");
	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " - Yearly Salary: ₹" + emp1.getYearlySalary());
	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " - Yearly Salary: ₹" + emp2.getYearlySalary());
 
	        emp1.giveRaise(10);
	        emp2.giveRaise(10);

	        System.out.println("\nAfter 10% Raise:");
	        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " - Yearly Salary: ₹" + emp1.getYearlySalary());
	        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " - Yearly Salary: ₹" + emp2.getYearlySalary());
	    }
	}
