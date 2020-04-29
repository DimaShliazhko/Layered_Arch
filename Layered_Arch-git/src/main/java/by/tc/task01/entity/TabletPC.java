package by.tc.task01.entity;

public class TabletPC extends Appliance {
	// you may add your own code here
	// TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000,
	// FLASH_MEMORY_CAPACITY=2, COLOR=blue

	private double bATTERY_CAPACITY;
	private double dISPLAY_INCHES;
	private double mEMORY_ROM;
	private double fLASH_MEMORY_CAPACITY;
	private String cOLOR;

	public TabletPC() {
		super();

	}

	public TabletPC(double bATTERY_CAPACITY, double dISPLAY_INCHES, double mEMORY_ROM, double fLASH_MEMORY_CAPACITY,
			String cOLOR) {
		super();
		this.bATTERY_CAPACITY = bATTERY_CAPACITY;
		this.dISPLAY_INCHES = dISPLAY_INCHES;
		this.mEMORY_ROM = mEMORY_ROM;
		this.fLASH_MEMORY_CAPACITY = fLASH_MEMORY_CAPACITY;
		this.cOLOR = cOLOR;
	}

	@Override
	public String toString() {
		return "TabletPC [bATTERY_CAPACITY=" + bATTERY_CAPACITY + ", dISPLAY_INCHES=" + dISPLAY_INCHES + ", mEMORY_ROM="
				+ mEMORY_ROM + ", fLASH_MEMORY_CAPACITY=" + fLASH_MEMORY_CAPACITY + ", cOLOR=" + cOLOR + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(bATTERY_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((cOLOR == null) ? 0 : cOLOR.hashCode());
		temp = Double.doubleToLongBits(dISPLAY_INCHES);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fLASH_MEMORY_CAPACITY);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mEMORY_ROM);
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
		TabletPC other = (TabletPC) obj;
		if (Double.doubleToLongBits(bATTERY_CAPACITY) != Double.doubleToLongBits(other.bATTERY_CAPACITY))
			return false;
		if (cOLOR == null) {
			if (other.cOLOR != null)
				return false;
		} else if (!cOLOR.equals(other.cOLOR))
			return false;
		if (Double.doubleToLongBits(dISPLAY_INCHES) != Double.doubleToLongBits(other.dISPLAY_INCHES))
			return false;
		if (Double.doubleToLongBits(fLASH_MEMORY_CAPACITY) != Double.doubleToLongBits(other.fLASH_MEMORY_CAPACITY))
			return false;
		if (Double.doubleToLongBits(mEMORY_ROM) != Double.doubleToLongBits(other.mEMORY_ROM))
			return false;
		return true;
	}

	public double getbATTERY_CAPACITY() {
		return bATTERY_CAPACITY;
	}

	public void setbATTERY_CAPACITY(double bATTERY_CAPACITY) {
		this.bATTERY_CAPACITY = bATTERY_CAPACITY;
	}

	public double getdISPLAY_INCHES() {
		return dISPLAY_INCHES;
	}

	public void setdISPLAY_INCHES(double dISPLAY_INCHES) {
		this.dISPLAY_INCHES = dISPLAY_INCHES;
	}

	public double getmEMORY_ROM() {
		return mEMORY_ROM;
	}

	public void setmEMORY_ROM(double mEMORY_ROM) {
		this.mEMORY_ROM = mEMORY_ROM;
	}

	public double getfLASH_MEMORY_CAPACITY() {
		return fLASH_MEMORY_CAPACITY;
	}

	public void setfLASH_MEMORY_CAPACITY(double fLASH_MEMORY_CAPACITY) {
		this.fLASH_MEMORY_CAPACITY = fLASH_MEMORY_CAPACITY;
	}

	public String getcOLOR() {
		return cOLOR;
	}

	public void setcOLOR(String cOLOR) {
		this.cOLOR = cOLOR;
	}

}
