package nl.pafr.command;

import java.util.List;

public class TurnItAllOff implements Command{
	
	private List<ElectronicDevice> devices;

	public TurnItAllOff(List<ElectronicDevice> devices) {
		super();
		this.devices = devices;
	}

	@Override
	public void execute() {
		for(ElectronicDevice device : devices) {
			device.off();
		}
		
	}

	@Override
	public void undo() {
		for(ElectronicDevice device : devices) {
			device.on();
		}
		
	}

}
