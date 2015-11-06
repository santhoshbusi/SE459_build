package edu.baseplan.simulator.power;

public class DontSimulateSignal implements StationSimulator {

	private PowerStationSimulator powerStationSimulator;
	
	public DontSimulateSignal(PowerStationSimulator _powerStationSimulator){
		powerStationSimulator = _powerStationSimulator;
	}
	
	public void simulateSignal() {
		powerStationSimulator.setCurrentOutput(powerStationSimulator.getSimulateSignal());
		System.out.println("Emitting Signal...");
	}

	
	public void dontsimulateSignal() {
		powerStationSimulator.setCurrentOutput(powerStationSimulator.getDontSimulateSignal());
		System.out.println("Not Emitting Signal...");
	}
	
	
	public void printCurrentSignal(){
		System.out.println("Not Simulating Power Signal");
	}
}
