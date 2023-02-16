package YouTubeContent;

public class MoveCharAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = "aefafafadfas";
		int c = 0;
		String second = "";

		filterString(first, 0, c, second);

		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) == 'f') {
				c++;

			} else {
				second += first.charAt(i);
			}

		}
		for (int i = 0; i < c; i++) {
			second += 'f';
		}
		System.out.println(second);

	}

	public static void filterString(String first, int indx, int c, String second) {
		if (indx == first.length()) {
			for (int i = 0; i < c; i++) {
				second += 'f';
			}
			System.out.println(second);
			return;

		}

		if (first.charAt(indx) == 'f') {
			c++;
			filterString(first, indx + 1, c, second);

		} else {
			second += first.charAt(indx);
			filterString(first, indx + 1, c, second);
		}

	}
}