package javaprograms;

class mobiles{
	public void nokia(){
		System.out.println("Asha 305");
	}
	public void samsung(){
		System.out.println("galaxy");
	}
	public void moto(){
		System.out.println("moto g");
	}
}
class sims{
	public void airtel(){
		System.out.println("express ur self");
		}
	public void idea(){
		System.out.println("one idea change ur life");
			}
}
public class classexample {

	public static void main(String[] args) {
		mobiles obj=new mobiles();
		obj.nokia();
		obj.moto();
		obj.samsung();
		sims obj2=new sims();
		obj2.airtel();
		obj2.idea();
	}
	

}
