package YouTubeContent;

import java.util.Scanner;

public class AddOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addOdds();
		//checkMaxInt();
		//checkCircumference();	
		fibonacciSeries();
	}
	
	public static void addOdds() {
		int num= 100;
		int sumOdds=0;
		
	for(int i=0; i<=num; i++) {
		
		if(i%2!=0) {
			sumOdds= sumOdds+i;
			//System.out.print(i+" ");
		}
	}
	System.out.println(sumOdds);
	}

	public static void checkMaxInt() {
		
		Scanner sc = new Scanner(System.in);
		
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println(Math.max(num1, num2));
	}
	
	public static void checkCircumference() {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		int c= 2*(22/7)*num;
		
		System.out.println("Circumference of "+num+ " is "+c);
	}

	//0,1,1,2,3,5,8
	public static void fibonacciSeries() {
		
		int a= 0;
		int b= 1;
		//int nextValue=a+b;
		int tillNum=10;
		System.out.print(a+" "+b+" ");
		for(int i=1; i<=tillNum; i++) {//0,1,1,2,3,5...
		int c =a+b;//1,2,
		System.out.print(c+" ");
		a=b;
		b=c;
			
		}
	}
}
