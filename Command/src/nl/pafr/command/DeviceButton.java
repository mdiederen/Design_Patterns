package nl.pafr.command;

public class DeviceButton {
	
	Command command;

	public DeviceButton(Command command) {
		super();
		this.command = command;
	}
	
	public void press() {
		command.execute();
	}
	
	public void pressUndo() {
		command.undo();
	}
	

}
