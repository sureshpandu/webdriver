package javaprograms;

//same method name but differnt signatures or parameters called method over loading
class method{
	void v1(){
		System.out.println("qa");
	}
	void v1(int a){           //type of parameter
		System.out.println(a);
	}
	void v1(int a,int b){         //no.of parameter
		System.out.println(a+b);
	}
	void v1(String x){         //type of parameter
		System.out.println(x);
		
	}
	void v1(int a,String x){  // order of parameter
		System.out.println(a+x);
	}
	void v1(String x,int a){
		System.out.println(x+a);
	}
}
public class methodoverloading {

	public static void main(String[] args) {
		method obj=new method();
		obj.v1();
		obj.v1(5);
		obj.v1(5, 6);
		obj.v1("selenium");
		obj.v1("selenium", 5);
		obj.v1(5, "qtp");
	

	}

}
