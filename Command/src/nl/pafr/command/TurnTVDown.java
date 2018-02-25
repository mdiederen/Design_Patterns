package nl.pafr.command;

public class TurnTVDown implements Command{
	ElectronicDevice device;

	public TurnTVDown(ElectronicDevice device) {
		super();
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeDown();

	}
	
	@Override
	public void undo() {
		device.volumeUp();
		
	}


}
