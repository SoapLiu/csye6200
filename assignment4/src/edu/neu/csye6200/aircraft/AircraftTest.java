package edu.neu.csye6200.aircraft;

/**
 * Aircraft Test Program Class
 * 
 * @author Yi Liu
 * NUID: 001819429
 *
 */

import java.util.ArrayList;
import java.util.logging.*;
import java.io.File;
import java.io.IOException;

public class AircraftTest {
	/**
	 * AircraftTest constructor
	 */
	public AircraftTest() {
	  // Create the default list to hold the aircraft
      // Create the default aircraft
      //	 ac1 = new Aircraft(1,128380,920,"Boeing","747", 112760,0.2);
      // ac2 = new Aircraft(2,119833,905,"Boeing","777",102000,0.188);
	}
	
	public static final Logger log = Logger.getLogger(Aircraft.class.getName());

		
	public void run() {
		Aircraft a1 = new Aircraft("Normal", "N1762J",1000,20000,53000,12302);
		Aircraft a2 = new CargoAircraft("Cargo", "N2851J",900,18000,51000,21343,2.5,80.0,3.0);
		Aircraft a3 = new Aircraft("Normal", "N3963J",1100,23000,54000,23578);
		Aircraft a4 = new CargoAircraft("Cargo", "N4396J",890,18000,49000,23132,2.8,67.0,3.8);
		Aircraft a5 = new Aircraft("Normal", "N5235J",1323,23412,55223,12421);
		Aircraft a6 = new Aircraft("Normal", "N5235K",1242,25241,51239,12485);
		Aircraft a7 = new Aircraft("Normal", "N1234J",1252,23412,56887,18621);
		Aircraft a8 = new Aircraft("Normal", "B3241M",1262,24355,58741,11248);
		Aircraft a9 = new Aircraft("Normal", "L1341F",1123,26432,58161,17512);
		Aircraft a10 = new Aircraft("Normal", "I143S",1276,24253,51282,16913);

/*----------------ArrayList Test---------------------------------------------*/		
		AircraftFleet af = AircraftFleet.getInstance();
		
		ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();

		af.setAircraftList(aircraftList);

		af.addAircraftList(a1);		
		af.addAircraftList(a2);
		af.addAircraftList(a3);
		af.addAircraftList(a4);
		af.addAircraftList(a5);		
		af.addAircraftList(a6);
		af.addAircraftList(a7);
		af.addAircraftList(a8);
		af.addAircraftList(a9);
		af.addAircraftList(a10);

		
		System.out.println("----------Test CargoAircraft and Aircraft----------");
		af.printAircraftList();
		System.out.println("---------------------------------------------------");
		
		System.out.println("----------Test sort----------");
		af.sort();
		af.printAircraftList();

		FleetIO io = new FleetIO();
		io.save(af, "/Users/soap/eclipse-workspace/assignment4/src/edu/neu/csye6200/aircraft/test.txt");
		io.load(af, "/Users/soap/eclipse-workspace/assignment4/src/edu/neu/csye6200/aircraft/test.txt");
		io.load(af, "wrong");
		
	}

	/**
	 * Print the aircraft to the console
	 */
	
	/**
	 * This is where we start (just like a C/C++ program)
	 * @param args
	 */
	public static void main(String[] args) {
		AircraftTest test = new AircraftTest();

		String sep = File.separator;
		String logPath = "/Users/soap/eclipse-workspace/assignment4/src/edu/neu/csye6200/aircraft" + sep + "logs" + sep + "server.log";
		
		try {
			File logDirFile = new File("/Users/soap/eclipse-workspace/assignment4/src/edu/neu/csye6200/aircraft" + sep + "logs");
			if(!logDirFile.exists()) logDirFile.mkdirs();
			FileHandler handler = new FileHandler(logPath);
			log.addHandler(handler);
			test.run(); 
		} catch (SecurityException exc) {
			exc.printStackTrace();
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
		
}
