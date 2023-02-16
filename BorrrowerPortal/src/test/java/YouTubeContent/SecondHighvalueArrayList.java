package YouTubeContent;

import java.util.Scanner;

public class SecondHighvalueArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int [] marks = new int [5]; marks[0]=50; marks[1]=60; marks[2]=70;
		 * marks[3]=80; marks[4]=90; System.out.print(marks[0]);
		 */
		
		Scanner sc = new Scanner(System.in);
		int size=sc.nextInt();
		String names[] = new String[size];
		
		for(int i=0;i<size;i++) {
			names[i]= sc.next();
			
		}	
		System.out.println(names.length);
		
		for(int j=0; j<names.length; j++) {
			 System.out.println("name " + (j+1) +" is : " + names[j]);

			
		}

	}

}
