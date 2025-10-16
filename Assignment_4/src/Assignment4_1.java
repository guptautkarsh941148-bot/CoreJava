import java.util.*;
public class Assignment4_1 
{ 
	    abstract static class Fruit {
	        private String color;
	        private double weight;
	        private String name;
	        private boolean isFresh;

	        public Fruit(String name, double weight, String color, boolean isFresh) {
	            this.name = name;
	            this.weight = weight;
	            this.color = color;
	            this.isFresh = isFresh;
	        }

	        public String getName() { return name; }
	        public double getWeight() { return weight; }
	        public String getColor() { return color; }
	        public boolean isFresh() { return isFresh; }
	        public void setFresh(boolean isFresh) { this.isFresh = isFresh; }

	        public abstract String taste();

	        @Override
	        public String toString() {
	            return "Name: " + name + ", Color: " + color + ", Weight: " + weight + ", Fresh: " + isFresh;
	        }
	    }
 
	    static class Apple extends Fruit {
	        public Apple(String name, double weight, String color, boolean isFresh) {
	            super(name, weight, color, isFresh);
	        }
	        @Override
	        public String taste() { return "sweet and sour"; }
	    }
 
	    static class Mango extends Fruit {
	        public Mango(String name, double weight, String color, boolean isFresh) {
	            super(name, weight, color, isFresh);
	        }
	        @Override
	        public String taste() { return "sweet"; }
	    }
 
	    static class Orange extends Fruit {
	        public Orange(String name, double weight, String color, boolean isFresh) {
	            super(name, weight, color, isFresh);
	        }
	        @Override
	        public String taste() { return "sour"; }
	    }
 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter basket size: ");
	        int size = sc.nextInt();
	        Fruit[] basket = new Fruit[size];
	        int counter = 0;

	        int choice;
	        do {
	            System.out.println("\n--- MENU ---");
	            System.out.println("0. Exit");
	            System.out.println("1. Add Mango");
	            System.out.println("2. Add Orange");
	            System.out.println("3. Add Apple");
	            System.out.println("4. Display names of all fruits");
	            System.out.println("5. Display details of fresh fruits");
	            System.out.println("6. Display details of stale fruits");
	            System.out.println("7. Mark a fruit as stale (by index)");
	            System.out.println("8. Mark all sour fruits as stale");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    if (counter < basket.length) {
	                        System.out.print("Enter name, weight, color: ");
	                        String nm = sc.next();
	                        double wt = sc.nextDouble();
	                        String clr = sc.next();
	                        basket[counter++] = new Mango(nm, wt, clr, true);
	                    } else System.out.println("Basket full!");
	                    break;

	                case 2:
	                    if (counter < basket.length) {
	                        System.out.print("Enter name, weight, color: ");
	                        String nm = sc.next();
	                        double wt = sc.nextDouble();
	                        String clr = sc.next();
	                        basket[counter++] = new Orange(nm, wt, clr, true);
	                    } else System.out.println("Basket full!");
	                    break;

	                case 3:
	                    if (counter < basket.length) {
	                        System.out.print("Enter name, weight, color: ");
	                        String nm = sc.next();
	                        double wt = sc.nextDouble();
	                        String clr = sc.next();
	                        basket[counter++] = new Apple(nm, wt, clr, true);
	                    } else System.out.println("Basket full!");
	                    break;

	                case 4:
	                    System.out.println("Fruits in basket:");
	                    for (Fruit f : basket) {
	                        if (f != null)
	                            System.out.println(f.getName());
	                    }
	                    break;

	                case 5:
	                    System.out.println("Fresh fruits:");
	                    for (Fruit f : basket) {
	                        if (f != null && f.isFresh())
	                            System.out.println(f + " | Taste: " + f.taste());
	                    }
	                    break;

	                case 6:
	                    System.out.println("Stale fruits:");
	                    for (Fruit f : basket) {
	                        if (f != null && !f.isFresh())
	                            System.out.println(f + " | Taste: " + f.taste());
	                    }
	                    break;

	                case 7:
	                    System.out.print("Enter index to mark stale: ");
	                    int idx = sc.nextInt();
	                    if (idx >= 0 && idx < counter && basket[idx] != null) {
	                        basket[idx].setFresh(false);
	                        System.out.println("Fruit marked as stale.");
	                    } else System.out.println("Invalid index!");
	                    break;

	                case 8:
	                    for (Fruit f : basket) {
	                        if (f != null && f.taste().equals("sour"))
	                            f.setFresh(false);
	                    }
	                    System.out.println("All sour fruits marked as stale.");
	                    break;

	                case 0:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 0);

	        sc.close();
	    }
	}
