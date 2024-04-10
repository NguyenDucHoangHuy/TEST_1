package Interface;

public class SapXepChen implements Sapxep {
	public void sapxepTang(double a[]) {
		 double key;
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
	
	public void sapxepGiam(double a[]) {
		double key;
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


