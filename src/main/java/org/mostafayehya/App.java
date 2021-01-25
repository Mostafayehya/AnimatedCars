package org.mostafayehya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        //Drawing the shape
        int x = 400, y = 300;
        MoveTo moveTo = new MoveTo(350, 350);
        LineTo line1 = new LineTo(450, 250);
        CubicCurveTo cubicCurveTo1 = new CubicCurveTo();
        cubicCurveTo1.setX(450);
        cubicCurveTo1.setY(350);
        cubicCurveTo1.setControlX1(850);
        cubicCurveTo1.setControlY1(100);
        cubicCurveTo1.setControlX2(850);
        cubicCurveTo1.setControlY2(500);

        CubicCurveTo cubicCurveTo2 = new CubicCurveTo();

        cubicCurveTo2.setX(350);
        cubicCurveTo2.setY(350);

        cubicCurveTo2.setControlX1(-50);
        cubicCurveTo2.setControlY1(100);
        cubicCurveTo2.setControlX2(-50);
        cubicCurveTo2.setControlY2(500);



        LineTo line2 = new LineTo(350,250);

        LineTo line3 = new LineTo(x - 50, y - 50);
        LineTo line4 = new LineTo(x + 50, y + 50);
        LineTo line5 = new LineTo(108, 71);
        //Creating a Path
        Path path = new Path(moveTo, line1,cubicCurveTo1,line2,cubicCurveTo2);
        //Preparing the Stage object
        Group root = new Group(path);
        scene = new Scene(root, 800, 600);

        stage.setTitle("Animated Cars");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}