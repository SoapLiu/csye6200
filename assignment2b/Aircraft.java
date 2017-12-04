package assign2ac;

/**
 * Aircraft class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */
public class Aircraft {
	int fuelCap;	// Kilograms
	String acId;
	int acWeight;
	int acMaxTakeoffWeight;
	int cargoWeight;
	
	/**
	 * Aircraft class constructor
	 */
	public Aircraft() {
//		crewNum = 3;
//		fuelCap = 1000;
//		cruiseSpeed = 500;
	}

	public Aircraft(String acId, int fuelCap, int acWeight, int acMaxTakeoffWeight, int cargoWeight) {
		this.acId = acId;
		this.fuelCap = fuelCap;
		this.acWeight = acWeight;
		this.acMaxTakeoffWeight = acMaxTakeoffWeight;
		this.cargoWeight = cargoWeight;
	}

	public int getAcMaxTakeoffWeight() {
		return acMaxTakeoffWeight;
	}

	public void setAcMaxTakeoffWeight(int acMaxTakeoffWeight) {
		this.acMaxTakeoffWeight = acMaxTakeoffWeight;
	}

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public void setFuelCap(int fuelCap) {
		this.fuelCap = fuelCap;
	}

	public void setAcId(String acId) {
		this.acId = acId;
	}

	public void setAcWeight(int acWeight) {
		this.acWeight = acWeight;
	}


	public String getAcId() {
		return acId;
	}

	public int getFuelCap() {
		return fuelCap;
	}
	
	public int getAcWeight() {
		return acWeight;
	}

	
	public int maxCargoCap() {
		return acMaxTakeoffWeight - fuelCap - acWeight;
	}

}
