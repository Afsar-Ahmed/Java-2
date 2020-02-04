import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
/**
 * Write a description of class CalcGui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcGui extends Application
{
    BorderPane mainPane;//display main window
    GridPane numPad, mPad;//controls the button numbers
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9;//displays buttons from 1 to 9
    Button add,sub,mult,div;
    TextField numDisplay;
    Scene scene;
   
    @Override
    public void start(Stage primaryStage){
        //main
        mainPane = new BorderPane();
        numDisplay = new TextField();
                
        numPad = new GridPane();
        mPad = new GridPane();
        
        num1 = new Button("1");
        num2 = new Button("2");
        num3 = new Button("3");
        num4 = new Button("4");
        num5 = new Button("5");
        num6 = new Button("6");
        num7 = new Button("7");
        num8 = new Button("8");
        num9 = new Button("9");        
        numPad();
        
        add = new Button("+");
        sub = new Button("-");
        mult = new Button("X");
        div = new Button("/");
        mPad();
        
        numDisplay = new TextField();
        numDisplay.setPromptText("Enter a number");

        /*numDisplay.setDisable(true);*/
        mainPane.setLeft(numPad);
        mainPane.setCenter(mPad);
        mainPane.setTop(numDisplay);
        //alignSizes(primaryStage);

        scene = new Scene(mainPane, 300, 250);
        primaryStage.setTitle("Hello Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String args[]){
        launch(args);
    }
    
    public void numPad(){
       GridPane.setHalignment(num7,HPos.RIGHT);
        numPad.add(num7,0,0);
        GridPane.setHalignment(num8,HPos.RIGHT);
        numPad.add(num8,1,0);
        GridPane.setHalignment(num9,HPos.RIGHT);
        numPad.add(num9,2,0);  
        
        GridPane.setHalignment(num4,HPos.RIGHT);
        numPad.add(num4,0,1);
        GridPane.setHalignment(num5,HPos.RIGHT);
        numPad.add(num5,1,1);
        GridPane.setHalignment(num6,HPos.RIGHT);
        numPad.add(num6,2,1);
        
        GridPane.setHalignment(num1,HPos.RIGHT);
        numPad.add(num1,0,2);
        GridPane.setHalignment(num2,HPos.RIGHT);
        numPad.add(num2,1,2);
        GridPane.setHalignment(num3,HPos.RIGHT);
        numPad.add(num3,2,2);
        numPad.setVgap(10);
        numPad.setHgap(10);
        numPad.setPadding(new Insets(90,10,90,10));
        numPad.setAlignment(Pos.CENTER);
        numPadActions();
        
    }
    
    public void numPadActions(){
        
        
        
    }
    
    public void mPad(){
        mPad.setAlignment(Pos.CENTER);
        GridPane.setHalignment(add,HPos.RIGHT);
        mPad.add(add,0,0);
        GridPane.setHalignment(sub,HPos.RIGHT);
        mPad.add(sub,1,0);
        GridPane.setHalignment(mult,HPos.RIGHT);
        mPad.add(mult,0,1);
        GridPane.setHalignment(div,HPos.RIGHT);
        mPad.add(div,1,1);
        mPad.setVgap(10);
        mPad.setHgap(10);
        }
    
    public void alignSizes(Stage primaryStage){
        mainPane.setPadding(new Insets(10,10,10,10));
        GridPane.setHalignment(num7,HPos.RIGHT);
        numPad.add(num7,0,0);
    }
}
