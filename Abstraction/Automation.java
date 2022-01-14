package week3.day2;

public class Automation extends MultipleLangauge {

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("From the interface TestTool");
		
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("From the interface Language");
		
	}

	@Override
	public void python() {
		// TODO Auto-generated method stub
		System.out.println("From the Abstract method");
		
	}
	public static void main(String[] args) {
		//Implementing all the methods of interface and abstract class in Automation class
		Automation auto = new Automation();
		auto.ruby();
		auto.selenium();
		auto.java();
		auto.python();
	}

}
