import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot_class {
public static void main(String[] args) throws IOException, AWTException {
	Runtime.getRuntime().exec("notepad");
	Robot r= new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);
	//r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);
	//r.keyRelease(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_SHIFT);
	//r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_P);
}
}
