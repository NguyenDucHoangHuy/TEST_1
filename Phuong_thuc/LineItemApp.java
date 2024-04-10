package Phuong_thuc;
import java.util.Scanner;

 
public class LineItemApp {
 public static void main(String[] args) {
	System.out.println("Welcom to the Line Item Calculator");
	System.out.println();
	Scanner sc=new Scanner (System.in);
	String choice ="y";
	while(choice.equalsIgnoreCase("y"))
	{
		String productCode =Validator.getString(sc,
				"Enter product code: ");
		int quantity=Validator.getInt(sc,
				"Enter quantity:      ",0,1000);
		
		Product product=ProductDB.getProduct(productCode);
		
		LineItem lineItem=new LineItem();
		lineItem.setProduct(product);
		lineItem.setQuantity(quantity);
		
		System.out.println();
		System.out.println("LINE ITEM");
		System.out.println("Code:        "+ product.getCode());
		System.out.println("Descripton:  "+ product.getDescription());
		System.out.println("Price:       "+ product.getFormattedPrice());
		System.out.println("Quantity:    "+ lineItem.getquantity());
		System.out.println("Total:       "+
		     lineItem.getFormattedTotal()+" \n") ;
	
		choice =Validator.getString(sc,"Continue? (y/n):  ");
		System.out.println();
		
	}
}
}
