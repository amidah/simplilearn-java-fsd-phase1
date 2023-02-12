package com.simplilearn.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		try {
			FileWriter fwriter = new FileWriter("/home/amitdahiya14390/simplilearn-java-fsd-phase1/JAVA-FSD-PHASE1/Sample.txt");
			fwriter.write("Practice, Practice and Practice is the only way to help you crack any interview!!!");
			fwriter.close();
			System.out.println("The content is successfully written inside the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred...");
			e.printStackTrace();
		}
	}

}

