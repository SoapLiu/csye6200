package edu.neu.csye6200.aircraft;

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
	String aircraftType;
	
	/**
	 * Aircraft class constructor
	 */
	public Aircraft() {
//		crewNum = 3;
//		fuelCap = 1000;
//		cruiseSpeed = 500;
	}

	public Aircraft(String aircraftType, String acId, int fuelCap, int acWeight,
			int acMaxTakeoffWeight, int cargoWeight) {
		this.aircraftType = aircraftType;
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
	
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	
	public String getAircraftType() {
		return aircraftType;
	}
		
	public String toString() {
		String s = "AircraftType:\t" + getAircraftType() + "\n"
				+ "AircraftID:\t" + getAcId() + "\n"
				+ "acFuelCap:\t" + getFuelCap() + "\n"
				+ "acWeight:\t" + getAcWeight() + "\n"
				+ "acMTWeight:\t" + getAcMaxTakeoffWeight() + "\n"
				+ "cargoWeight:\t" + getCargoWeight() + "\n"
				+ "MaxCargoCap:\t" + maxCargoCap() + "\n";
		return s;
	}

}
