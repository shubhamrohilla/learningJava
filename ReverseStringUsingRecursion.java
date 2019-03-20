import java.util.Scanner;

public class ReverseStringUsingRecursion {
	void reverseString(String str){
		if(str.length()<2) {
			System.out.print(str);
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			reverseString(str.substring(0, str.length()-1));
		}
	}
	
	public static void main(String[] args) {
		ReverseStringUsingRecursion ob=new ReverseStringUsingRecursion();
		System.out.println("Enter String to Reverse: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		ob.reverseString(str);	
	}

}
