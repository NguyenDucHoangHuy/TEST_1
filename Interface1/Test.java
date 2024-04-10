package Interface1;

public class Test {
public static void main(String[] args) {
	thucthi tt=new thucthi();
	System.out.println("5+3= " + tt.cong(5, 3));
	System.out.println("5-3="+tt.tru(5, 3));
	System.out.println("5x3= "+tt.nhan(5, 3));
	System.out.println("5/3="+tt.chia(5, 3));
   tt.an();
   tt.di();
   tt.ngu();
   thucthiabstract ttab= new thucthiabstract();
   System.out.println( ttab);
   ttab.lamviec();
   
   
   
}
}
