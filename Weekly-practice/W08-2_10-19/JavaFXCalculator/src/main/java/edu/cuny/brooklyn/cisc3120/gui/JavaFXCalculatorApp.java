package edu.cuny.brooklyn.cisc3120.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * In this practice we have the class CalculatorModel which acts as the 
 * model, the class MainSceneController which acts as the controller
 * and the FXML MainScene file is used for the view. The model doesn't
 * depend on neither of the controller or the view, however controller
 * and the view depends on the model. Model responds to requests for 
 * information from the view and responds to instructions to change of
 * state from the controller. The view doesn't know about the controller
 * but the controller informs to the view and/or model of changes.
 * The main benefit of a MVC design is due to the isolation of its parts,
 * meaning that if there is a change or an update on a certain part,
 * could be on the business logic, it is less expensive to make the 
 * changes and debugging is facilitated.  
 *
 */
public class JavaFXCalculatorApp extends Application {
    private final static String MAIN_SCENE_FXML = "fxml_mainscene.fxml";
    private final static String APP_TITLE = "Simple JavaFX Calculator";
            
            
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane mainPane = (Pane)FXMLLoader.load(getClass().getResource(MAIN_SCENE_FXML));
        Scene mainScene = new Scene(mainPane);      
        
        mainScene.getStylesheets().add("appmain.css");         
        primaryStage.setTitle(APP_TITLE);
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
}
