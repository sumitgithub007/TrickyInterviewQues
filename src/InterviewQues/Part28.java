package InterviewQues;
//Java Interview Question : What will be the output when you compare site URL with its ip address?

import java.net.MalformedURLException;
import java.net.URL;

public class Part28 {

	public static void main(String[] args) {
		
		try {
			System.out.println(new URL("https://www.google.com").equals(new URL("https://101.23.4.5.6")));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
