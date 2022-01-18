package week3.day2;

public class Automation extends MultipleLanguage implements TestTool,Language{

	

	public void Java() {
		System.out.println("Java language ");
		
	}

	public void Selenium() {
		System.out.println("Selenium Automation");
		
	}

	@Override
	void python() {
		System.out.println( "Python");
		
	}

	@Override
	void ruby() {
		System.out.println("Ruby");
		
	}
public static void main(String[] args) {
	Automation lang = new Automation();
	lang.python();
	lang.ruby();
	lang.Java();
	lang.Selenium();
	
	}

}
