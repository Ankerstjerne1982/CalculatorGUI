package application;
	
import javafx.application.Application;
import javafx.event.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import java.util.Scanner;
import application.Calculations;


public class Main extends Application {
	
	Button button_calculate;
	
	@Override
	public void start(Stage primaryStage) {
		try {
//			primaryStage.setTitle("Simple Calculator");
//			primaryStage.setScene(scene);
//			primaryStage.show();
			GUIelements.primaryScreen();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * main function, initializes startup of program
	 * @param args
	 */
		public static void main(String[] args) {
		launch(args);
				
	}
		
}
