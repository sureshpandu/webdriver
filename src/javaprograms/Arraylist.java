package javaprograms;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String>value=new ArrayList<>();
		value.add("manual");
		value.add("selenium");
		System.out.println(value.size());
		for(int i=0;i<2;i++)
		{
			System.out.println(value.get(i));
		}
		
			
		}

	}

