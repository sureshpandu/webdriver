package javaprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetprog {

	
	public static void main(String[] args) {
		Set<String> value=new HashSet<String>();
		value.add("manual");
		value.add("selenium");
		System.out.println(value.size());
	Iterator<String> i=value.iterator();
	while(i.hasNext()){
		System.out.println(i.next());
	}

	}

}
