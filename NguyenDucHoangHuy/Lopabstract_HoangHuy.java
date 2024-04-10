package NguyenDucHoangHuy;

public abstract class Lopabstract_HoangHuy {
	
        protected String ten,lop,que ;
		protected int tuoi;
		public Lopabstract_HoangHuy(String ten, String lop, String que, int tuoi) {
			super();
			this.ten = ten;
			this.lop = lop;
			this.que = que;
			this.tuoi = tuoi;
		}
		public String getTen() {
			return ten;
		}
		public void setTen(String ten) {
			this.ten = ten;
		}
		public String getLop() {
			return lop;
		}
		public void setLop(String lop) {
			this.lop = lop;
		}
		public String getQue() {
			return que;
		}
		public void setQue(String que) {
			this.que = que;
		}
		public int getTuoi() {
			return tuoi;
		}
		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}
}


// abstract class TaiKhoanNganHang_HoàngHuy{
//	 public String getSoTaikhoan() {
//		return soTaikhoan;
//	}
//	public void setSoTaikhoan(String soTaikhoan) {
//		this.soTaikhoan = soTaikhoan;
//	}
//	public double getSoDu() {
//		return soDu;
//	}
//	public void setSoDu(double soDu) {
//		this.soDu = soDu;
//	}
//	protected   String soTaikhoan;
//	 protected  double soDu;
//	public TaiKhoanNganHang_HoàngHuy(String soTaikhoan, double soDu) {
//		this.soTaikhoan = soTaikhoan;
//		this.soDu = soDu;
//	}
//	public abstract void napTien(double tiennap) ;
//    public abstract void rutTien (double tienrut);
//	public  abstract void inSodu();
//}
	 
 
      

