package NguyenDucHoangHuy;

public class Inthongtin_HoangHuy  extends Lopabstract_HoangHuy{

	public Inthongtin_HoangHuy(String ten, String lop, String que, int tuoi) {
		super(ten, lop, que, tuoi);
	}
     public void inthongtin(){
    	 System.out.println("    Thong tin:");
    	 System.out.println("Ten: " + ten);
         System.out.println("Tuoi: " + tuoi);
         System.out.println("Que: " + que);
         System.out.println("Lop: " + lop);
   }
     
}
