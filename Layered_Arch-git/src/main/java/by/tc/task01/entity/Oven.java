package by.tc.task01.entity;

public class Oven extends Appliance {
	// you may add your own code here
	// Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5,
	// WIDTH=59.5;
	private double pOWER_CONSUMPTION;
	private double wEIGHT;
	private double cAPACITY;
	private double dEPTH;
	private double hEIGHT;
	private double wIDTH;

	public Oven() {
		super();
	}

	public Oven(double pOWER_CONSUMPTION, double wEIGHT, double cAPACITY, double dEPTH, double hEIGHT, double wIDTH) {
		super();
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
		this.wEIGHT = wEIGHT;
		this.cAPACITY = cAPACITY;
		this.dEPTH = dEPTH;
		this.hEIGHT = hEIGHT;
		this.wIDTH = wIDTH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dEPTH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hEIGHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pOWER_CONSUMPTION);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wEIGHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(wIDTH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oven other = (Oven) obj;
		if (Double.doubleToLongBits(cAPACITY) != Double.doubleToLongBits(other.cAPACITY))
			return false;
		if (Double.doubleToLongBits(dEPTH) != Double.doubleToLongBits(other.dEPTH))
			return false;
		if (Double.doubleToLongBits(hEIGHT) != Double.doubleToLongBits(other.hEIGHT))
			return false;
		if (Double.doubleToLongBits(pOWER_CONSUMPTION) != Double.doubleToLongBits(other.pOWER_CONSUMPTION))
			return false;
		if (Double.doubleToLongBits(wEIGHT) != Double.doubleToLongBits(other.wEIGHT))
			return false;
		if (Double.doubleToLongBits(wIDTH) != Double.doubleToLongBits(other.wIDTH))
			return false;
		return true;
	}

	public double getpOWER_CONSUMPTION() {
		return pOWER_CONSUMPTION;
	}

	public void setpOWER_CONSUMPTION(double pOWER_CONSUMPTION) {
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public double getwEIGHT() {
		return wEIGHT;
	}

	public void setwEIGHT(double wEIGHT) {
		this.wEIGHT = wEIGHT;
	}

	public double getcAPACITY() {
		return cAPACITY;
	}

	public void setcAPACITY(double cAPACITY) {
		this.cAPACITY = cAPACITY;
	}

	public double getdEPTH() {
		return dEPTH;
	}

	public void setdEPTH(double dEPTH) {
		this.dEPTH = dEPTH;
	}

	public double gethEIGHT() {
		return hEIGHT;
	}

	public void sethEIGHT(double hEIGHT) {
		this.hEIGHT = hEIGHT;
	}

	public double getwIDTH() {
		return wIDTH;
	}

	public void setwIDTH(double wIDTH) {
		this.wIDTH = wIDTH;
	}

	@Override
	public String toString() {
		return "Oven [pOWER_CONSUMPTION=" + pOWER_CONSUMPTION + ", wEIGHT=" + wEIGHT + ", cAPACITY=" + cAPACITY
				+ ", dEPTH=" + dEPTH + ", hEIGHT=" + hEIGHT + ", wIDTH=" + wIDTH + "]";
	}

}
