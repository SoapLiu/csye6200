package edu.neu.csye6200.aircraft;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.*;


/**
 * AircraftFleet Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */


public class AircraftFleet {
	
	private static AircraftFleet instance = null;
	private AircraftFleet() {}
	public static AircraftFleet getInstance() {
		if(instance == null) {
			instance = new AircraftFleet();
			log.info("Constructing an AircraftFleet Insatance");
		}
		return instance;
	}
	private static Logger log = Logger.getLogger(Aircraft.class.getName());		
	private ArrayList<Aircraft> aircraftList;
	
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
	
	public void setAircraft(int i, Aircraft a) {
		aircraftList.set(i, a);
	}
	
	public void removeAircraftList(int i) {
		aircraftList.remove(i);
	}
	
	public void printAircraftList() {
		for(int i=0; i < size(); i++) {
			System.out.println(getAircraftList(i));
		}
	}

	public int size() {
		return aircraftList.size();
	}
	
	public void sort() {
		int checkCount = 0;
		boolean changed;
		for(int j = 0; j < size(); j++) {
			changed = false;
			for(int i = 0; i < size() - (j + 1); i++) {
				checkCount++;
				if(instance.getAircraftList(i).getAcId().compareTo(instance.getAircraftList(i+1).getAcId()) > 0) {
					Aircraft temp = instance.getAircraftList(i);
					instance.setAircraft(i, instance.getAircraftList(i+1));
					instance.setAircraft(i+1, temp);
					changed = true;
				}
			}
			if(!changed) break;
			else {
				System.out.println("Total number of checks is: " + checkCount);
			}
		}
	}
	
}
