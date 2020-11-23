package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.Controllers.AppController;
import sample.Models.AppModel;
import sample.Views.AppView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        AppModel model = new AppModel();
        AppView view = new AppView();
        AppController appController = new AppController(model, view);
        appController.start();
        // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        // primaryStage.setTitle("Hello World");
        // primaryStage.setScene(new Scene(root, 300, 275));
        // primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
