package com.class29;

public class FileTest {

	public static void main(String[] args) {
		
		
		File javaFile = new JavaFile();
		
		javaFile.open();
		javaFile.edit();
		javaFile.close();
		
		System.out.println("------NEXT-------");
		
		File wordFile = new WordFile();
		
		wordFile.open();
		wordFile.edit();
		wordFile.close();
		
		System.out.println("------NEXT-------");	
		
		
		File pdfFile = new PDFFile();
		
		pdfFile.open();
		pdfFile.edit();
		pdfFile.close();
		
		System.out.println("------NEXT-------");

	}

}
