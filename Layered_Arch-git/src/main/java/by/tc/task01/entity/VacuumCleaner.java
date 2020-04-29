package by.tc.task01.entity;

public class VacuumCleaner extends Appliance {
	// you may add your own code here
	// VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2,
	// WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20

	private double pOWER_CONSUMPTION;
	private String fILTER_TYPE;
	private String bAG_TYPE;
	private String wAND_TYPE;
	private double mOTOR_SPEED_REGULATION;
	private double cLEANING_WIDTH;

	public VacuumCleaner() {
		super();

	}

	public VacuumCleaner( double pOWER_CONSUMPTION, String fILTER_TYPE, String bAG_TYPE, String wAND_TYPE,
			double mOTOR_SPEED_REGULATION, double cLEANING_WIDTH) {
		super();
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
		this.fILTER_TYPE = fILTER_TYPE;
		this.bAG_TYPE = bAG_TYPE;
		this.wAND_TYPE = wAND_TYPE;
		this.mOTOR_SPEED_REGULATION = mOTOR_SPEED_REGULATION;
		this.cLEANING_WIDTH = cLEANING_WIDTH;
	}

	@Override
	public String toString() {
		return "VacuumCleaner [pOWER_CONSUMPTION=" + pOWER_CONSUMPTION + ", fILTER_TYPE=" + fILTER_TYPE + ", bAG_TYPE="
				+ bAG_TYPE + ", wAND_TYPE=" + wAND_TYPE + ", mOTOR_SPEED_REGULATION=" + mOTOR_SPEED_REGULATION
				+ ", cLEANING_WIDTH=" + cLEANING_WIDTH + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bAG_TYPE == null) ? 0 : bAG_TYPE.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cLEANING_WIDTH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fILTER_TYPE == null) ? 0 : fILTER_TYPE.hashCode());
		temp = Double.doubleToLongBits(mOTOR_SPEED_REGULATION);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pOWER_CONSUMPTION);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wAND_TYPE == null) ? 0 : wAND_TYPE.hashCode());
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
		VacuumCleaner other = (VacuumCleaner) obj;
		if (bAG_TYPE == null) {
			if (other.bAG_TYPE != null)
				return false;
		} else if (!bAG_TYPE.equals(other.bAG_TYPE))
			return false;
		if (Double.doubleToLongBits(cLEANING_WIDTH) != Double.doubleToLongBits(other.cLEANING_WIDTH))
			return false;
		if (fILTER_TYPE == null) {
			if (other.fILTER_TYPE != null)
				return false;
		} else if (!fILTER_TYPE.equals(other.fILTER_TYPE))
			return false;
		if (Double.doubleToLongBits(mOTOR_SPEED_REGULATION) != Double.doubleToLongBits(other.mOTOR_SPEED_REGULATION))
			return false;
		if (Double.doubleToLongBits(pOWER_CONSUMPTION) != Double.doubleToLongBits(other.pOWER_CONSUMPTION))
			return false;
		if (wAND_TYPE == null) {
			if (other.wAND_TYPE != null)
				return false;
		} else if (!wAND_TYPE.equals(other.wAND_TYPE))
			return false;
		return true;
	}

	public double getpOWER_CONSUMPTION() {
		return pOWER_CONSUMPTION;
	}

	public void setpOWER_CONSUMPTION(double pOWER_CONSUMPTION) {
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public String getfILTER_TYPE() {
		return fILTER_TYPE;
	}

	public void setfILTER_TYPE(String fILTER_TYPE) {
		this.fILTER_TYPE = fILTER_TYPE;
	}

	public String getbAG_TYPE() {
		return bAG_TYPE;
	}

	public void setbAG_TYPE(String bAG_TYPE) {
		this.bAG_TYPE = bAG_TYPE;
	}

	public String getwAND_TYPE() {
		return wAND_TYPE;
	}

	public void setwAND_TYPE(String wAND_TYPE) {
		this.wAND_TYPE = wAND_TYPE;
	}

	public double getmOTOR_SPEED_REGULATION() {
		return mOTOR_SPEED_REGULATION;
	}

	public void setmOTOR_SPEED_REGULATION(double mOTOR_SPEED_REGULATION) {
		this.mOTOR_SPEED_REGULATION = mOTOR_SPEED_REGULATION;
	}

	public double getcLEANING_WIDTH() {
		return cLEANING_WIDTH;
	}

	public void setcLEANING_WIDTH(double cLEANING_WIDTH) {
		this.cLEANING_WIDTH = cLEANING_WIDTH;
	}

}
