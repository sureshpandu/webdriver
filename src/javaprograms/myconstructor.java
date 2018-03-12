package javaprograms;
class constructor{
	constructor(){
		System.out.println("ss");
	}
	constructor(int a)
	{
		System.out.println(a);
	}
	constructor(String x)
	{
		System.out.println(x);
	}
	constructor(int a,String x)
	{
		System.out.println(a+x);
	}
}

public class myconstructor {

	public static void main(String[] args) {
		new constructor();
		new constructor(200);
		new constructor(20,"   "+"ssc");
		

	}

}
