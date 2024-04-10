package NguyenDucHoangHuy;

import Interface.Sapxep;

public class Tinhtoan_HoangHuy implements Interface1_HoangHuy_Tinhtoan {

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double chia(double a, double b) {
		return a/b;
	}
}
	 