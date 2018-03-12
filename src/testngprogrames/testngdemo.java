package testngprogrames;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdemo {
	@BeforeTest 
	public void openbrowser(){
		System.out.println("open ff with gamial");
		
	}
	@Test
	public void resgistration(){
		System.out.println("registration");
	}
    @Test
   public void login(){
    	System.out.println("login");
    }
    @Test
    public void sendmail(){
    	System.out.println("send resume");
    }
    @AfterTest
   public  void signoff(){
    	System.out.println("logout");
    	
    }
}
