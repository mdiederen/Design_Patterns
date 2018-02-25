package nl.pafr.command;

public class TurnTVUp implements Command{
	ElectronicDevice device;

	public TurnTVUp(ElectronicDevice device) {
		super();
		this.device = device;
	}

	@Override
	public void execute() {
		device.volumeUp();

	}
	
	@Override
	public void undo() {
		device.volumeDown();
		
	}

}
