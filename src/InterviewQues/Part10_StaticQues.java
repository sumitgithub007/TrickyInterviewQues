
package InterviewQues;

public class Part10_StaticQues {

	public static void main(String[] args) {
		
		System.out.println(Main.x);
		
	}
	
	}

class Main
{
	public static  int x=100;
	static {
		System.out.println("Hurray I executed");
	}
}