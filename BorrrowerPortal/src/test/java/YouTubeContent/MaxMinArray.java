package YouTubeContent;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = { 9, 4, 6, 7, 8, 9 };
		
		//int min = Collections.min(Arrays.asList(number));
		//int max = Collections.max(Arrays.asList(number));

		//System.out.println("Min is= " + min);
		//System.out.println("Max is= " + max);

		boolean isAccending = true;
		for (int i = 0; i < number.length - 1; i++) {
			if (number[i] > number[i + 1]) {

				isAccending = false;

			}
		}

		if (isAccending) {

			System.out.println("Sorted");

		} else {
			System.out.println("Not Sorted");
		}
	}
}