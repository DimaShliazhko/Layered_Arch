package by.tc.task01.entity;

public class Laptop extends Appliance{
	// you may add your own code here
	//Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18

	private double bATTERY_CAPACITY;
	private String oS;
	private double mEMORY_ROM;
	private double sYSTEM_MEMORY;
	private double  cPU;
	private double dISPLAY_INCHS;
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop( double bATTERY_CAPACITY, String oS, double mEMORY_ROM, double sYSTEM_MEMORY, double cPU,
			double dISPLAY_INCHS) {
		super();
		this.bATTERY_CAPACITY = bATTERY_CAPACITY;
		this.oS = oS;
		this.mEMORY_ROM = mEMORY_ROM;
		this.sYSTEM_MEMORY = sYSTEM_MEMORY;
		this.cPU = cPU;
		this.dISPLAY_INCHS = dISPLAY_INCHS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bATTERY_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cPU);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(dISPLAY_INCHS);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mEMORY_ROM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((oS == null) ? 0 : oS.hashCode());
		temp = Double.doubleToLongBits(sYSTEM_MEMORY);
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
		Laptop other = (Laptop) obj;
		if (Double.doubleToLongBits(bATTERY_CAPACITY) != Double.doubleToLongBits(other.bATTERY_CAPACITY))
			return false;
		if (Double.doubleToLongBits(cPU) != Double.doubleToLongBits(other.cPU))
			return false;
		if (Double.doubleToLongBits(dISPLAY_INCHS) != Double.doubleToLongBits(other.dISPLAY_INCHS))
			return false;
		if (Double.doubleToLongBits(mEMORY_ROM) != Double.doubleToLongBits(other.mEMORY_ROM))
			return false;
		if (oS == null) {
			if (other.oS != null)
				return false;
		} else if (!oS.equals(other.oS))
			return false;
		if (Double.doubleToLongBits(sYSTEM_MEMORY) != Double.doubleToLongBits(other.sYSTEM_MEMORY))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [bATTERY_CAPACITY=" + bATTERY_CAPACITY + ", oS=" + oS + ", mEMORY_ROM=" + mEMORY_ROM
				+ ", sYSTEM_MEMORY=" + sYSTEM_MEMORY + ", cPU=" + cPU + ", dISPLAY_INCHS=" + dISPLAY_INCHS + "]";
	}

	public double getbATTERY_CAPACITY() {
		return bATTERY_CAPACITY;
	}

	public void setbATTERY_CAPACITY(double bATTERY_CAPACITY) {
		this.bATTERY_CAPACITY = bATTERY_CAPACITY;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public double getmEMORY_ROM() {
		return mEMORY_ROM;
	}

	public void setmEMORY_ROM(double mEMORY_ROM) {
		this.mEMORY_ROM = mEMORY_ROM;
	}

	public double getsYSTEM_MEMORY() {
		return sYSTEM_MEMORY;
	}

	public void setsYSTEM_MEMORY(double sYSTEM_MEMORY) {
		this.sYSTEM_MEMORY = sYSTEM_MEMORY;
	}

	public double getcPU() {
		return cPU;
	}

	public void setcPU(double cPU) {
		this.cPU = cPU;
	}

	public double getdISPLAY_INCHS() {
		return dISPLAY_INCHS;
	}

	public void setdISPLAY_INCHS(double dISPLAY_INCHS) {
		this.dISPLAY_INCHS = dISPLAY_INCHS;
	}
	
	
	
	
}
