package NguyenDucHoangHuy;
import java.util.ArrayList;

public class MainStudent_HoangHuy {
 public static void main(String[] args) {
	   Student_HoangHuy st= new Student_HoangHuy("Nguyen Duc Hoang Huy", 18, 9.5);
	   ArrayList<String> namelist = new ArrayList<>();
	   ArrayList<Integer> agelist = new ArrayList<>();
	   ArrayList<Double> scorelist = new ArrayList<>();
	   System.out.println(st);
	   st.setAge(19);
	   st.setScore(10.0);
	   st.setName("Dev");
	   System.out.println("Thay doi thong tin: ");
	   System.out.println(st);
	   
	 System.out.println("Danh sach them vao: ");
	   namelist.add("Anh Khoi");
	   namelist.add("Doan Quan");
	   agelist.add(19);
	   agelist.add(20);
	   scorelist.add(9.5);
	   scorelist.add(8.5);
	    
	  }
}