
import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;

/**
 * Disable sleep mode (record current setting beforehand), and re-enable sleep
 * mode. Works with Mac OS X using the "pmset" command.
 */
public class SleepWatch {
	
	
	public static void main(String[] args) throws AWTException {
        Robot rob = new Robot();
        PointerInfo ptr = null;
        while (true) {
            rob.delay(60000);  // Mouse moves every 14 seconds
            ptr = MouseInfo.getPointerInfo();
            rob.mouseMove((int) ptr.getLocation().getX() + 1, (int) ptr.getLocation().getY() + 1);
        }
    }
	
}
