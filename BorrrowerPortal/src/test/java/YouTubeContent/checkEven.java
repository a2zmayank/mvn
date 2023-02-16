package YouTubeContent;

import java.util.Scanner;

public class checkEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int getValue = sc.nextInt();
		
		if(getValue==0 || getValue==1) {
			
			System.out.println("0 or 1 is not even number");
		}else if(getValue%2==0) {
			
			System.out.println("Even number = "+getValue);
			
		}else {
			System.out.println("Not Even Number = "+getValue);
		}

	}

}
