package model;
// NGUYEN DUC HOANG HUY
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Quequan implements Serializable{
  private String tenquequan;

public Quequan(String tenquequan) {
	super();
	this.tenquequan = tenquequan;
}

public String getTenquequan() {
	return tenquequan;
}

public void setTenquequan(String tenquequan) {
	this.tenquequan = tenquequan;
}

@Override
public String toString() {
	return "Quequan [tenquequan=" + tenquequan + "]";
}

@Override
public int hashCode() {
	return Objects.hash(tenquequan);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Quequan other = (Quequan) obj;
	return Objects.equals(tenquequan, other.tenquequan);
}
  public static  ArrayList<Quequan> getDSQuequan(){
	  String []arr_qq= {"An Giang", "Bà Rịa - Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", 
			    "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", 
			    "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", 
			    "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", 
			    "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", 
			    "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", 
			    "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", 
			    "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", 
			    "Yên Bái", "Phú Quốc "
  };
	  ArrayList<Quequan> listqq= new ArrayList<Quequan>();
	 
	  for (String tenquequan : arr_qq)	{
		  Quequan qq= new Quequan(tenquequan);
		  listqq.add(qq);
		 }
	  return listqq;
 
}

public static Quequan getQuequanById(int tinh) {
	int index = tinh - 1;
	ArrayList<Quequan> quequanList = Quequan.getDSQuequan();
	if (index >= 0 && index < quequanList.size()) {
        return quequanList.get(index);
    } else {
        return null;
    }	 
}

public static Quequan getQuequanByTen(String tenQuequan) {
   ArrayList<Quequan> quequanList=Quequan.getDSQuequan();
    for (Quequan quequan: quequanList) {
    	if(quequan.getTenquequan().equals(tenQuequan)) {
    		return quequan;
    	}
    }
	return null;
}
}