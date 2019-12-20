package com.class29;

public abstract class File {
	
	public abstract void open();
	
	public void edit() {
		System.out.println("File edited");
	}

	public void close() {
		System.out.println("File closed");
	}

}

class WordFile extends File {

	@Override
	public void open() {
		System.out.println("For opening this file install MS Office");
		
	}
	
}



class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("For opening this file please install Eclipse");
		
	}
	
}


class PDFFile extends File {

	@Override
	public void open() {
		System.out.println("For opening this file please install PFD reader");
		
	}



}
