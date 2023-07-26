package 동물;

public class Main {

	public static void main(String[] args) {
	
		
		System.out.println("참새는 ");
		// . : 참조하다
		Charm c = new Charm();
		c.eat();
		c.sleep();
		c.move();
		c.egg();
		c.cry();
		
		System.out.println();
		
		System.out.println("펭귄은 ");
		Penguin p = new Penguin();
		p.eat();
		p.sleep();
		p.move();
		p.egg();
		p.sliding();
		
		
		
	}

}
