package selenium;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class tables {

	@Test
	public void array(){
		int []marks={12,45,87,47};
		System.out.println(marks.length);
	for(int i=0;i<marks.length;i++){
		System.out.println(marks[i]);
		
	}
	}
	@Test
	public void array1(){
	String[] names=new String[4];
	names[0]="suresh";
	names[1]="ravi";
	names[2]="hasini";
	names[3]="chinna";
	System.out.println(names.length);
	for(int  i=0;i<names.length;i++)
	{
		System.out.println(names[i]);
	}
	}
@Test
public void arraylist(){
	List<Integer>a=new ArrayList<>();
	a.add(12);
	a.add(25);
	a.add(14);
	for(int i=0;i<a.size();i++)
	{
		System.out.println(a.get(i));
	}
	
	
}
}