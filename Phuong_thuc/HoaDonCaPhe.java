package Phuong_thuc;

 

public class HoaDonCaPhe {
  private String tenloaicaphe;
  private double giatien1kg;
  private double khoiluong;
   
  public HoaDonCaPhe( String ten, double gia, double kl) {
	  this.tenloaicaphe= ten;
	  this.giatien1kg= gia;
	  this.khoiluong= kl;
	  }
	  
  public double tinhtongtien() {
	  return this.giatien1kg*this.khoiluong;
  }
  public boolean kiemtrakhoiluongdaban(double kl) {
	  return this.khoiluong>kl;  //phan nay giong nhu if(this.khoiluong>kl) { return true}
	                                                             //else {return false};
  }
  public boolean kiemtratongtienlonhon200k() {
	  return this.tinhtongtien()>200000;
  }
  public double giamgia(double x) {
	  if (this.tinhtongtien()>500000) {
		  return (x/100)*this.tinhtongtien();}
	  else {return 0;}
	  }
  public double tientrasaukhigiamgia(double x) {
	   return this.tinhtongtien()-this.giamgia(x);
  }
	  
	 public static void main(String[] args) {
		HoaDonCaPhe hd=new HoaDonCaPhe ("Trung Nguyen",100000,1.5);
		HoaDonCaPhe hd2=new HoaDonCaPhe ("Arabica ",300000,2.5);
		
		System.out.println("Tinh tong tien " +hd.tinhtongtien());
		System.out.println("Kiem tra khoi luong >3 "+hd.kiemtrakhoiluongdaban(3));
		System.out.println("Kiem tra khoi luong >1 "+hd.kiemtrakhoiluongdaban(1));
		System.out.println("Tong tien da ban >200k "+hd.kiemtratongtienlonhon200k() );
		System.out.println("Hoa don giam gia "+hd.giamgia(20));
		System.out.println("Hoa don giam gia "+hd2.giamgia(20));
		System.out.println("So tien khach phai tra sau khi giam gia "+hd2.tientrasaukhigiamgia(20));
	}
  
}
