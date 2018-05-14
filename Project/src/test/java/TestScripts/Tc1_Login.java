package TestScripts;
import org.testng.annotations.Test;

import BusinessFunctions.Login;
import LIB.Common;
public class Tc1_Login extends RootTest 
{
	private static Common brow;
	static Login login=new Login(brow);
	@Test
	public static void verifyOrangeHRM() throws Exception
	{
		brow.startBrowserFirefox();
		brow.maximiseBrowser();
		//verify title
		brow.verifyTitle("AdminLogin.jspx");
		login.setUp();
		login.loginToapp("SATHGURU","12345");
		brow.waitForPageToLoad();
		//verify title
		brow.verifyTitle("inline_view.jsf");
		login.logout();
		brow.closeBrowser();
		brow.QuitObject();
	}
}
