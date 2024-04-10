package Interface;

public class SapXepChon implements Sapxep {
	public void sapxepTang(double[] a) {
		 for(int i=0; i<a.length-1; i++) {
			 int min_idx=i;
			   for(int j=i+1; j< a.length; j++) {
				   	if(a[j] <  a[min_idx])
				   		min_idx=j;
				   	double temp=a[min_idx];
				   	a[min_idx]=a[i];
				   	a[i]=temp;
			   }
		 }
		
	}

	@Override
	public void sapxepGiam(double[] a) {
		 for(int i=0; i<a.length-1; i++) {
			 int max_idx=i;
			   for(int j=i+1; j< a.length; j++) {
				   	if(a[j] >  a[max_idx])
				   		max_idx=j;
				   	double temp=a[i];
				   	a[i]=a[max_idx];
				   	a[max_idx]=temp;
			   }
	}

	} 
}

	 