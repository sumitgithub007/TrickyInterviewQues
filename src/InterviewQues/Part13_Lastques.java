package InterviewQues;

public class Part13_Lastques {

	
	static {
		System.out.println("static block");
	}
	
	{
		System.out.println("Hi");
	}
	
	Part13_Lastques()
	{
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		new Part13_Lastques();
	}
	
}
