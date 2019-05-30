package Collections;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String args[]) {
		LinkedHashMap<String,Integer>lhm = new LinkedHashMap<>();
		lhm.put("jack",76);
		lhm.put("sindhu",61);
		lhm.put("cera",4);
		lhm.put(null, 56);
		lhm.put("satya", null);
		lhm.put("sarika", null);
		System.out.println("after putting keys and values:");
		for (Map.Entry m:lhm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		lhm.remove("jack");
		lhm.replace("sindhu",7);
		System.out.println("after removing and replacing:");
		for (Map.Entry m:lhm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		LinkedHashMap<String,Integer>lhm1 = new LinkedHashMap<>();
		lhm1.put("karan", 34);
		lhm1.put("ravi",45);
		System.out.println("keys and values to the second map:");
		for (Map.Entry m:lhm1.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		lhm.putAll(lhm1);
		System.out.println("after adding two maps:");
		for (Map.Entry m:lhm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
	}
}
