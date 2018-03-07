import java.util.Scanner;
public class gradebooktest {
	
		
	    public static void main (String args[])
	    {
	 
	 gradebook invoice = new gradebook (" "," ",0,0.0);
	 
	 Scanner input = new Scanner (System.in);
	         
	        String item,description;
	       
	        int quantity;
	        double price;
	         
	        System.out.print ("Enter the number of your own choice: ");
	        item = input.next();
	        invoice.setPartNumber(item);
	         
	        System.out.print ("Enter Description or detail of Item Purchased: ");
	        description = input.next();
	        invoice.setPartDescription(description);
	         
	        System.out.print ("Enter The Quantity of Item Purchased: ");
	        quantity = input.nextInt();
	 if (quantity > 0)
	        invoice.setQuantityOfItemPurchased(quantity);
	         
	        System.out.print ("Enter The Price Per Item: ");
	        price = input.nextDouble();
	 if (price > 0)
	        invoice.setPricePerItem (price);
	         input.close();
	        System.out.println ("The Total Amount for all items purchased = "+
	                invoice.getInvoiceAmount());
	 
	    }
	    
	}

