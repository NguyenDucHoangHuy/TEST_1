package NguyenDucHoangHuy;

public class Student_HoangHuy {
  protected String name;
  protected int age;
  protected double score;
public Student_HoangHuy(String name, int age, double score) {
	super();
	this.name = name;
	this.age = age;
	this.score = score;
}
public String getName() {
	return name;
}
public void setName(String name) {
	 this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getScore() {
	return score;
}
public void setScore(double score) {
	this.score = score;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Name: " + this.name
				+".  Age: "+ this.age
				+".  Score: "+ this.score +". ";
	}
  
}
