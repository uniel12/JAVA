package mouse;

public class MouseMain {

	public static void main(String[] args) {
		
		Mouse mouse =new Mouse ();
		
		mouse.leftClick();
		mouse.rightClick();
		mouse.drag();
		
		WheelMouse wheel = new WheelMouse(); 
		
		wheel.scroll();
		wheel.leftClick();
		wheel.rightClick();
		wheel.drag();
		
		VerticalMouse ver = new VerticalMouse();
		ver.realease();
		ver.leftClick();
		ver.rightClick();
		ver.drag();
		
		
	
	}

}
