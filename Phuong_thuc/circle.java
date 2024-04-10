package Phuong_thuc;

public class circle {
	private double radius;
	 private double area;
	 private double chuvi;
 public circle (double radius) {
	 this.radius=radius;
	}
   public double getRadius() {
	return radius;
}
  public void setRadius(double radius) {
	this.radius = radius;
}
  public double getArea() {
	return area=Math.PI*radius*radius;
}
   public void setArea(double area) {
	this.area = area;
}
   public double getChuvi() {
	return chuvi=2*Math.PI*radius;
}
   public void setChuvi(double chuvi) {
	this.chuvi = chuvi;
}
    public circle(){
	radius=1.0;
}
 
@Override
public String toString() {
	return "circle [radius=" + radius +  "]";
}
public static void main(String[] args) {
	circle c1=new circle(1.1);
	System.out.println(c1);
	circle c2=new circle();
	System.out.println(c2);
	c1.setRadius(2.2);
	System.out.println(c1);
	System.out.println("radius is: " + c1.getRadius());
	System.out.println("Area is:" +c1.getArea());
	System.out.println("Circumference is: " + c1.getChuvi());
	
}
 

}
