package Phuong_thuc;
import java.util.Scanner;
public class vd_overloading {
	    public int add(int a, int b) {
	        return a + b;
	    }

	    public static double add(double a, double b) {
	        return a + b;
	    
	}
	    public static double add (double a[]) {
	    	double tong=0;
	    	for (int i=0; i< a.length;i++) {
	    		tong+=a[i];
	    	}
	    	return tong;
	    }
	    public static void main(String[] args) {
			vd_overloading vd=new vd_overloading();
			System.out.println("Tong int= " +vd.add(3, 9));
			System.out.println("Tong double= " +vd.add(5.5, 4.5));
			double []a = new double [] {1,2,4,5,8};
			System.out.println("tong mang= "+vd.add(a));
			Scanner sc=new Scanner(System.in);
			System.out.println("m="); int m=sc.nextInt();
			System.out.println("n="); int n=sc.nextInt();
			System.out.println("tong 2 so tu ban phim"+sum(m,n));
	    }
	    //dung phuong thuc static tinh tong 2 so nhap tu ban phim
	    static int sum(int a,int b) {
	    	return a+b;
	    }
	    
		
}
