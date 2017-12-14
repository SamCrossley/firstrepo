package Codenames;

import java.util.ArrayList;
import java.util.Random;

import Codenames.WordBank;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application {

	Stage window;

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("static-access")
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pGrid = new GridPane();
		Stage stage2 = new Stage();
		Scene scene2 = new Scene(pGrid, 700, 500);
		WordBank wb = new WordBank("");
		wb.bufferedRead();
		ArrayList<Integer> randomBoard = new ArrayList<Integer>();

		window = primaryStage;
		window.setTitle("CODENAMES");

		GridPane gridView = new GridPane();
		gridView.setVgap(8);
		gridView.setHgap(10);
		Button B1 = new Button();
		Button B2 = new Button();
		Button B3 = new Button();
		Button B4 = new Button();
		Button B5 = new Button();
		Button B6 = new Button();
		Button B7 = new Button();
		Button B8 = new Button();
		Button B9 = new Button();
		Button B10 = new Button();
		Button B11 = new Button();
		Button B12 = new Button();
		Button B13 = new Button();
		Button B14 = new Button();
		Button B15 = new Button();
		Button B16 = new Button();
		Button B17 = new Button();
		Button B18 = new Button();
		Button B19 = new Button();
		Button B20 = new Button();
		Button B21 = new Button();
		Button B22 = new Button();
		Button B23 = new Button();
		Button B24 = new Button();
		Button B25 = new Button();

		GridPane.setConstraints(B1, 0, 0);
		gridView.getChildren().addAll(B1);

		GridPane.setConstraints(B2, 0, 1);
		gridView.getChildren().addAll(B2);

		GridPane.setConstraints(B3, 0, 2);
		gridView.getChildren().addAll(B3);

		GridPane.setConstraints(B4, 0, 3);
		gridView.getChildren().addAll(B4);

		GridPane.setConstraints(B5, 0, 4);
		gridView.getChildren().addAll(B5);

		GridPane.setConstraints(B6, 1, 0);
		gridView.getChildren().addAll(B6);

		GridPane.setConstraints(B7, 1, 1);
		gridView.getChildren().addAll(B7);

		GridPane.setConstraints(B8, 1, 2);
		gridView.getChildren().addAll(B8);

		GridPane.setConstraints(B9, 1, 3);
		gridView.getChildren().addAll(B9);

		GridPane.setConstraints(B10, 1, 4);
		gridView.getChildren().addAll(B10);

		GridPane.setConstraints(B11, 2, 0);
		gridView.getChildren().addAll(B11);

		GridPane.setConstraints(B12, 2, 1);
		gridView.getChildren().addAll(B12);

		GridPane.setConstraints(B13, 2, 2);
		gridView.getChildren().addAll(B13);

		GridPane.setConstraints(B14, 2, 3);
		gridView.getChildren().addAll(B14);

		GridPane.setConstraints(B15, 2, 4);
		gridView.getChildren().addAll(B15);

		GridPane.setConstraints(B16, 3, 0);
		gridView.getChildren().addAll(B16);

		GridPane.setConstraints(B17, 3, 1);
		gridView.getChildren().addAll(B17);

		GridPane.setConstraints(B18, 3, 2);
		gridView.getChildren().addAll(B18);

		GridPane.setConstraints(B19, 3, 3);
		gridView.getChildren().addAll(B19);

		GridPane.setConstraints(B20, 3, 4);
		gridView.getChildren().addAll(B20);

		GridPane.setConstraints(B21, 4, 0);
		gridView.getChildren().addAll(B21);

		GridPane.setConstraints(B22, 4, 1);
		gridView.getChildren().addAll(B22);

		GridPane.setConstraints(B23, 4, 2);
		gridView.getChildren().addAll(B23);

		GridPane.setConstraints(B24, 4, 3);
		gridView.getChildren().addAll(B24);

		GridPane.setConstraints(B25, 4, 4);
		gridView.getChildren().addAll(B25);

		ArrayList<Button> buttonsList = new ArrayList<Button>();
		buttonsList.add(B1);
		buttonsList.add(B2);
		buttonsList.add(B3);
		buttonsList.add(B4);
		buttonsList.add(B5);
		buttonsList.add(B6);
		buttonsList.add(B7);
		buttonsList.add(B8);
		buttonsList.add(B9);
		buttonsList.add(B10);
		buttonsList.add(B11);
		buttonsList.add(B12);
		buttonsList.add(B13);
		buttonsList.add(B14);
		buttonsList.add(B15);
		buttonsList.add(B16);
		buttonsList.add(B17);
		buttonsList.add(B18);
		buttonsList.add(B19);
		buttonsList.add(B20);
		buttonsList.add(B21);
		buttonsList.add(B22);
		buttonsList.add(B23);
		buttonsList.add(B24);
		buttonsList.add(B25);
		
		Text spNarrator = new Text("What is your clue?");
		GridPane.setConstraints(spNarrator, 2, 7);
		gridView.getChildren().add(spNarrator);
		
		
		TextField clue = new TextField();  
		GridPane.setConstraints(clue, 2, 8);
		gridView.getChildren().add(clue);
		
		Text playerClue = new Text();
		pGrid.setConstraints(playerClue, 2, 8);
		pGrid.getChildren().addAll(playerClue);

		Button guessBut = new Button("Submit");
		GridPane.setConstraints(guessBut, 3, 8);
		gridView.getChildren().add(guessBut);
		
		guessBut.setOnAction(e -> {
	      String temp = clue.getText();
	      playerClue.setText("Clue: " + temp);
	      stage2.setScene(scene2);
			
	    });
		
		
		
		// for player buttons
		ArrayList<Button> playerBoard = new ArrayList<Button>();
		for (int i = 0; i < 25; i++) {
			playerBoard.add(new Button());
			playerBoard.get(i).setMaxHeight(130);
			playerBoard.get(i).setMaxWidth(500);
			playerBoard.get(i).setFont(Font.font("Verdana", FontWeight.BOLD, 18));

		}
		// Loop to set all the buttons size - height and width
		for (int x = 0; x < buttonsList.size(); x++) {
			buttonsList.get(x).setMaxHeight(130);
			buttonsList.get(x).setMaxWidth(500);
			buttonsList.get(x).setFont(Font.font("Verdana", FontWeight.BOLD, 18));
			buttonsList.get(x).setTextFill(Color.WHITE);
			// buttonsList.get(x).setT);
		}
		// somehow make a key 8 reds, 8 blues, 8 yellows, 1 black
		Random random = new Random();
		while (randomBoard.size() < 25) {
			int myInt = random.nextInt(25);
			if (!randomBoard.contains(myInt)) {
				randomBoard.add(myInt);
			}
		}
		for (int i = 0; i < 25; i++) {
			playerBoard.get(i).setOnMouseClicked(event -> {
				Button b = (Button) event.getSource();
				b.setStyle(Selector(randomBoard.indexOf(playerBoard.indexOf(b))));

			});

			if (i < 8) {
				String colourString = "-fx-background-color:RED";
				buttonsList.get(randomBoard.get(i)).setStyle(colourString);
				

			} else if (i < 15) {
				String colourString = "-fx-background-color:BLUE";
				buttonsList.get(randomBoard.get(i)).setStyle(colourString);
			}

			else if (i == 15) {
				String colourString = "-fx-background-color:BLACK";

				buttonsList.get(randomBoard.get(i)).setStyle(colourString);
			} else {
				String colourString = "-fx-background-color:GOLD";
				buttonsList.get(randomBoard.get(i)).setStyle(colourString);
			}
		}

		// FOR LOOP TO GET WORDS (from WordBank) TO THE BUTTONS
		for (int i = 0; i < wb.getBank1().size(); i++) {
			buttonsList.get(i).setText(wb.getBank1().get(i).toString());
			playerBoard.get(i).setText(wb.getBank1().get(i).toString());
		}

		/*
		 * for(int i = 0; i < 8; i ++) {
		 * buttonsList.get(i).setStyle("-fx-background-color:" + Type.BLUE.toString()
		 * +";"); }
		 */
		pGrid.setVgap(8);
		pGrid.setHgap(10);
		int loopCounter = 0;
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				pGrid.add(playerBoard.get(loopCounter), j, k);
				loopCounter++;
			}
		}
		Scene scene = new Scene(gridView, 700, 500);
		window.setScene(scene);
		window.show();
		stage2.setScene(scene2);
		stage2.show();
	
	
	}

	public String Selector(int i) {
		if (i < 8) {
			return "-fx-background-color:RED";

		} else if (i < 15) {
			return "-fx-background-color:BLUE";
		}

		else if (i == 15) {
			return "-fx-background-color:BLACK";

		} else {
			return "-fx-background-color:GOLD";
		}
	}
}
