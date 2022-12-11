package com.simplilearn.project_assesment_1;

public class FirstWindow {
	public static void printWelcomeScreen() {

		System.out.println("**************************************************************\n"
				+ " 			LockedMe.com  \n"	
				+ " 			Abhay Bendekar  \n"
				+ "**************************************************************\n");
	}

	public static void displayMenu() {

		System.out.println("\n****** Select any option number from below and press Enter ******\n\n"
				+ "1. Press 1 to Retrive All files from main Directory \n"
				+ "2. Press 2 to Add, Delete, Search files in main Directory\n" + "3. Press 3 to Exit  \n\n"
				+ "***********************************************************\n");

	}

	public static void displayFileMenuOptions() {

		System.out.println("\n****** Select any option number from below and press Enter ******\n\n"
				+ "1. Press 1 to Add file in main directory\n" + "2. Press 2 to Delete a file from main Directory\n"
				+ "3. Press 3 to Search a particular file in Main Directory\n"
				+ "4. Press 4 to Go back to Previous menu\n" + "5. Press 5 to Exit \n\n "
				+ "***********************************************************\n");
	}
}