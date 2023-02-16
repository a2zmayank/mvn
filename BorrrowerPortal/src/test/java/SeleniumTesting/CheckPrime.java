package SeleniumTesting;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  num=101;
		
		if(num==0 || num==1) {
			System.out.println("Not Prime= "+num);
			
		}
		
		else if(num==2) {
			System.out.println("Prime= "+num);
		}
		
		else if(num % 2 != 0) {
				
				System.out.println("Prime= "+num);
				
			}	
		else 
			{
				System.out.println("Not Prime= "+num);
			}
		}
	}