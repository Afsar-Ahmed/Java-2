/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Afsar Ahmed
 */
public class FileHandling {
    
    private FileInputStream fin;
    private FileOutputStream fio;
    
    File file = new File("data.txt");
    public FileHandling(){
        
        
    }
    /**
     * reads data from file and outputs to console
     */
    public void setInputStream() {
        
        int  fileSize  = (int)file.length();
        byte[ ] byteArray = new byte[fileSize];
        
        try{
      fin.read(byteArray);

      for (int i = 0; i < fileSize; i++)
      {
         System.out.println(byteArray[i]);
      }
      fin.close();
        }
        catch(IOException e){
            
        }
    }
    /**
     * writes string to file
     * @param string the name, quantity, and cost of product
     * @throws IOException 
     */
    public void setOutputStream(String string) throws IOException{
        
       
        fio = new FileOutputStream(file);
        byte[] line=string.getBytes();
        fio.write(line);
        fio.close();
    }

    /**
     * checks if the file exsists
     * @return 
     */
    boolean createNewFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

}
