package javaprograms;

import javaprograms.interfaceeaxample.phone;

public class objinterface {

	public static void main(String[] args) {
		phone obj1=new nokia();
		obj1.answer();
		obj1.calling();
		obj1.reject();
		phone obj2=new samsung();
		obj2.answer();
		obj2.calling();
		obj2.reject();

	}

}
