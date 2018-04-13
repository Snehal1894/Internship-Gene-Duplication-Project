/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalopformat;

import java.io.*;

/**
 *
 * @author Snehal
 */
public class Finalopformat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String l1="",l2="",tf="";
        FileReader fr1 = new FileReader("J:\\Agostf.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        FileWriter fw = new FileWriter("J:\\Agosotp2.csv");
        BufferedWriter bw =  new BufferedWriter(fw);
        
        FileReader fr2;
        BufferedReader br2;
        
        while((l1=br1.readLine())!=null)
        {
            String[] t = l1.split(" ");
            String x;
            if(t.length>2)
            {    
               tf = "tf"+","; 
               for(int i=2;i<t.length;i++)
               {  
                 x = t[0]+","+t[1]+","; 
                 //x = t[0]+",";  
                  x = x+t[i];
                  fr2= new FileReader("J:\\Reqagos1.csv");
                  br2=new BufferedReader(fr2);
                  while((l2=br2.readLine())!=null)
                  {
                     String[] y = l2.split(",");
                    if(l2.contains(x)&&(!tf.contains(y[2])))
                       tf=tf+y[2]+","; 
                  }
               }  
               bw.write(l1+","+tf+"\n");
            }
            else
                bw.write(l1+"\n");
            
        }
        bw.close();
    }
    
}
