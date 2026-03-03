package seleniumbasics;

public class BrowserAndNavigationCommands extends Base{
	
	public void verifyBrowserCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String handleId =driver.getWindowHandle();
		System.out.println(handleId);
		
		String pageSource =driver.getPageSource();
		System.out.println(pageSource);
	}

	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();  //back to obsqura site from amazon
		driver.navigate().forward();//again going back to amazon
		driver.navigate().refresh();//refresh existing page
	}
	public static void main(String[] args) 
	{
			
		BrowserAndNavigationCommands browser=new BrowserAndNavigationCommands();
		browser.browserLaunch();
		//browser.verifyBrowserCommands();
		browser.verifyNavigationCommands();
	}

}
