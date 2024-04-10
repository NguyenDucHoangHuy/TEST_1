package Phuong_thuc;

public class Software extends Product {
    private String veration;
    public Software() {
    	super();
    	veration=" ";
    	count++;
    }
	public String getVeration() {
		return veration;
	}
	public void setVeration(String veration) {
		this.veration = veration;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString()+"Veration:     "+veration+"\n";
    	
    }
}
