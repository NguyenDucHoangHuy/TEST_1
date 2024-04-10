package Phuong_thuc;
import java.text.NumberFormat;
 
public class Product {
	private String code;
	private String description;
	private double price;
	protected static int count=0;
	public Product() {
		code =" ";
		description = " ";
		price=0;
	}
	public void setCode(String code) {
		this.code=code;
		
	}
	public String getCode() {
		return code;
		
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFormattedPrice()
	{NumberFormat currency=NumberFormat.getCurrencyInstance();
	return currency.format(price);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Code:        "+code+"\n"+
				"Description: "+description+"\n"+
		        "Price:       "+this.getFormattedPrice()+"\n";
		}
	public static int getCount() {
		return count;
	}
		

}
