package YouTubeContent;

public class FebonichiSeriesPrint {

	public static void PrintFebSeries(int n1, int n2, int total) {

		if (total == 0) {
			return;
		}

		int n3 = n1 + n2;
		System.out.println(n3);
		n1 = n2;
		n2 = n3;
		PrintFebSeries(n1, n2, total - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, n2 = 1, total = 7;
		System.out.println(n1);
		System.out.println(n2);
		PrintFebSeries(n1, n2, total - 2);
	}
}