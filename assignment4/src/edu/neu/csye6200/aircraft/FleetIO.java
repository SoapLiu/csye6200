package edu.neu.csye6200.aircraft;

/**
 * FleetIO Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */

import java.io.*;
import java.util.ArrayList;
import java.util.logging.*;
import java.io.File;

public class FleetIO {
	
	private static Logger log = Logger.getLogger(Aircraft.class.getName());
    //load aircrafts information from files and crate new Aircraft(CargoAircraft) object into an AircraftFleet
	public void load(AircraftFleet af, String fileName) {
		Aircraft ac;
		String str = "";
		
     	try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			log.info("Load An Aircraft From File");
			while(br.ready()) {
	     		str = br.readLine().split("\\t")[1];
				String acId = br.readLine().split("\\t")[1];
				int acFuelCap = Integer.parseInt(br.readLine().split("\\t")[1]);
				int acWeight = Integer.parseInt(br.readLine().split("\\t")[1]);
				int acMaxTakeoffWeight = Integer.parseInt(br.readLine().split("\\t")[1]);				
				int cargoWeight = Integer.parseInt(br.readLine().split("\\t")[1]);
				int maxCargoCap = Integer.parseInt(br.readLine().split("\\t")[1]);
				if(str.equals("Cargo")) {
					double cargoHeight = Double.parseDouble(br.readLine().split("\\t")[1]);
					double cargoWidth = Double.parseDouble(br.readLine().split("\\t")[1]);
					double cargoLength = Double.parseDouble(br.readLine().split("\\t")[1]);
					double cargoArea = Double.parseDouble(br.readLine().split("\\t")[1]);
					ac = new CargoAircraft("Cargo", acId, acFuelCap, acWeight, acMaxTakeoffWeight,
							cargoWeight, cargoHeight, cargoWidth, cargoLength);
				} else {
					ac = new Aircraft("Normal", acId, acFuelCap, acWeight, acMaxTakeoffWeight,cargoWeight);
				}
				af.addAircraftList(ac);
				br.skip(1);
			}
			
		} catch(IOException exc) {
			log.severe("A Big Problem Of Load Method");
			exc.printStackTrace();
		}		
	}
	
    //save an aircraftFleet into files
	public void save(AircraftFleet af, String fileName) {
		for(Aircraft ac : af.getAircraftList()) {
			saveSingleAC(ac, fileName);
		}
	}

	//save a single into files
	private void saveSingleAC(Aircraft ac, String fileName) {
		try(BufferedWriter br = new BufferedWriter(new FileWriter(fileName, true))) {
			String s = ac.toString();
			br.append(s + "\n");
			log.info("Save An Aircraft Into File");
		} catch(IOException exc) {
			log.severe("A Big Problem Of Load Method");
			exc.printStackTrace();
		}
	}
	
}
