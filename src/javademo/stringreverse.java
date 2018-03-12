package javademo;

public class stringreverse {

	public static void main(String[] args) {
		String name="suresh";
		String reverse=new StringBuffer(name).reverse().toString();
		System.out.println("actual string"+"   "+name);
		System.out.println("reverse string"+"   " +reverse);

	}

}
