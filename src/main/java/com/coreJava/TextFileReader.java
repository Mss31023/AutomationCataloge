 package com.coreJava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextFileReader {

	public static void main(String[] args) throws Exception {
		//create the object for FileReader
		FileReader readfile=new FileReader("C:\\Users\\lenovo\\Desktop\\sampleFile.png");
		//create the object for BufferedReader
		BufferedReader br =new BufferedReader(readfile);
		String str; 
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}

	}

}
