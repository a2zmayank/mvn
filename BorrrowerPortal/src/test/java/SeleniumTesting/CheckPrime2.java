package SeleniumTesting;

public class CheckPrime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=100; i++) {
			
			if (i==0 || i==1) {
				
				System.out.println("Not Prime= "+i);
				
			}
			else if(i==2) {
				System.out.println("Prime= "+i);
			}
			
			else if(i%2==0) {
				
				System.out.println("Not Prime= "+i);
				
			}
			else if(i%2!=0) {
				
				System.out.println("Prime= "+i);
				
			}
			else {
				System.out.println("Value out of bound");
			}
			
			
			
		}
	}

}
