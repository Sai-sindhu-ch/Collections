package Collections;
import java.util.*;
public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<Integer,String>hm = new HashMap<>();
		//using put()
		hm.put(18, "sindhu");
		hm.put(2,"gita");
		hm.put(94,"kavya");
		hm.put(53,"lalli");
		hm.put(null, "anu");
		System.out.println("adding keys and values:");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using replace()
		hm.replace(2,"janu");
		System.out.println("after replacing:");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		HashMap<Integer,String>hm1 = new HashMap<>();
		hm1.put(59, "sanu");
		hm1.put(17,"manu");
		hm1.put(36,"renu");
		System.out.println("keys and values to the second map:");
		for (Map.Entry m:hm1.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using putAll()
		hm.putAll(hm1);
		System.out.println("combining two maps:");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using isEmpty()
		if(hm.isEmpty()){
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		//using size()
		System.out.println("size is:" +hm.size());
		//using putIfAbsent()
		hm.putIfAbsent(6,"sree");
		System.out.println("using putifabsent method");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using remove(object key)
		hm.remove(2);
		System.out.println("removing a key value");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using remove(object key,object value)
		hm.remove(53,"lalli");
		System.out.println("removing a value using its key");
		for (Map.Entry m:hm.entrySet()) {
			System.out.println(" key = " + m.getKey() + " value = " + m.getValue());
		}
		//using containsValue(object v)
		System.out.println("using contains value method");
		if(hm.containsValue("sindhu")) {
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		//using containsKey(object k)
		System.out.println("using contains key method");
		if(hm.containsKey(10)) {
			System.out.println(true);
		}
		else {
			System.out.println("false");
		}
		//using get(object k)
		System.out.println("get the value of an object using its key");
		System.out.println(hm.get(94));
		//using equals()
		System.out.println("equals method");
		if(hm.equals(18)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}

