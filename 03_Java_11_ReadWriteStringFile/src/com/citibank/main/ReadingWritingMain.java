package com.citibank.main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadingWritingMain {
	public static void main(String[] args) {

		try {
			Files.writeString(Paths.get("data.txt"), "This is test data", StandardCharsets.UTF_8,
					StandardOpenOption.CREATE);
			System.out.println("Please check your file");

			String data = Files.readString(Paths.get("data.txt"));
			System.out.println("Data From File");
			System.out.println(data);

		} catch (IOException e) {
			System.out.println("Exception");
			System.out.println(e.getMessage());
		}

	}
}
