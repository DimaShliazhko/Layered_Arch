package by.tc.task01.entity;

public class Speakers extends Appliance {
	// you may add your own code here
	// Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4,
	// CORD_LENGTH=2

	private double pOWER_CONSUMPTION;
	private double nUMBER_OF_SPEAKERS;
	private double fREQUENCY_RANGE;
	private double cORD_LENGTH;

	public Speakers() {
		super();

	}

	public Speakers( double pOWER_CONSUMPTION, double nUMBER_OF_SPEAKERS, double fREQUENCY_RANGE,
			double cORD_LENGTH) {
		super();
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
		this.nUMBER_OF_SPEAKERS = nUMBER_OF_SPEAKERS;
		this.fREQUENCY_RANGE = fREQUENCY_RANGE;
		this.cORD_LENGTH = cORD_LENGTH;
	}

	@Override
	public String toString() {
		return "Speakers [pOWER_CONSUMPTION=" + pOWER_CONSUMPTION + ", nUMBER_OF_SPEAKERS=" + nUMBER_OF_SPEAKERS
				+ ", fREQUENCY_RANGE=" + fREQUENCY_RANGE + ", cORD_LENGTH=" + cORD_LENGTH + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(cORD_LENGTH);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(fREQUENCY_RANGE);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nUMBER_OF_SPEAKERS);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pOWER_CONSUMPTION);
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
		Speakers other = (Speakers) obj;
		if (Double.doubleToLongBits(cORD_LENGTH) != Double.doubleToLongBits(other.cORD_LENGTH))
			return false;
		if (Double.doubleToLongBits(fREQUENCY_RANGE) != Double.doubleToLongBits(other.fREQUENCY_RANGE))
			return false;
		if (Double.doubleToLongBits(nUMBER_OF_SPEAKERS) != Double.doubleToLongBits(other.nUMBER_OF_SPEAKERS))
			return false;
		if (Double.doubleToLongBits(pOWER_CONSUMPTION) != Double.doubleToLongBits(other.pOWER_CONSUMPTION))
			return false;
		return true;
	}

	public double getpOWER_CONSUMPTION() {
		return pOWER_CONSUMPTION;
	}

	public void setpOWER_CONSUMPTION(double pOWER_CONSUMPTION) {
		this.pOWER_CONSUMPTION = pOWER_CONSUMPTION;
	}

	public double getnUMBER_OF_SPEAKERS() {
		return nUMBER_OF_SPEAKERS;
	}

	public void setnUMBER_OF_SPEAKERS(double nUMBER_OF_SPEAKERS) {
		this.nUMBER_OF_SPEAKERS = nUMBER_OF_SPEAKERS;
	}

	public double getfREQUENCY_RANGE() {
		return fREQUENCY_RANGE;
	}

	public void setfREQUENCY_RANGE(double fREQUENCY_RANGE) {
		this.fREQUENCY_RANGE = fREQUENCY_RANGE;
	}

	public double getcORD_LENGTH() {
		return cORD_LENGTH;
	}

	public void setcORD_LENGTH(double cORD_LENGTH) {
		this.cORD_LENGTH = cORD_LENGTH;
	}

	
}
