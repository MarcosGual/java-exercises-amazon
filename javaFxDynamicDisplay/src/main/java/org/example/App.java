package org.example;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

private String[] trainDetails = { 
    "Tren de las Sierras: Llegada a las 13 hs", 
    "Tren de las Nubes: Llegada a las 15:35 hs", 
    "Tren Panamericano: Llegada a las 18:10 hs", 
    "Ferrocarril Oeste: Llegada a las 0:05 hs", 
    "Tren Norte: Llegada a las 3:50 hs" 
};

private int currentIndex = 0; //TODO 2 To track which train is currently displayed


    @Override
    public void start(Stage primaryStage) {
        //TODO 4 Clear all the code from the start method
        //TODO 5 A Label will act as the notice board, displaying the next arriving train.
        Label noticeLabel = new Label();
        noticeLabel.setStyle(STYLESHEET_CASPIAN);
        //TODO 6 A VBox (Vertical Box) will stack the Label vertically within the window. You’ll want to add some vertical spacing between the components.
        VBox vbox = new VBox();
        vbox.getChildren().add(noticeLabel);
        //TODO 7 Create a Scene using the VBox layout and set it on the primary Stage.
        Scene scene = new Scene(vbox, 400, 200);
        /* TODO 8: Use JavaFX’s Timeline or AnimationTimer to create a repeating task. This task will update the Label with the next train’s details every 5 seconds. */
        primaryStage.setScene(scene);
        primaryStage.setTitle("Próximo Tren:");
        primaryStage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event->{
            noticeLabel.setText(trainDetails[currentIndex]);

            currentIndex = (currentIndex + 1)%trainDetails.length;
        }));
        /* TODO 9: In the repeating task, you’ll update the Label with the next train’s details from the array.
            After displaying the last train, cycle back to the first one.
        */
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        /* TODO 10: call the launch method */
        launch(args);
    }
}
