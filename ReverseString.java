import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String to Reverse: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		//Reverse String using Iteration.
		System.out.println("Reversed String is: ");
		for (int i = str.length()-1; i >=0 ; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
