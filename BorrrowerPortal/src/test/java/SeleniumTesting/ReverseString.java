package SeleniumTesting;

public class ReverseString {
	
	ReverseString(){
		int a=5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = "Mayank Gautam";
		String outputString = "";

		/*
		* Writing a for loop and looping in the reverse order to get the reverse String
		* as output.
		*/
		System.out.println(inputString.length());

		for (int i = inputString.length()-1; i >= 0; i--) {
		outputString = outputString + inputString.charAt(i);
		}

		System.out.println(outputString);
		}
}
