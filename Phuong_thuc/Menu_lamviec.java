package Phuong_thuc;  
         // NGUYỄN ĐỨC HOANG HUY 
 
import java.util.Scanner;
public class Menu_lamviec {
	// phương thức check số nguyên tố
	public static Boolean checksonguyento(int n) {
		 if(n<2){ return false;}
		 for (int i=2; i<n-1;i++) {  
			 if(n%i==0) { return false;}
	  }
	   return true;
	}
	//phương thức check số hoàn thiện
	public static Boolean checksohoanthien(int n) {
		if(n<2) {return false;}
		int tonguoc=1;
		for (int i=2;i<n-1;i++) {
			if(n%i==0) {
				tonguoc+=i;
			}
		}
		return tonguoc==n;
	}
	//phương thức đổi hệ 10 sang hệ 2
	public static String muoisanghai (int n) {
		String Nhiphan=" ";
		while (n>0) {
			Nhiphan=(n%2) + Nhiphan;
			n=n/2;
		}
		return Nhiphan;
	}
	//phương thức tính giai thừa
	public static int giaithua(int n) {
		int gt=1;
		for (int i=1; i<=n;i++) {
			gt*=i;
		}
		return gt;
	}
	//phương thức tim ngay của tháng năm
	public static int day (int month, int year) {
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11 :
			return 30;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;		
            }
		}
		return year;
	}
	//phương thức xếp loại học lực
	public static String xeploai (double diem) {
		if(diem>=9) { return "Gioi";}
		else { if(diem>=7) {return "Kha";}
		   else { if (diem >=5) { return "Trung Binh";}
		       else {return "Kem";}
		   }
       }
	}
	//phương thức phân tích thành thừa số nguyên tố
	public static void tichthuasonguyento ( int n) {
		
		for (int i=2; i<=n;i++) {
			while(n%i==0) {
				  System.out.print(i+" ");
				 n=n/i;
			}
		}
	}
	//phương thức tìm UCLN 
	public static int ucln(int a,int b) {
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
	//phương thức tìm BCNN
	public static int bcnn(int a, int b) {
		return (a*b)/ucln(a,b);
	}
	
	//phương thức đổi hệ 2 sang hệ 10
	public static int haisangmuoi (int n) {
	  int he10=0; int kq=0;
	int i=0;
		do {
				he10=(int)((n%10)* Math.pow(2,i));
			n=(int)n/10;
			i++;
			kq+=he10;
			 }while(n!= 0);
		return kq;
	}
	 
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int kethuc;
	   do {
	   Menu_lamviec cv3=new Menu_lamviec();
	   Menu_lamviec cv4=new Menu_lamviec();
	   Menu_lamviec cv5=new Menu_lamviec();
	   Menu_lamviec cv6=new Menu_lamviec();
	   Menu_lamviec cv7=new Menu_lamviec();
	   Menu_lamviec cv9=new Menu_lamviec();
	   Menu_lamviec cv10=new Menu_lamviec();
	   
	System.out.println("MENU CONG VIEC: ");
	System.out.println("1.Check so nguyen to.");
	System.out.println("2.Check so hoan thien.");
	System.out.println("3.Doi he 10 sang he 2.");
	System.out.println("4.Doi he 2 sang he 10.");
	System.out.println("5.Tinh n giai thua.");
	System.out.println("6.Check so ngay cua thang nam.");
	System.out.println("7.Xep loai hoc luc.");
	System.out.println("8.Phan tich thua so nguyen to. ");
	System.out.println("9.Tim UCLN 2 so.");
	System.out.println("10.Tim BCNN 2 so.");
	System.out.println("================================");
	System.out.println("Chon cong viec thuc hien");
	int cv=sc.nextInt();
	System.out.println("Thuc hien cong viec "+cv);
	switch (cv) {
	case 1:
		int stop1;
		do {
	System.out.print("Nhap n de check so nguyen to: ");
	int n=sc.nextInt();
	if (checksonguyento(n)) { System.out.println(n+" la so nguyen to");}
	else {System.out.println(n+" khong phai so nguyen to");}
	System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop1=sc.nextInt();
		} while (stop1!=0);
	break;
	
	case 2:
		int stop2;
		do {
	System.out.println("Nhap n de check so hoan thien");
	int a=sc.nextInt();
    if(checksohoanthien(a)) { System.out.println(a+" la so hoan thien");}
    else {System.out.println(a+" khong phai so hoan thien");}
    System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop2=sc.nextInt();}
		while(stop2!=0);
	break;
	
	case 3:
		int stop3;
		do{
	System.out.println("Nhap n doi he 10 sang he 2");
	int b=sc.nextInt();
	System.out.println(b+ "sang he nhi phan "+cv3.muoisanghai(b));
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop3=sc.nextInt();}
		while(stop3!=0);
	break;
	
	case 4:	
		int stop4;
		do {
		System.out.println("Nhap vao he nhi phan: ");
		int he10=sc.nextInt();
		System.out.println("Chuyen he thap phan: "+cv4.haisangmuoi(he10));
		 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
		  stop4=sc.nextInt();}
			while(stop4!=0);
	break;
		
	case 5:
		int stop5;
		do {
	System.out.println("Nhap n de tinh giai thua");
	int c=sc.nextInt();
	System.out.println(c+"!= "+cv5.giaithua(c));
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop5=sc.nextInt();}
		while(stop5!=0);
	break;
	
	case 6:
		int stop6;
		do {
	System.out.println("Nhap thang: ");
	int d=sc.nextInt();
	System.out.println("Nhap nam: ");
	int e=sc.nextInt();
	System.out.println("Thang "+d+" nam "+e+" co "+cv6.day(d, e)+" ngay.");
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop6=sc.nextInt();}
		 while(stop6!=0);
	break;
	 
	case 7:
		int stop7;
		do {
	System.out.println("Nhap diem xep loai");
	double h=sc.nextDouble();
	System.out.println("Xep loai "+cv7.xeploai(h));
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop7=sc.nextInt();}
		while(stop7!=0);
	break;
	
	case 8:
		int stop8;
		do {
	System.out.println("Nhap n de phan tich thanh tich cac thua so nguyen to");
	int g=sc.nextInt();
	 
	System.out.print(g+"= ");
	tichthuasonguyento(g);
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop8=sc.nextInt();}
		while(stop8!=0);
	break;
	
	case 9:
		int stop9;
		do {
	System.out.println("Nhap a: ");
	int m=sc.nextInt();
	System.out.println("Nhap b: ");
	int k=sc.nextInt();
	System.out.println("UCLN(a,b)="+cv9.ucln(m,k) );
	 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
	  stop9=sc.nextInt();}
		while(stop9!=0);
	break;
	
	case 10:
		int stop0;
		do {
		System.out.println("Nhap a: ");
		int o=sc.nextInt();
		System.out.println("Nhap b: ");
		int l=sc.nextInt();
		System.out.println("BCNN(a,b)="+cv10.bcnn(o,l) );
		 System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0");
		  stop0=sc.nextInt();}
			while(stop0!=0);
		break;
	}
	
			 
	   
	System.out.println("Ket thuc nhap 0 tiep tuc nhap khac 0.");
	 kethuc=sc.nextInt();
   
	
	} while(kethuc!=0);
	   	   

}
	   } 
