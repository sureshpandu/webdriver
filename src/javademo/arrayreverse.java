package javademo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayreverse {

	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		System.out.println("actual order"+"    "+list);
		Collections.reverse(list);
		System.out.println("reverse order"+"   "+list);
				

	}

}
