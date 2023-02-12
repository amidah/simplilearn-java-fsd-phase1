package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		File f1 = new File("/home/amitdahiya14390/simplilearn-java-fsd-phase1/JAVA-FSD-PHASE1/Sample.txt");
		try {
			Scanner fileReader = new Scanner(f1);
			
			while(fileReader.hasNextLine()) {
				String fileData = fileReader.nextLine();
				System.out.println(fileData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
