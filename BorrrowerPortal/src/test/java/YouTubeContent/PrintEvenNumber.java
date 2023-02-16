package YouTubeContent;

import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		for(int i=1; i<=num; i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 0 or 1");
		int number = sc.nextInt();
		if(number==1) {
			System.out.println("Please enter percentage from 0 to 100");
			int second = sc.nextInt();
			if(second>=90 && second<=100) {
				
				System.out.println("This is Good");
				
			}else if(second>=60 && second<90) {
				System.out.println("This is also Good");
			}else if (second>=0 && second<600) {
				System.out.println("This is Good as well");
			}else {
				System.out.println("Enter number is wrong= "+second);
			}
			
		}else {
			System.out.println("Please try after some time");
		}
	}
}