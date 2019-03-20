import java.util.Scanner;

public class TwoStringsAnagramOrNot{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(">>> Anagram check <<<");
		
		//Enter String 1 and 2.
		System.out.println("Enter String 1: ");
		String str1=sc.nextLine();
		System.out.println("Enter String 2: ");
		String str2=sc.nextLine();
		
		//replace all white spaces with "".
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
	
		/*
		 info:
		check if the length of both string are same or not
		if not then "not anagram"
		if same then calculate ascii value of both string and compare them
		*/
		if(str1.length()==str2.length()) {
			int str1Value=0;
			int str2Value=0;
			int x=0;
			for (int i = 0; i < str1.length(); i++) {
				x=str1.charAt(i);
				if(x!=32) {
					str1Value=str1Value+x;
				}	
			}
			x=0;
			for (int i = 0; i < str2.length(); i++) {
				x=str2.charAt(i);
				if(x!=32) {
					str2Value=str2Value+x;
				}	
			}
			if(str1Value==str2Value) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not anagram");
			}	
		}
		else {
			System.out.println("Not anagram.");
		}
	}
}