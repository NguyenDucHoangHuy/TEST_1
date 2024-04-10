package Phuong_thuc;
import java.util.Scanner;
public class ProductApp {
    public static void main(String[] args) {
		System.out.println("Welcom to the Product Selector");
		System.out.println();
		
		Scanner sc=new Scanner(System.in);
		String choice="y";
		while(choice.equalsIgnoreCase("y"))
		{System.out.print("Enter product code:  ");
		String productCode=sc.next();
		sc.nextLine();
		
		Product product =ProductDB.getProduct(productCode);
		
		System.out.println();
		System.out.println("SELECTED PRODUCT");
		System.out.println("Description:   "+ product.getDescription());
		System.out.println("Price:         "+ product.getFormattedPrice());
		System.out.println();
		if(product!=null)
			System.out.println(product);
		else
			System.out.println("No product matches this product code.\n");
		
		System.out.println("Product count:  "+Product.getCount()+"\n");
		
		System.out.println("Continue? (y/n):  ");
		choice=sc.nextLine();
		System.out.println();
		
		}
	}
}
