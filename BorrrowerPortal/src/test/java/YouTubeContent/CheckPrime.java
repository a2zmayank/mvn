package YouTubeContent;

import java.util.Scanner;

public class CheckPrime {

	static boolean isPrime(int n) {
		// since 0 and 1 is not prime return false.
		if (n == 1 || n == 0)
			return false;

		// Run a loop from 2 to n-1
		for (int i = 2; i < n; i++) {
			// if the number is divisible by i, then n is not a prime number.
			if (n % i == 0)
				return false;
		}
		// otherwise, n is prime number.
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		for (int i = 1; i <= n; i++) {
			// check if current number is prime
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}