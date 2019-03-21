import java.util.Scanner;

public class CheckIfStringContainOnlyDigit {

	public static void main(String[] args) {
		
		boolean flag=true;
		System.out.println("Enter String to check if contain only numeric values: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		
		str=str.replace(" ", "");
		for (int i = 0; i < str.length(); i++) {
			int x=str.charAt(i);
			if(!(x>=49 && x<=57)) {
				System.out.println("Values other than digit is also present");
				flag=false;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("contain only digits");
		}
	}
}