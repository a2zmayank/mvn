package YouTubeContent;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;

		for (int i = 1; i <= n; i++) {
			// Print Space first
			for (int j = 1; j <= n-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}