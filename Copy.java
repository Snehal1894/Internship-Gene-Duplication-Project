/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copy;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Snehal
 */
public class Copy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String s="",Line;
      
    FileReader fr1 = new FileReader("J:\\IMSc\\Agos\\output\\OnlyY.csv");
    BufferedReader br1 = new BufferedReader(fr1);    
    
    while((Line=br1.readLine())!=null)
            s = s + Line + ".fasta"+" ";
        System.out.println(s.split(" ").length);   
    File destinationFolder = new File("J:\\utr874");
    File sourceFolder = new File("J:\\utr1000");

    
        // Get list of the files and iterate over them
     File[] listOfFiles = sourceFolder.listFiles();
     if (listOfFiles != null)
     {
         for (File child : listOfFiles )
            {
               if(s.contains(child.getName()))
             // Move files to destination folder
               { 
                   child.renameTo(new File(destinationFolder + "\\" + child.getName()));
                   //s.replaceAll(child.getName(),"");
               }
               }
            }

          //System.out.println(s);  
      }
    
    
        
        
        
    }
    

