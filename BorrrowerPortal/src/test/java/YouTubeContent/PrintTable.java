package YouTubeContent;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		createTable(num1, num2, num3);

	}
	public static void createTable(int num1, int num2, int num3) {
		
		System.out.println("Average = " +(num1+num2+num3)/3);

	}
}