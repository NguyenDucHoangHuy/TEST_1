package Phuong_thuc;

import java.util.Scanner;

public class ngoaile_Exeption {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	int n=0;
	 try {  
		System.out.println("Nhap vao so nguyen n: ");
		 n=sc.nextInt();
	} catch (Exception e) {
	    System.out.println("Nhap du lieu khong dung");
	}  finally {
		System.out.println("Du sai hay khong sai van se chay dong lenh trong finally nay");
	}
	System.out.println("Gia tri nhap: "+n);
	System.out.println("Ket thuc chuong trinh.");
	

}
}
