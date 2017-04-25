package test;

import java.util.*;

public class demoTest{

     public static void main(String []args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("22|TEST1|300");
        data.add("23|TEST2|250");
        data.add("24|TEST3|200");
        data.add("22|TEST1|250");
        data.add("23|TEST2|200");
        data.add("24|TEST3|300");
        data.add("22|TEST1|200");
        data.add("23|TEST2|300");
        data.add("24|TEST3|250");
        
        Collections.sort(data);
        
        Set<String> subjects = new HashSet<String>();
        for (int i = 0; i < data.size(); i++ ) {
            //System.out.println("value: "+data.get(i));
            String[] splitVal = data.get(i).split("\\|");
            String sub = splitVal[1];
            subjects.add(sub);
        }
        System.out.println("value: "+subjects);
        
        Map<String, String> subVal = new TreeMap<String, String>();
        for (String subject : subjects) {
            System.out.println(subject);
            for  (int i = 0; i < data.size(); i++ ) {
                if (data.get(i).contains(subject)) {
                    String[] splitVal = data.get(i).split("\\|");
                    String sub = splitVal[0];
                    subVal.put(subject, sub);
                }
            }
        }
        for (Map.Entry<String, String> entry : subVal.entrySet()) {
        	
            System.out.println(entry.getKey() + ": " + entry.getValue());
            
        }
     }
}