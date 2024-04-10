package Interface;

public class Test {
public static void main(String[] args) {
	System.out.println("test may tinh: ");
	MayTinhCasioFX500 fx500= new MayTinhCasioFX500();
	MayTinhVinacal500  vina500=new MayTinhVinacal500();
	System.out.println("5+3=" + fx500.cong(5,3));
	System.out.println("19/2= "+vina500.chia(19, 2));
	
	System.out.println("test sap xep: ");
	double a[]= new double [] { 1,4,2,5,3};
	double a2[]=new double [] {6,7,2,9,0};
	int i;
		SapXepChen sxchen=new SapXepChen();
		SapXepChon sxchon=new SapXepChon();
		System.out.print ("Sap xep tang theo sap xep chen:  ");
		sxchen.sapxepTang(a);
		for ( i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.print ("Sap xep giam theo sap xep chen:  ");
		sxchen.sapxepGiam(a);
		for ( i=0; i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		
		System.out.print ("Sap xep tang theo sap xep chon:  ");
		sxchon.sapxepTang(a2);
		for ( i=0; i<a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();
		
		System.out.print ("Sap xep giam theo sap xep chon:  ");
	   sxchon.sapxepGiam(a2);
	   for ( i=0; i<a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		}

}
