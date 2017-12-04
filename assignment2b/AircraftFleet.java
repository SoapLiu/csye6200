package assign2ac;

import java.util.ArrayList;
import java.util.HashMap;

public class AircraftFleet {
	
	private ArrayList<Aircraft> aircraftList;
	private HashMap<String, Aircraft> aircraftMap;

	public ArrayList<Aircraft> getAircraftList() {
		return aircraftList;
	}
	
	public void setAircraftList(ArrayList<Aircraft> aircraftList) {
		this.aircraftList = aircraftList;
	}

	public void addAircraftList(Aircraft a) {
		aircraftList.add(a);
	}
	
	public Aircraft getAircraftList(int i) {
		return aircraftList.get(i);
	}
	
	public void removeAircraftList(int i) {
		aircraftList.remove(i);
	}
	
	public void printAircraftList() {
		for(int i=0; i < aircraftList.size(); i++) {
			System.out.println("aircraftID:\t" + getAircraftList(i).getAcId());
			System.out.println("fuelCap:\t" + getAircraftList(i).getFuelCap());
			System.out.println("acWeight:\t" + getAircraftList(i).getAcWeight());
			System.out.println();
		}
	}
	
	public HashMap<String, Aircraft> getAircraftMap() {
		return aircraftMap;
	}
	
	public void setAircraftMap(HashMap<String, Aircraft> aircraftMap) {
		this.aircraftMap = aircraftMap;
	}
	
	public void addAircraftMap(Aircraft a) {
		aircraftMap.put(a.getAcId(), a);
	}
	
	public Aircraft getAircraftMap(String s) {
		return aircraftMap.get(s);
	}
	
	public void removeAircraftMap(String s) {
		aircraftMap.remove(s);
	}

}
