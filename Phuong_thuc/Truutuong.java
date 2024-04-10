package Phuong_thuc;
//abstract ko có phần body, nó giống như làm nên tiêu đề, phần thực hiện các 
//lệnh sẽ làm ở lớp con của abstract
public abstract class Truutuong {
      public void pt1() {
    	  System.out.println("pt1");
      }
      public abstract void pt2();
 }
class D extends Truutuong{
	public void pt2() {
		System.out.println("pt2");
	}
	public static void main(String[] args) {
		D d=new D();
		System.out.println(" huy ");
	 d.pt1();
	 d.pt2();
	}
}
  
