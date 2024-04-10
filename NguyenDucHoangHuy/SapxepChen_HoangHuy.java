package NguyenDucHoangHuy;

public class SapxepChen_HoangHuy implements Interface2_HoangHuy_Sapxep {
	public void sapxepTang(int a[]) {
		 int key;
		  for(int i=1 ; i<a.length; i++) {
			  key= a[i];
			  int j= i  -  1;
			  while(j>=0 && a[j] > key) {
				  a[j+1] = a[j];
				  j=j-1;
				  }
			  a[j+1]=key;
		  }
		}
	
	public void sapxepGiam(int a[]) {
		int key;
		  for(int i=1 ; i<a.length; i++) {
			  key= a[i];
			  int j= i  -  1;
			  while(j>=0 && a[j] <	 key) {
				  a[j+1] = a[j];
				  j=j-1;
				  }
			  a[j+1]=key;
		  }
		}
	}


