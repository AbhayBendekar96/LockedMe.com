package com.simplilearn.project_assesment_1;

import java.io.File;
import java.io.IOException;

public class FileWindow {

	public static void createMainFolderIfNotPresent() {

		File file = new File("folder");
		if (!file.exists()) {
			file.mkdirs();
		}
	}

	public static void displayAllFiles(String path) {

		FileWindow.createMainFolderIfNotPresent();

		File dir = new File(path);
		
		File[] files = dir.listFiles();

		for (File f : files) {
			System.out.println(f.getName());
		}
		
	}

	public static void deleteFile(String fileToDelete) {
		File file = new File("./folder/" + fileToDelete);

		if (file.delete()) {
			System.out.println(fileToDelete + " file is deleted. ");
		}

		else {
			System.out.println("File Not Found");
		}
	}

	public static void createFile(String fileToAdd) {
		File file = new File("./folder/" + fileToAdd);

		try {
			if (file.createNewFile()) {
				System.out.println(fileToAdd + " File is created.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void searchFile(String fileToSearch) {
		FileWindow.createMainFolderIfNotPresent();
		File dir = new File("folder");
		File[] files = dir.listFiles();

		for (File f : files) {

			if (f.getName().equals(fileToSearch)) {

				System.out.println(fileToSearch + " found at " + f.getAbsolutePath());
				return;
			}
		}
		System.out.println("file not found");
	}
}