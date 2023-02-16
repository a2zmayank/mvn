package CommLoan.BorrrowerPortal;

import java.util.Scanner;

public class ScannerClass {

	public  void main() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type the number");
		
		int x= sc.nextInt();
		
		System.out.println("Please type the Second number");
		int y= sc.nextInt();
		
		int sum = x+y;
		
		System.out.println(sum);

	}

}
