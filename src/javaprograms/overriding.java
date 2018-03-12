package javaprograms;

//same method name and same parameters called method overriding

class d1{
	void m1(){
		System.out.println("selenium");	
	}
	class d2 extends d1{
	void m1() {
		System.out.println("qft");
	}
}
public class overriding {

	public void main(String[] args) {
		d2 obj=new d2();
		obj.m1();
		 
		
	}
		

	}

}
