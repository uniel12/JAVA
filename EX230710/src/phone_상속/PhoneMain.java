package phone_상속;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p= new Phone(); 

		p.call();
		p.callBack();
		
		SmartPhone sp = new SmartPhone();
		sp.music();
		sp.intenet();
		sp.call();
		sp.callBack();
	}

}
