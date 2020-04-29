package by.tc.task01.entity;

public class Refrigerator extends Appliance {
	// you may add your own code here
	// Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10,
	// OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70

	private double pOWER_CONSUMPTION;
	private double wEIGHT;
	private double fREEZER_CAPACITY;
	private double oVERALL_CAPACITY;
	private double hEIGHT;
	private double wIDTH;

	public Refrigerator() {
		super();
	}

	public Refrigerator( double pOWER_CONSUMPTION, double wEIGHT, double fREEZER_CAPACITY,
			double oVERALL_CAPACITY, double hEIGHT, double wIDTH) {
		super();
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
		this.wEIGHT = wEIGHT;
		this.fREEZER_CAPACITY = fREEZER_CAPACITY;
		this.oVERALL_CAPACITY = oVERALL_CAPACITY;
		this.hEIGHT = hEIGHT;
		this.wIDTH = wIDTH;
	}

	@Override
	public String toString() {
		return "Refrigerator [pOWER_CONSUMPTION=" + pOWER_CONSUMPTION + ", wEIGHT=" + wEIGHT + ", fREEZER_CAPACITY="
				+ fREEZER_CAPACITY + ", oVERALL_CAPACITY=" + oVERALL_CAPACITY + ", hEIGHT=" + hEIGHT + ", wIDTH="
				+ wIDTH + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(fREEZER_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hEIGHT);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(oVERALL_CAPACITY);
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
		Refrigerator other = (Refrigerator) obj;
		if (Double.doubleToLongBits(fREEZER_CAPACITY) != Double.doubleToLongBits(other.fREEZER_CAPACITY))
			return false;
		if (Double.doubleToLongBits(hEIGHT) != Double.doubleToLongBits(other.hEIGHT))
			return false;
		if (Double.doubleToLongBits(oVERALL_CAPACITY) != Double.doubleToLongBits(other.oVERALL_CAPACITY))
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

	public double getfREEZER_CAPACITY() {
		return fREEZER_CAPACITY;
	}

	public void setfREEZER_CAPACITY(double fREEZER_CAPACITY) {
		this.fREEZER_CAPACITY = fREEZER_CAPACITY;
	}

	public double getoVERALL_CAPACITY() {
		return oVERALL_CAPACITY;
	}

	public void setoVERALL_CAPACITY(double oVERALL_CAPACITY) {
		this.oVERALL_CAPACITY = oVERALL_CAPACITY;
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

	
	

}
