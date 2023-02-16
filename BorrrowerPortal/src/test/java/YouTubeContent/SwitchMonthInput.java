package YouTubeContent;

import java.util.Scanner;

public class SwitchMonthInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		
		Scanner sc = new Scanner(System.in);
		
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("January");
			break;
			
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		default: 
			System.out.print("Incorrect Input");
		}
		
	}

}
