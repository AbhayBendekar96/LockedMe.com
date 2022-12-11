package com.simplilearn.project_assesment_1;

public class MainWindow {

	public static void main(String[] args) {

		FileWindow.createMainFolderIfNotPresent();
		FirstWindow.printWelcomeScreen();
		HandleOptions.handleWelcomeScreenInput();
	}

}