package NguyenDucHoangHuy;

import java.util.Scanner;

//import NguyenDucHoangHuy.Inthongtin_HoangHuy.TaiKhoanTietKiem_HoangHuy;
public class Testmain_HoangHuy {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	boolean check=true;
	SapxepChen_HoangHuy sxchen= new SapxepChen_HoangHuy();
	SapxepChon_HoangHuy sxchon= new SapxepChon_HoangHuy();
	Tinhtoan_HoangHuy tt=new Tinhtoan_HoangHuy();
	 Inthongtin_HoangHuy thongtin= new Inthongtin_HoangHuy("Nguyen Duc Hoang Huy","23ITe2","Duy Xuyen-QuangNam",18);
	  TaiKhoanTietKiem_HoangHuy tttk = new TaiKhoanTietKiem_HoangHuy("NDHH111205", 1000000.0, 0.06);
	 
	while(check) {
		System.out.println();
	System.out.println("MENU CONG VIEC:  ");
	System.out.println("1. Sap xep chon.");
	System.out.println("2. Sap xep chen.");
	System.out.println("3. Tinh toan.");
	System.out.println("4. Nap tien vao tai khoan ngan hang. ");
	System.out.println("5. Rut tien tu tai khoan ngan hang.     ");
	System.out.println("6. In thong tin.");
	System.out.println("7. Ket thuc chuong trinh.");
	System.out.println("Chon cong viec thuc hien.");
	int cv=sc.nextInt();
	switch (cv) {
case 1:
		System.out.println("Thuc hien sap xep chon.");
		int kt;
		do {
		System.out.println("nhap vao so phan tu mang:");
		int n = sc.nextInt();
		int []a=new int [n];
		 for (int i=0; i<n; i++) { 
	    	System.out.print("a["+(i+1)+"]=");
	    	a[i]=sc.nextInt();
	    
	    }
	    System.out.print("cac phan tu cua mang:  ");
	    for (int i=0;i<n;i++) {
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
		System.out.print ("Sap xep tang theo sap xep chon:  ");
	  sxchon.sapxepTang(a);
		 for ( int i=0; i<n;i++) {
				System.out.print(a[i]+ " ");
			} 
		 System.out.println();
		 System.out.print ("Sap xep giam theo sap xep chon:  ");
		   sxchon.sapxepGiam(a);
		   for ( int i=0; i<n; i++) {
				System.out.print(a[i] + " ");
			}
		   System.out.println();
		   System.out.println("thuc hien voi mang khac nhap 1 roi khoi nhap 0");
		    kt=sc.nextInt();
		} while (kt==1);
	break;
	
case 2:
		System.out.println("Thuc hien sap xep chen.");
		int kt1;
		do {
		System.out.println("Nhap vao so phan tu mang:");
		int n = sc.nextInt();
		int []a=new int [n];
		 for (int i=0; i<n; i++) { 
	    	System.out.print("a["+(i+1)+"]=");
	    	a[i]=sc.nextInt();
	    
	    }
	    System.out.print("cac phan tu cua mang:  ");
	    for (int i=0;i<n;i++) {
	    	System.out.print(a[i]+" ");
	    }
	    System.out.println();
		System.out.print ("Sap xep tang theo sap xep chen:  ");
	  sxchen.sapxepTang(a);
		 for ( int i=0; i<n;i++) {
				System.out.print(a[i]+ " ");
			} 
		 System.out.println();
		 System.out.print ("Sap xep giam theo sap xep chen:  ");
		   sxchen.sapxepGiam(a);
		   for ( int i=0; i<n; i++) {
				System.out.print(a[i] + " ");
			}
		   System.out.println();
		   System.out.println("thuc hien voi mang khac nhap 1 roi khoi nhap 0");
		    kt1=sc.nextInt();
		} while (kt1==1);
	break;
	
case 3:
		System.out.println("Thuc hien tinh toan.");
		int kt2;
		do {
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		 int b=sc.nextInt();
		System.out.println("Thuc hien cac phep tinh toan: ");
		System.out.println(a+"+"+b+"= "+tt.cong(a, b));
		System.out.println(a+"-"+b+"= "+tt.tru(a, b));
		System.out.println(a+"*"+b+"= "+tt.nhan(a, b));
		System.out.println(a+"/"+b+"= "+tt.chia(a, b));
	   System.out.println("thay doi so nhap 1 roi khoi nhap 0");
	   kt2=sc.nextInt();
		} while(kt2==1);
		break;
case 4:
		int kt3;
		do {
			System.out.println("Tai khoan ngan hang "+tttk.getSoTaikhoan()+" hien co "+ tttk.getSoDu() + "VND.");
		System.out.println("So tien muon nap: ");
		tttk.napTien(sc.nextDouble());
		System.out.println("Da nap thanh cong");
		tttk.inSodu();
		System.out.println("tiep tuc nhap 1 roi khoi nhap 0.");
		kt3=sc.nextInt();
		} while (kt3==1);
		break;
case 5:
		int kt4;
		do {
			System.out.println("Tai khoan ngan hang "+tttk.getSoTaikhoan()+" hien co "+ tttk.getSoDu() + "VND.");
		System.out.println("So tien muon rut: ");
		tttk.rutTien(sc.nextDouble());
		System.out.println("Da rut thanh cong");
		tttk.inSodu();
		System.out.println("tiep tuc nhap 1 roi khoi nhap 0.");
		kt4=sc.nextInt();
		} while (kt4==1);
		break;
	
case 6:
		 thongtin.inthongtin();
	   break;
case 7: 
		System.out.println("Tam biet !!!!!");
		check=false;
		break;
	}
	
	}
	
}
}
