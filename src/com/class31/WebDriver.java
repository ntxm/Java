package com.class31;

interface TakesScreenshot {
	
	String $FILE_EXTENSION = ".png";
	void takesScreen();
}

interface Application {
	void application();
}
	
	public interface WebDriver extends TakesScreenshot {
		void openBrowser();
		
		void closeBrowser();
		
		void maximazeWindow();
		
		void findElement();
	}
	
abstract class Browser {
	
	String name;
	public abstract void refresh();
	
}	

class FireFox extends Browser implements WebDriver, Application {

	@Override
	public void takesScreen() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void application() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximazeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
}


