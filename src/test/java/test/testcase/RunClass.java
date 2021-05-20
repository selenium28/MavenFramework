package test.testcase;

import org.testng.annotations.Test;

import com.webPages.LoginClass;

import core.generic.BaseClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class RunClass extends BaseClass{
	
 
	@Test
  public void testCase() {
		LoginClass objLoginClass = new LoginClass();
		
		String username = "1234";
		String password = "1234";
		
		objLoginClass.userName(username);
		objLoginClass.password(password);
		objLoginClass.loginButton();
		
  }
	
  @BeforeMethod
  public void beforeMethod() {
	  setup();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  setDown();
	  
  }

}
