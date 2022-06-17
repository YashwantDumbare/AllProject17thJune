package javaconcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList list1 = new ArrayList();
		System.out.println(list.size());
		list.add("Anand");
		list.add("Pooja");
		list.add("Shahu");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		System.out.println(list.size());
		list1.addAll(list);
		list1.add("Swara");
		System.out.println(list1);
		list.add(0, "Shahu");
		System.out.println(list);
		System.out.println(list1);
		list1.retainAll(list);
		System.out.println(list1);
		System.out.println(list);
		list.set(1, "Yashwant");
		System.out.println(list);
		for(String value:list) {
			System.out.println(value);
		}
		for(Object val: list1) {
			System.out.println(val);
		}
		System.out.println("**************************");
		Iterator<String> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
			
	}

}
