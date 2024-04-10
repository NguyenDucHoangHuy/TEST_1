package Phuong_thuc;

public class Rectangle {
    private  double lenght;
    private double width;
	public Rectangle(double lenght, double width) {
		this.lenght = lenght;
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public Rectangle() {
		this.lenght=1.0;
		this.width=1.0;
	}
	public double getarea() {
		return this.lenght*this.width;
	}
	public double getPerimeter() {
		return (this.lenght+this.width)*2;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Rectangle[lenght="+this.lenght+",width="+this.width+"].";
	}
	public static void main(String[] args) {
		Rectangle r1= new Rectangle(1.2,3.4);
		Rectangle r2=new Rectangle();
		System.out.println(r1);
		System.out.println(r2);
		r1.setLenght(4.3);
		r1.setWidth(5.6);
		System.out.println("Length is: "+r1.getLenght());
		System.out.println("Width is: "+r1.getWidth());
		System.out.println("Area is: "+r1.getarea());
		System.out.println("Perimeter is: "+r1.getPerimeter());
		
		
		
	}
   
		
	 
}
