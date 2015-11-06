package edu.baseplan.simulator.floor;

public class HighPileState implements FloorState {
	
	private FloorSimulator floorSimulator;
	
	public HighPileState(FloorSimulator _floorSimulator)
	{
		floorSimulator = _floorSimulator;
	}
	
	
	public void SwitchLowPile() {
		floorSimulator.setCurrentState(floorSimulator.getLowPileState());
		System.out.println("Switch to Low Pile Carpet");
	}

	
	public void SwitchHighPile() {
		System.out.println("Already on High Pile Carpet");
	}

	
	public void SwitchBareFloor() {
		floorSimulator.setCurrentState(floorSimulator.getBareFloorState());
		System.out.println("Switch to Bare Floor");
	}
	
	public void printState(){
		System.out.println("High Pile Carpet");
	}
}
