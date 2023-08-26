package InterviewQues;

public class Part13_CreateObjectOrivateConstructor {

	
	int age;
	private Part13_CreateObjectOrivateConstructor()
	{
		age=30;
	}
	
	public static Part13_CreateObjectOrivateConstructor  create(){
		
		Part13_CreateObjectOrivateConstructor cc= new Part13_CreateObjectOrivateConstructor();
		cc.age=90;
		return cc;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Part13_CreateObjectOrivateConstructor obj1 = new Part13_CreateObjectOrivateConstructor();
		System.out.println(obj1.age);
		
	}
	
	
	
}
