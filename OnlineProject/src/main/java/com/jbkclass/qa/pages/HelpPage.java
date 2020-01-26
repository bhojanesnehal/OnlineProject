package com.jbkclass.qa.pages;

import java.util.Iterator;
import java.util.Set;

import com.jbkclass.qa.base.TestBase;

public class HelpPage  extends TestBase
{
	String childWin;
	public String getNewWindowUrl()
	{
		String currentWindow=driver.getWindowHandle();
		
		Set s=driver.getWindowHandles();
		Iterator <String>itr=s.iterator();
		while(itr.hasNext())
		{
			 childWin=itr.next();
		}
		//System.out.println("win size"+s.size());
		driver.switchTo().window(childWin);
		String title=driver.switchTo().window(childWin).getTitle();
		//System.out.println("**new win title**"+title);
		return title;
	}
	
}
