package YouTubeContent;

public class ConvertIntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;  
		String s=String.valueOf(i);
		System.out.println(s);
		
		int in= Integer.parseInt(s);
		System.out.println(in);
		String d= s+i;
		System.out.println(d);
	}

}
