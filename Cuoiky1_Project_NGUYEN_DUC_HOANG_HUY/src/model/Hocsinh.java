package model;
// NGUYEN DUC HOANG HUY
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Hocsinh implements Serializable {
    private String mahocsinh;
    private String malop;
    private  String hovaten;
    private Date ngaysinh;
    private boolean gioitinh;
    private double dtb;
    private Quequan tinh;
    private String xepLoai;
    public Hocsinh() {
    	
    }
        public Hocsinh(String mahocsinh, String malop, String hovaten, Date ngaysinh, boolean gioitinh, double dtb, Quequan tinh) {
		this.mahocsinh = mahocsinh;
		this.malop = malop;
		this.hovaten = hovaten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.dtb = dtb;
		this.tinh = tinh;
	}
	 
		 
		public String getXepLoai() {
			return xepLoai;
		}
		public void setXepLoai(String xepLoai) {
			this.xepLoai = xepLoai;
		}
		public String getMahocsinh() {
			return mahocsinh;
		}
		public void  setMahocsinh(String mahocsinh) {
			this.mahocsinh = mahocsinh;
		}
		public String getMalop() {
			return malop;
		}
		public void setMalop(String malop) {
			this.malop = malop;
		}
		public String getHovaten() {
			return hovaten;
		}
		public void setHovaten(String hovaten) {
			this.hovaten = hovaten;
		}
		public Date getNgaysinh() {
			return ngaysinh;
		}
		public void setNgaysinh(Date ngaysinh) {
			this.ngaysinh = ngaysinh;
		}
		public boolean isGioitinh() {
			return gioitinh;
		}
		public void setGioitinh(boolean gioitinh) {
			this.gioitinh = gioitinh;
		}
		public double getDtb() {
			return dtb;
		}
		public void setDtb(double dtb) {
			this.dtb = dtb;
		}
		public Quequan getTinh() {
			return tinh;
		}
		public void setTinh(Quequan tinh) {
			this.tinh = tinh;
		}
		@Override
		public int hashCode() {
			return Objects.hash(dtb, gioitinh, hovaten, mahocsinh, malop, ngaysinh, tinh);
		}
		@Override
		public boolean equals(Object obj) {
		    if (this == obj)
		        return true;
		    if (obj == null || getClass() != obj.getClass())
		        return false;
		    Hocsinh other = (Hocsinh) obj;
		    return Double.compare(other.dtb, dtb) == 0 &&
		            gioitinh == other.gioitinh &&
		            Objects.equals(hovaten, other.hovaten) &&
		            Objects.equals(mahocsinh, other.mahocsinh) &&
		            Objects.equals(malop, other.malop) &&
		            Objects.equals(ngaysinh, other.ngaysinh) &&
		            Objects.equals(tinh, other.tinh);
		}
}