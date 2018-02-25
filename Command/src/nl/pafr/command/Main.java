package nl.pafr.command;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		ElectronicDevice newDevice = TVRemote.getDevice();

		TurnTVOn onCommand = new TurnTVOn(newDevice);

		DeviceButton onPressed = new DeviceButton(onCommand);

		onPressed.press();

		// ----------

		TurnTVOff offCommand = new TurnTVOff(newDevice);

		onPressed = new DeviceButton(offCommand);

		onPressed.press();
		
		// ---------
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		onPressed = new DeviceButton(volUpCommand);
		
		onPressed.press();
		onPressed.press();
		onPressed.press();
		
		// ---------
		
		TV tv = new TV();
		
		Radio radio = new Radio();
		
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(tv);
		allDevices.add(radio);
		
		TurnItAllOff turnOfDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnAllOff = new DeviceButton(turnOfDevices);
		
		turnAllOff.press();
		turnAllOff.pressUndo();
		
	}
}
