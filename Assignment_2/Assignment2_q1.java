
public class Assignment2_q1 {

	    static class Invoice {
	        private String partNumber;
	        private String partDescription;
	        private int quantity;
	        private double pricePerItem; 
	        public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
	            this.partNumber = partNumber;
	            this.partDescription = partDescription;
	            setQuantity(quantity);
	            setPricePerItem(pricePerItem);
	        } 
	        public void setPartNumber(String partNumber) {
	            this.partNumber = partNumber;
	        }

	        public String getPartNumber() {
	            return partNumber;
	        } 
	        public void setPartDescription(String partDescription) {
	            this.partDescription = partDescription;
	        }

	        public String getPartDescription() {
	            return partDescription;
	        } 
	        public void setQuantity(int quantity) {
	            this.quantity = quantity > 0 ? quantity : 0;
	        }

	        public int getQuantity() {
	            return quantity;
	        }
 
	        public void setPricePerItem(double pricePerItem) {
	            this.pricePerItem = pricePerItem > 0.0 ? pricePerItem : 0.0;
	        }

	        public double getPricePerItem() {
	            return pricePerItem;
	        }
 
	        public double getInvoiceAmount() {
	            return quantity * pricePerItem;
	        }
	    } 
	    public static void main(String[] args) {
	        Invoice item1 = new Invoice("A101", "Hammer", 5, 200.50);
	        Invoice item2 = new Invoice("B205", "Screwdriver", -3, 150.0); 

	        System.out.println("Invoice Details:");
	        System.out.println("Part Number: " + item1.getPartNumber());
	        System.out.println("Description: " + item1.getPartDescription());
	        System.out.println("Quantity: " + item1.getQuantity());
	        System.out.println("Price per Item: ₹" + item1.getPricePerItem());
	        System.out.println("Total Invoice Amount: ₹" + item1.getInvoiceAmount());

	        System.out.println("\nPart Number: " + item2.getPartNumber());
	        System.out.println("Description: " + item2.getPartDescription());
	        System.out.println("Quantity: " + item2.getQuantity());
	        System.out.println("Price per Item: ₹" + item2.getPricePerItem());
	        System.out.println("Total Invoice Amount: ₹" + item2.getInvoiceAmount());
	    }
	}
