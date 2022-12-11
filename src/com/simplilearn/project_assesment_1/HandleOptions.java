package com.simplilearn.project_assesment_1;
import java.util.Scanner;

public class HandleOptions {
	public static void handleWelcomeScreenInput() {

		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				FirstWindow.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileWindow.displayAllFiles("folder");
					break;
				case 2:
					HandleOptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");

					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option ");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			}
		}
	}

	public static void handleFileMenuOptions() {
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				FirstWindow.displayFileMenuOptions();

				FileWindow.createMainFolderIfNotPresent();
				int input = sc.nextInt();
				switch (input) {
				case 1:
					System.out.println("Enter the name of the file to be added to the main Directory");
					String fileToAdd = sc.next();
					FileWindow.createFile(fileToAdd);
					break;
				case 2:
					System.out.println("Enter the name of the file to be deleted from main Directory");
					String fileToDelete = sc.next();

					FileWindow.createMainFolderIfNotPresent();
					FileWindow.deleteFile(fileToDelete);

					break;
				case 3:
					System.out.println("Enter the name of the file to be searched from main Directory");
					String fileName = sc.next();
					FileWindow.createMainFolderIfNotPresent();
					FileWindow.searchFile(fileName);
					break;
				case 4:
					return;
				case 5:
					System.out.println("Program exited successfully.");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		}
	}
}