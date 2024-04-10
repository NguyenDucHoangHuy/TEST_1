package Interface1;

public class thucthi implements Hanhdong, TinhToan  {

	@Override
	public void an() {
		 System.out.println("an");
		
	}

	@Override
	public void ngu() {
		 System.out.println("ngu");
		
	}

	@Override
	public void di() {
		 System.out.println("di");
		
	}

	@Override
	public double cong(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	 
	
	
   
}
