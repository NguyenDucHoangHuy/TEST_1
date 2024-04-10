package NguyenDucHoangHuy;

public class SapxepChon_HoangHuy implements Interface2_HoangHuy_Sapxep {
	public void sapxepTang(int[] a) {
		 for(int i=0; i<a.length-1; i++) {
			 int min_idx=i;
			   for(int j=i+1; j< a.length; j++) {
				   	if(a[j] <  a[min_idx])
				   		min_idx=j;
				   	int temp=a[i];
				   	a[i]=a[min_idx];
				   	a[min_idx]=temp;
			   }
		 }
		
	}

	@Override
	public void sapxepGiam(int[] a) {
		 for(int i=0; i<a.length-1; i++) {
			 int max_idx=i;
			   for(int j=i+1; j< a.length; j++) {
				   	if(a[j] >  a[max_idx])
				   		max_idx=j;
				   	int temp=a[i];
				   	a[i]=a[max_idx];
				   	a[max_idx]=temp;
			   }
	}

	} 
}
