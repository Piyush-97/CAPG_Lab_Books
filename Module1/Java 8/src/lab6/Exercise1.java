package lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line of integers");
		String in = sc.nextLine();
		StringTokenizer st = new StringTokenizer(in);
		int sum = 0;
		while (st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			System.out.println(nextToken);
			sum += Integer.parseInt(nextToken);
		}
		System.out.println("Sum of Integers: " + sum);
	}
}
