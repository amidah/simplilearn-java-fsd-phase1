package com.simplilearn.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		
		File f1 = new File("/home/amitdahiya14390/simplilearn-java-fsd-phase1/JAVA-FSD-PHASE1/Sample.txt");

		try {
			if(f1.createNewFile()) {
				System.out.println("File " + f1.getName() + " is created successfully");
			}
		} catch (IOException e) {
			
			System.out.println("Exception occurred during file creation...");
		}
	}

}
