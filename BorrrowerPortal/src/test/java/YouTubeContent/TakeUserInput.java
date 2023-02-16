package YouTubeContent;

import java.util.Scanner;

public class TakeUserInput {
	Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeUserInput tui = new TakeUserInput();
		tui.sumValue();
		tui.subValue();
		tui.multiValue();
		tui.reminderValue();
		
	}
	public void sumValue() {
		int fstNum= sc.nextInt();
		int scdNum= sc.nextInt();
		System.out.println(fstNum+scdNum);
		
	}
	public void subValue() {
		int fstNum= sc.nextInt();
		int scdNum= sc.nextInt();
		System.out.println(fstNum-scdNum);
	}
	
	public void multiValue() {
		int fstNum= sc.nextInt();
		int scdNum= sc.nextInt();
		System.out.println(fstNum*scdNum);
	}
	public void reminderValue() {
		int fstNum= sc.nextInt();
		int scdNum= sc.nextInt();
		System.out.println(fstNum%scdNum);
	}

}
