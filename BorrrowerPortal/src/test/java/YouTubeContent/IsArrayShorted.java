package YouTubeContent;

public class IsArrayShorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.print(ArrayShorted(arr, 0));
	}

	public static boolean ArrayShorted(int arr[], int ind) {
		
		if(ind==arr.length-1) {
			return true;
			
		}

		if (arr[ind] < arr[ind + 1]) {

			return ArrayShorted(arr, ind + 1);

		} else {
			return false;
		}
	}
}