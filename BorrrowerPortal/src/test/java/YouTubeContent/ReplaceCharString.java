package YouTubeContent;

public class ReplaceCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "ABCDEF";
		StringBuilder sb = new StringBuilder(name);
		
		String nameC= "";
		System.out.println(name.length());
		for(int i=0; i<sb.length()-1; i++) {
			if(sb.charAt(i)=='y') {
				sb.setCharAt(i, 'z');
				
			}
			
		}
		System.out.println(sb);
		//sb.insert(sb.length(), 'G');
		//System.out.println(sb);
		
	//	sb.insert(sb.length(), " Gautam");
	//	System.out.println(sb);
	//	sb.deleteCharAt(6);
	//	System.out.println(sb);
	//	sb.delete(2, 4);
	//	System.out.println(sb);
		//sb.append(" New");
	//	System.out.println(sb);
	//	sb.append(" QA");
	//System.out.println(sb);
		
		for(int i=0; i<name.length(); i++) {
			//sb.setCharAt(i, sb.charAt(sb.length()-1-i));
			//sb.setCharAt(sb.length()-1-i, sb.charAt(i));
			//sb.setCharAt(sb.length()-1-i,nameC.charAt(i) );
			nameC +=sb.charAt(name.length()-1-i);
		}
		System.out.println(nameC);
		int c=nameC.compareTo(name);
		System.out.println(c);
		
		String arr[]= nameC.split("D");
		for(String arrs : arr) {
			
			System.out.println(arrs);
			
		}
		
		int i=1;
		int sum=0;
		sum +=i; 
		System.out.println(sum);
		String s=Integer.toString(sum);
		System.out.println(s);
		
		
	}

}
