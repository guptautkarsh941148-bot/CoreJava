
public class Assignment_2_q_3 { 
 
	    static class Date {
	        private int month;
	        private int day;
	        private int year;
 
	        public Date(int month, int day, int year) {
	            this.month = month;
	            this.day = day;
	            this.year = year;
	        } 
	        public void setMonth(int month) {
	            this.month = month;
	        }

	        public int getMonth() {
	            return month;
	        }
 
	        public void setDay(int day) {
	            this.day = day;
	        }

	        public int getDay() {
	            return day;
	        }
 
	        public void setYear(int year) {
	            this.year = year;
	        }

	        public int getYear() {
	            return year;
	        }
 
	        public void displayDate() {
	            System.out.println(month + "/" + day + "/" + year);
	        }
	    } 
	    public static void main(String[] args) {
	        Date today = new Date(10, 21, 2025);
	        System.out.print("Today's Date: ");
	        today.displayDate(); 
	        today.setMonth(12);
	        today.setDay(25);
	        today.setYear(2025);

	        System.out.print("Updated Date: ");
	        today.displayDate();
	    }
	}
