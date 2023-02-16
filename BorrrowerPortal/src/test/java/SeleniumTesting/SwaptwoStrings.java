package SeleniumTesting;

public class SwaptwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take two string s1 and s2 which we need to swap.
		String s1 = "Rahul";
		String s2 = "Shetty";
		
		// Combine both the strings s1 and s2 using the concatenation(+) operator
		s1 = s1 + s2;
		
		//String s3=s1;
		//s1=s2;
		//s2=s3;
		

		//Use the substring method to get the subset of the combined string
		s2 = s1.substring(0, s1.length() - s2.length()); //s2="Rahul";
		s1 = s1.substring(s2.length()); 

		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);

		}
	}