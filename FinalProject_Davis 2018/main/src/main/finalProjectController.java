/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class finalProjectController implements Initializable {
    
    private final double tax=1.13;
    
    private final double whiteBagel=1.25;
    private final double wwBagel=1.5;
    
    private final double sodaPrice=1.30;
    private final double coffeePrice=1.12;
    private final double teaPrice=2.00;
    
    private final double topping1=0.5;
    private final double topping2=0.5;
    private final double topping3=0.75;
    private final double topping4=0.65;
    private final double topping5=0.01;
     FileHandling fileio;
   /**
    * sends lines of data to be written to the file
    * @param choice 
    */
  private void sendFile(String choice){
      try{
        fileio = new FileHandling();
        fileio.setOutputStream(choice);
        
      }
      catch(FileNotFoundException e){
          System.out.println("Does not exsist");
      }
      catch(IOException e){
          System.out.println("does not print");
      }

      
    }
    @FXML
    private Tab Bagel;

    @FXML
    private RadioButton none;

    @FXML
    private RadioButton white;

    @FXML
    private RadioButton wholeWheat;

    @FXML
    private TextField whiteQty;

    @FXML
    private TextField wwQty;

    @FXML
    private VBox hiddenPane;
    
    @FXML
    private CheckBox check1;
    @FXML
    private CheckBox check2;
    @FXML
    private CheckBox check3;
    @FXML
    private CheckBox check4;
    @FXML
    private CheckBox check5;

    @FXML
    private Tab Drinks;

    @FXML
    private RadioButton soda;

    @FXML
    private RadioButton tea;

    @FXML
    private RadioButton coffee;

    @FXML
    private TextField sodaQty;

    @FXML
    private TextField teaQty;

    @FXML
    private TextField coffeeQty;

    @FXML
    private Tab Result;

    @FXML
    private TextArea reciept;

    @FXML
    private Button submit;
    
    private void cost(){
        double total=whiteBagel*Integer.parseInt(whiteQty.getText())+wwBagel*Integer.parseInt(wwQty.getText())+sodaPrice*Integer.parseInt(sodaQty.getText());
    }
    
    @FXML
            /**
             * queues a printed copy of receipt to Printer 
             */
    void submit(ActionEvent e)throws IOException{
        File file = new File("data.txt");

            boolean fvar = file.createNewFile();
            if (fvar){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println(file.getAbsoluteFile());
            }
           
        
    }

    @FXML
    private Button reset;
    @FXML
            /**
             * resets all fields
             */
    void reset(ActionEvent event){
        none.setSelected(true);
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        
        sodaQty.setText("");        
        teaQty.setText("");
        coffeeQty.setText("");
        wwQty.setText("");
        whiteQty.setText("");

    }

    @FXML
            /**
             * closes the program
             */
    void closeExit(ActionEvent event) {
        System.exit(0);

    }

       @FXML
            /**
             * sets default of the application to None
             */
    void sendNone(ActionEvent event) {
        hiddenPane.setDisable(true);
    }
       @FXML
            /**
             * sends the values entered to the file
             */
    void sendWW(ActionEvent event) {
        Pattern p = Pattern.compile("");
        hiddenPane.setDisable(false);

        whiteQty.setText("");

        String qty=wwQty.getText();
        if(qty.equals("")){
            
        }
        else
        sendFile(oWW());

    }

    /**
     * Prints output into reciept
     * @return 
     */
    private String oWW(){
        String s1="Whole Wheat\t" + wwQty.getText() + "\t" + wwBagel + "\n";
        reciept.setText(s1);
        return s1;
    } 
    
    
    @FXML
            /**
             * sends the values entered to the file
             */
    void sendWhite(ActionEvent event){
        hiddenPane.setDisable(false);
        wwQty.setText("");

   
        if(white.isSelected())
        sendFile(oW());

    }
    
    /**
     * Prints output into reciept
     * @return 
     */
    private String oW(){
        String s1="White\t" + whiteQty.getText() + "\t" + whiteBagel;  
        reciept.setText(s1);
        return s1;
    }
    
    @FXML
            /**
             * sends the values entered to the file
             */
    void sendCoffee(ActionEvent event)throws FileNotFoundException, IOException{
       teaQty.setText("");
       sodaQty.setText("");
        sendFile(oCoffee());
        
    }

    private String oCoffee(){
        String s1="Coffee\t" + coffeeQty.getText() + "\t" + coffeePrice;  
        reciept.setText(s1);
        return s1;
        
    }
   

    @FXML
    void sendSoda(ActionEvent event) throws FileNotFoundException, IOException{
        teaQty.setText("");
       coffeeQty.setText("");
      
        sendFile(oSoda());

    }
    


    /**
     * Prints output into reciept
     * @return 
     */
    private String oSoda(){
         String s1="Soda\t" + sodaQty.getText() + "\t" + sodaPrice;
        reciept.setText(s1);
        return s1;
       
    }

    @FXML
            /**
             * sends the values entered to the file
             */
    void sendTea(ActionEvent event)throws FileNotFoundException, IOException {
        coffeeQty.setText("");
       sodaQty.setText("");
        sendFile(oTea());

    }

    /**
     * Prints output into reciept
     * @return 
     */
    private String oTea(){
        String s1="Tea\t" + teaQty.getText() + "\t" + teaPrice;
        reciept.setText(s1);
        return s1;
        
    }
    /**
     * Any check box selected will be added to the total value of the transaction
     * @return 
     */
    @FXML
    void checkToppings(){
        double value =0;
        
       if(check1.isSelected()){
           try{
           fileio.setOutputStream(" Starfruit\t\t" + topping1);
           value+=topping1;
           fileio.setOutputStream(value + "");
           }
           catch(IOException e){
               System.out.println("Invalid");
           }
       }
       if(check2.isSelected()){
           try{
           fileio.setOutputStream(" Starfish\t\t" + topping2);
           value+=topping2;
           fileio.setOutputStream(value + "");
           }
           catch(IOException e){
               System.out.println("Invalid");
           }
       }
       if(check3.isSelected()){
          try{
           fileio.setOutputStream(" Jellybeans\t\t" + topping3);
           value+=topping3;
           fileio.setOutputStream(value + "");
           }
           catch(IOException e){
               System.out.println("Invalid");
           }

       }
       if(check4.isSelected()){
           try{
           fileio.setOutputStream(" Oranges\t\t" + topping4);
           value+=topping4;
           fileio.setOutputStream(value + "");
           }
           catch(IOException e){
              System.out.println("Invalid"); 
           }
   
       }
       if(check5.isSelected()){
          try{
           fileio.setOutputStream(" Pizza\t\t" + topping5);
           value+=topping5;
           fileio.setOutputStream(value + "");
           }
           catch(IOException e){
               System.out.println("Invalid");
           }
          
           
       }
        
    
    }
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  

}
