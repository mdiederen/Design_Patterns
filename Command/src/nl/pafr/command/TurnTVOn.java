package nl.pafr.command;

public class TurnTVOn implements Command{
	ElectronicDevice device;

	public TurnTVOn(ElectronicDevice device) {
		super();
		this.device = device;
	}

	@Override
	public void execute() {
		device.on();
		
	}

	@Override
	public void undo() {
		device.off();
		
	}

}
