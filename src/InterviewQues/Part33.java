package InterviewQues;

public class Part33 {

	//Vowels 
	public  static boolean isVowel(char t)
	{
		return t=='a' || t=='e' || t=='i' || t=='o' || t=='u' ||
				t=='A' || t=='E' || t=='I' || t=='O' || t=='U' ;
	}
	
	public static void main(String[] args) {
		
		String s = "abcdefghijklmnouupu";
		int count=0;
		
		for(int i=0;i<s.length();++i)
		{
			if(isVowel(s.charAt(i)))
			{
				System.out.println(s.charAt(i));
				++count;
			}
		}
		System.out.println(count);
	}
	
}
