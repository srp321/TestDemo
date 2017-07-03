package demo;

import java.util.ArrayList;
import java.util.Collections;

/*
* Program to get the id of nearest neighbor in ascending order
* of distances from a given initial position to all the points
* of a given set
*/

public class FindDistance2 {
	public static void main(String[] args) {
		// We have taken X and Y coordinate values of a given point,
		// separately in an array which can be later identified by x[i],y[i] if
		// required
		double[] x = { 0, 10.1, -12.2, 38.3, 79.99 }; // Get the X Coordinates
														// separately
		double[] y = { 0, -10.1, 12.2, 38.3, 179.99 }; // Get the Y Coordinates
														// separately

		ArrayList<ArrayList<Float>> allDistances = new ArrayList<>();

		for (int i = 0; i < x.length; i++) {
			ArrayList<Float> al = new ArrayList<>();
			for (int j = 0; j < x.length; j++) {
				// Get the distance between the two points
				float distance1 = (float) Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				al.add(distance1);
			}
			allDistances.add(al);
		}

		for (int k = 0; k < allDistances.size(); k++) {
			// Create a copy to compare the data to get index after
			// sorting in order of increasing distances between coordinates
			ArrayList<Float> tempUnsorted = new ArrayList<Float>(allDistances.get(k));
			Collections.sort(tempUnsorted);
			int[] indexes = new int[tempUnsorted.size()];
			for (int l = 0; l < tempUnsorted.size(); l++) {
				// Adding 1 to indexes to get values starting 1
				indexes[l] = allDistances.get(k).indexOf(tempUnsorted.get(l)) + 1;
			}
			// The values refer to the coordinate id's
			// Getting values till index 3 as only 3 closest
			// points are required in output
			System.out.println(indexes[0] + " : " + indexes[1] + ", " + indexes[2] + ", " + indexes[3]);
		}
	}
}