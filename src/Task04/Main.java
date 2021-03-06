package Task04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Detail page");
        primaryStage.setScene(new Scene(root, 620, 595));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
