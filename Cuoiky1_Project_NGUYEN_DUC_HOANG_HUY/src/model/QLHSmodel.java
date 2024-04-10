package model;
// NGUYEN DUC HOANG HUY
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QLHSmodel implements Serializable {
   private  ArrayList <Hocsinh> dsHocsinh;
   private String tenFile;
        public QLHSmodel() {
        	this.dsHocsinh= new ArrayList<Hocsinh>();
        	this.tenFile=" ";
        }
		public QLHSmodel(ArrayList<Hocsinh> dsHocsinh) {
			 
			this.dsHocsinh = dsHocsinh;
		}
		public ArrayList<Hocsinh> getDsHocsinh() {
			return dsHocsinh;
		}
		public void setDsHocsinh(ArrayList<Hocsinh> dsHocsinh) {
			this.dsHocsinh = dsHocsinh;
		}
		public String getTenFile() {
			return tenFile;
		}
		public void setTenFile(String tenFile) {
			this.tenFile = tenFile;
		}
		public void insert(Hocsinh hocsinh) {
			this.dsHocsinh.add(hocsinh);
		}
		public void delete(Hocsinh hocsinh) {
			this.dsHocsinh.remove(hocsinh);
		}
		public void update(Hocsinh hocsinh) {
			this.dsHocsinh.remove(hocsinh);
			this.dsHocsinh.add(hocsinh);
		}
	 
	 
}