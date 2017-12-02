package assign2ac;

/**
 * Aircraft class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */
public class Aircraft {

	int crewNum;
	int fuelCap;	// Kilograms
	double cruiseSpeed; // Kilometers/hr
	String vendor;
	String type;
	int payload;
	double mpg;
	
	/**
	 * Aircraft class constructor
	 */
	public Aircraft() {
		crewNum = 3;
		fuelCap = 1000;
		cruiseSpeed = 500;
	}

	public Aircraft(int crewNum, int fuelCap, double cruiseSpeed, String vendor, String type, int payload,double mpg) {
		this.crewNum = crewNum;
		this.fuelCap = fuelCap;
		this.cruiseSpeed = cruiseSpeed;
		this.vendor = vendor;
		this.type = type;
		this.payload = payload;
		this.mpg = mpg;
	}
	
	public float range() {
		float range =(float) (this.mpg * (this.fuelCap / 2.65));
		return range;
	}

}
