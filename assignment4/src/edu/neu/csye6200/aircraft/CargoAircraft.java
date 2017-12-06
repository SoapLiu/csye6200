package edu.neu.csye6200.aircraft;

/**
 * CargoAircraft Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */

public class CargoAircraft extends Aircraft{
	double height;
	double width;
	double length;
		
	public double getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public CargoAircraft(String aircraftType, String acId, int fuelCap, int acWeight, int acMaxTakeoffWeight,
			int cargoWeight, double cargoHeight, double cargoWidth, double cargoLength) {
		super(aircraftType, acId, fuelCap, acWeight, acMaxTakeoffWeight, cargoWeight);
		this.height = cargoHeight;
		this.width = cargoWidth;
		this.length = cargoLength;
	}

	public CargoAircraft() {
		// TODO Auto-generated constructor stub
	}

	public double cargoArea() {
		return height * width * length;
	}

	public String toString() {
		String s = super.toString()
		+ "CargoHeight:\t" + getHeight() + "\n"
		+ "CargoWidth:\t" + getWidth() + "\n"
		+ "CargoLength:\t" + getLength() + "\n"
		+ "CargoArea:\t" + cargoArea() + "\n";
		return s;
	}

}
