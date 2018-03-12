package testngprogrames;

import org.testng.annotations.Test;

public class modularframework {
	@Test
	public void loginhrm(){
		actionkeyword key=new actionkeyword();
		key.launchbrowser();
		key.login();
		//code for admin module
		/*------------------
		 * -----------------
		 *-----------------
		 ----------------- */
		key.logout();
		key.close();
	}

}
