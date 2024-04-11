package Main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("The Book of Exodus"); // Title of window
        primaryStage.setMaxHeight(700);
        primaryStage.setMaxWidth(900);

    // Create initial screen content
    StackPane initialScreenRoot = createInitialScreen(primaryStage);

    // Set the initial screen as the scene's root
    primaryStage.setScene(new Scene(initialScreenRoot));
    primaryStage.show();
    }

    private StackPane createInitialScreen(Stage primaryStage) {
        ImageView imageView = new ImageView(new Image(getClass().getResourceAsStream("/Main/Splitting_the_red_sea.jpg")));
        imageView.setFitHeight(500);
        imageView.setFitWidth(700);
        imageView.setPreserveRatio(true); // Stretch the image to fit the screen

        // Create start and exit buttons
        Button btnStart = new Button("Start"); // Start game
        Button btnExit = new Button("Exit"); // Exit window

        // Add event handlers for buttons
        btnStart.setOnAction(event -> showSecondScreen(primaryStage));
        btnExit.setOnAction(event -> primaryStage.close());

        // Create a VBox to hold the buttons
        VBox vbox = new VBox(10, btnStart, btnExit);
        vbox.setAlignment(Pos.BOTTOM_CENTER); // Center align the buttons
        vbox.setPadding(new Insets(0, 0, 20, 0)); // Add some bottom padding

        // Create an HBox to hold the VBox
        HBox hbox = new HBox(vbox);
        hbox.setAlignment(Pos.BOTTOM_CENTER); // Align vbox to bottom center

        // Set the StackPane as the root
        StackPane root = new StackPane(imageView, hbox);
        return root;
    }


    // Method to show the second screen
    private void showSecondScreen(Stage primaryStage) {
        // Create content for the second screen
    ImageView mosesImageView = new ImageView(new Image(getClass().getResourceAsStream("/Main/Baby_Moses_being_released.png")));
    mosesImageView.setFitHeight(500);
    mosesImageView.setFitWidth(700);
    mosesImageView.setPreserveRatio(true); // Stretch image to fit screen

    // Create text explaining the scene
    TextArea textArea = new TextArea();
    textArea.setText("This scene depicts Moses being released into the River Nile by his mother Jochobed.");
    textArea.setEditable(false);
    textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: black;");
    textArea.setWrapText(true); // Wrap text within the text area
    textArea.setMaxWidth(700); // Set maximum width to match image width
    textArea.setMinHeight(50); // Set minimum height
    textArea.setPrefHeight(50); // Set preferred height

    // Create a button to go back to the initial screen
    Button btnBack = new Button("Go Back");
    Button btnNext = new Button("Next");
    btnBack.setOnAction(event -> primaryStage.setScene(new Scene(createInitialScreen(primaryStage))));
    btnNext.setOnAction(event -> showThirdScreen(primaryStage));

    HBox btnHBox = new HBox();
    btnHBox.getChildren().add(btnBack);
    btnHBox.getChildren().add(btnNext);
    btnHBox.setAlignment(Pos.CENTER);

    // Create a VBox to stack the image, text area, and buttons vertically
    VBox vbox = new VBox(20, mosesImageView, btnHBox, textArea);
    vbox.setAlignment(Pos.CENTER); // Center align the content

    // Set content for the second screen
    primaryStage.setScene(new Scene(vbox));

    // Adjust the stage size to fit the expanded text area
    primaryStage.sizeToScene();
    }


    // Method to show the third screen
    private Stage showThirdScreen(Stage primaryStage) {
        // Create content for the third screen
        ImageView mosesImageView = new ImageView(new Image(getClass().getResourceAsStream("/Main/moses_found.jpg")));
        mosesImageView.setFitHeight(500);
        mosesImageView.setFitWidth(700);
        mosesImageView.setPreserveRatio(true); // Stretch image to fit screen

        // Create text explaining the scene
        TextArea textArea = new TextArea();
        textArea.setText("Here, Moses is found in the Nile by Pharaoh's daugther Bithiah. She takes him as her own son.");
        textArea.setEditable(false);
        textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: black;");
        textArea.setWrapText(true); // Wrap text within the area
        textArea.setMaxWidth(700); // Set maximum width to match image width
        textArea.setMinHeight(50); // Set minimum height
        textArea.setPrefHeight(50); // Set preferred height

        // Create a button to go back to the second screen
        Button btnBack = new Button("Go Back");
        Button btnNext = new Button("Next");
        btnBack.setOnAction(event -> showSecondScreen(primaryStage));
        btnNext.setOnAction(event -> showFourthScreen(primaryStage));

        // Create an HBox to hold the button
        HBox btnHBox = new HBox();
        btnHBox.getChildren().add(btnBack);
        btnHBox.getChildren().add(btnNext);
        btnHBox.setAlignment(Pos.CENTER); // Center align the button

        // Create a VBox to stack the image, buttons, and text area vertically
        VBox vbox = new VBox(20, mosesImageView, btnHBox, textArea);
        vbox.setAlignment(Pos.CENTER); // Center align the content

        // Set content for 3rd Screen
        primaryStage.setScene(new Scene(vbox));

        // Adjust the stage size to fit the expanded text area
        primaryStage.sizeToScene();
        return primaryStage;
    }

    // Method to show the fourth screen
    private Stage showFourthScreen(Stage primaryStage) {
        // Create content for the fourth screen
        ImageView mosesImageView = new ImageView(new Image(getClass().getResourceAsStream("/Main/burning_bush.jpg")));
        mosesImageView.setFitHeight(500);
        mosesImageView.setFitWidth(700);
        mosesImageView.setPreserveRatio(true); // Stretch image to fit screen

        // Create text explaining the scene
        TextArea textArea = new TextArea();
        textArea.setText("Moses grows up in Egypt. He came accross a bush which appeared to be burning, but not turning to ash. The Lord God spoke to him saying 'I AM WHO I AM'. God calls upon Moses to set the Israelites free from Egypt.");
        textArea.setEditable(false);
        textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: black;");
        textArea.setWrapText(true); // Wrap text within the text area
        textArea.setMaxWidth(700); // Set maximum width to match image width
        textArea.setMinHeight(50); // Set minimum height
        textArea.setPrefHeight(50); // Set preferred height

        // Create a button to go back to the third screen
        Button btnBack = new Button("Go Back");
        Button btnNext = new Button("Next");
        btnBack.setOnAction(event -> showThirdScreen(primaryStage));
        btnNext.setOnAction(event -> showFifthScreen(primaryStage));

        HBox btnHBox = new HBox();
        btnHBox.getChildren().add(btnBack);
        btnHBox.getChildren().add(btnNext);
        btnHBox.setAlignment(Pos.CENTER);

        // Create a VBox to stack the image, text area, and buttons vertically
        VBox vbox = new VBox(20, mosesImageView, btnHBox, textArea);
        vbox.setAlignment(Pos.CENTER); // Center align the content

        // Set content for 4th Screen
        primaryStage.setScene(new Scene(vbox));

        // Adjust the stage size to fit the expanded text area
        primaryStage.sizeToScene();
        return primaryStage;
    }

    // Method to show the fifth screen
    private Stage showFifthScreen(Stage primaryStage) {
        // Create content for the fifth screen
        ImageView mosesImageView = new ImageView(new Image(getClass().getResourceAsStream("/Main/splitting_the_sea.jpg")));
        mosesImageView.setFitHeight(500);
        mosesImageView.setFitWidth(700);
        mosesImageView.setPreserveRatio(true); // Stretch image to fit screen

         // Create text explaining the scene
        TextArea textArea = new TextArea();
        textArea.setText("20 years follow Moses hearing God, Yahweh, in the burning bush. Plagues fall upon the land. The Angel of Death came at Passover. Eventually, Moses did what God asked of him, leading the Israelites out of Egypt. Moses split the Red Sea with the power of God and led them through the sea as the sea swallowed the Egyptians coming after them.");
        textArea.setEditable(false);
        textArea.setStyle("-fx-text-fill: white; -fx-control-inner-background: black;");
        textArea.setWrapText(true); // Wrap text within the text area
        textArea.setMaxWidth(700); // Set maximum width to match image width
        textArea.setMinHeight(70); // Set minimum height
        textArea.setPrefHeight(70); // Set preferred height

        // Create a button to go back to the fourth screen
        Button btnBack = new Button("Go Back");
        Button btnHome = new Button("Home");
        btnBack.setOnAction(event -> showFourthScreen(primaryStage));
        btnHome.setOnAction(event -> primaryStage.setScene(new Scene(createInitialScreen(primaryStage))));

        HBox btnHBox = new HBox();
        btnHBox.getChildren().add(btnBack);
        btnHBox.getChildren().add(btnHome);
        btnHBox.setAlignment(Pos.CENTER);

        // Create a VBox to stack the image, text area, and buttons vertically
        VBox vbox = new VBox(20, mosesImageView, btnHBox, textArea);
        vbox.setAlignment(Pos.CENTER); // Center align the content

        // Set content for Final Screen
        primaryStage.setScene(new Scene(vbox));

        // Adjust the size to fit the expanded text area
        primaryStage.sizeToScene();
        return primaryStage;
    }

}