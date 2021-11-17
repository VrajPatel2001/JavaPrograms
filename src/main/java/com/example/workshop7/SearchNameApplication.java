package com.example.workshop7;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.*;
import java.util.Arrays;

public class SearchNameApplication extends Application {

        private TextField tfName = new TextField();
        private TextField tfGender = new TextField();
        private TextField tfYear = new TextField();
        private TextField tfMonthlyPayment = new TextField();
        private TextField tfTotalPayment = new TextField();
        private Button tfFind = new Button("Find");
        private TextArea taAns = new TextArea();
        @Override
        public void start(Stage primaryStage) {
            GridPane gridPane = new GridPane();
            gridPane.setHgap(5);
            gridPane.setVgap(5);
            gridPane.add(new Label("Enter the year"), 0, 0);
            gridPane.add(tfYear, 1, 0);
            gridPane.add(new Label("Enter the Gender: "), 0, 1);
            gridPane.add(tfGender, 1, 1);
            gridPane.add(new Label("Enter the Name: "), 0, 2);
            gridPane.add(tfName, 1, 2);
            gridPane.add(tfFind, 1, 3);
            gridPane.add(taAns,0,4,2,1);
            // Set properties for UI
            gridPane.setAlignment(Pos.CENTER);
            tfName.setAlignment(Pos.BOTTOM_RIGHT);
            tfGender.setAlignment(Pos.BOTTOM_RIGHT);
            tfYear.setAlignment(Pos.BOTTOM_RIGHT);

            GridPane.setHalignment(tfFind, HPos.CENTER);

            // Process events
            tfFind.setOnAction(e -> {
                try {
                    findName(Integer.parseInt(tfYear.getText()),tfGender.getText(),tfName.getText());
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            });

            // Create a scene and place it in the stage
            Scene scene = new Scene(gridPane, 500, 350);
            primaryStage.setTitle("Search Name Ranking Application"); // Set title
            primaryStage.setScene(scene); // Place the scene in the stage
            primaryStage.show(); // Display the stage
        }



    public void findName (int year, String gender, String name) throws FileNotFoundException {
        boolean found = false;
        NameData foundData = null;
        String filename = "babynamesranking" + year + ".txt";

        try(BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(filename), "UTF-8")))
        {

            String line;



            while((line = in.readLine()) != null && !found)
            {
                String[] result = line.split("\\t");

                System.out.println(result[3] + result[4]);
                if( (gender.equals("M") ||gender.equals("m")) && result[1].equals(name) )
                {
                    found = true;
                     foundData =  new NameData(name,result[0],result[2]);
                }
                if( (gender.equals("F")|| gender.equals("f")) && result[3].trim().equals(name) )
                {
                    found = true;
                    foundData =  new NameData(name,result[0],result[4]);
                }
            }

        } catch(IOException e)
        {
            e.printStackTrace();
        }

        if(!found)
        {
            taAns.setText(name +" name not found in year " + year + " file.");

        }
        else
        {
            taAns.setText(foundData.getName() +" name is ranked #" + foundData.getRank() + " in " + year + " year." );
        }


    }


    public static void main(String[] args) {
        launch();
    }
}