package test;

import java.util.*;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numbers: ");
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		System.out.println(" " + cases);

		for (int i = 0; i < cases; i++) {
			while (sc.hasNext()) {
				String vals = sc.nextLine();
				String[] sepVals = vals.split(" ");
				Arrays.sort(sepVals);
				for (int j = 0; j < sepVals.length; j++) {
					System.out.println(" " + sepVals[j]);

				}
				System.out.println(
						"val: " + (Integer.parseInt(sepVals[sepVals.length - 1]) - Integer.parseInt(sepVals[0])));
			}

		}
		sc.close();
	}

}

// 1
// 4
// 4 1 2 9