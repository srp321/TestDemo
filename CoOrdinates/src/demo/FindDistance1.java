package demo;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDistance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] x = {0,10.1,-12.2,38.3,79.99};
		double[] y = {0,-10.1,12.2,-38.3,179.99};
		
		LinkedHashMap<Double, ArrayList<Double>> test = new LinkedHashMap<>();
		
		for (int i = 0; i < x.length; i++) {
			ArrayList<Double> al = new ArrayList<>();
			for (int j = 0; j < x.length; j++) {
				double distance1 = Point2D.distance(x[i],y[i],x[j],y[j]);	
				al.add(distance1);	
			}
			test.put((double) i, al);
		}
		Iterator<Entry<Double, ArrayList<Double>>> itr = test.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Double, ArrayList<Double>>  val =  itr.next();
			//System.out.println(val.getKey()+" : "+val.getValue());
			//System.out.println(val.getValue());
			ArrayList<Double> nstore = new ArrayList<Double>(val.getValue()); 
			Collections.sort(val.getValue());
			int[] indexes = new int[val.getValue().size()];
			for (int n = 1; n < val.getValue().size(); n++){
			    indexes[n] = nstore.indexOf(val.getValue().get(n)) + 1;
			}
			System.out.println((val.getKey()+1) +" : "+ Arrays.toString(indexes));
		}
		
	}
}
