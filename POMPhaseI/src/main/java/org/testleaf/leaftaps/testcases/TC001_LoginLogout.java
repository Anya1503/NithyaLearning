package org.testleaf.leaftaps.testcases;

import org.testleaf.leaftaps.base.ProjectSpecificMethods;
import org.testleaf.leaftaps.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
	
	
	@Test(dataProvider="fetchData")
	public void runTC001(String username,String password) {
		/*LoginPage page = new LoginPage();
		page.enterUsername("");
		page.enterPassword("");
		page.clickLogin();*/
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
	}

}







