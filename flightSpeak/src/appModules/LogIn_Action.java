package appModules;

import pageObjects.Login_Page;
import utility.Constant;
import utility.ExcelUtils;

public class LogIn_Action {
	
	public static void Excute_login(int iTestCaseRow) throws Exception
	
	{
		try{
			Thread.sleep(4000);
			
			Login_Page.txt_username().clear();
			
			String pas = ExcelUtils.getCellData(iTestCaseRow, Constant.UserName);
			
			
		Login_Page.txt_username().sendKeys(pas);
		
		String pass = ExcelUtils.getCellData(iTestCaseRow, Constant.password);
		Thread.sleep(4000);
		
		Login_Page.txt_Password().sendKeys("123456");
		Login_Page.back();
		
		Thread.sleep(4000);
		Login_Page.btn_LogIN().click();
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
	System.out.println(e.getMessage());
		}
	}

}
