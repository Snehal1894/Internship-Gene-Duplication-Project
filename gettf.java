/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Snehal
 */
public class GD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line1,line2;
        FileReader fr1 = new FileReader("J:\\Agos\\Start all over\\Common\\agoscommon.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        FileReader fr2 ;
        BufferedReader br2;
        
        FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\agostf.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String tf = "";
        while((line1=br1.readLine())!=null)
        {
            //System.out.println(line1); 
            String[] t = line1.split(" ");
            
            for(int i=0;i<2;i++)
            {
                String x= t[i+1];
                //System.out.println(x);
                tf="";
                fr2 = new FileReader("J:\\Agos\\Start all over\\orf.txt");
                br2 = new BufferedReader(fr2);
                while((line2=br2.readLine())!=null)
                {
                    //System.out.println(line2);
                    if(line2.contains(x))
                    {
                        String[] g = line2.split(" ");
                        //System.out.println(g[0]+" "+x);
                        tf = tf+g[0]+" ";
                    }
                }
                if(!tf.equals(""))
                {    
                 System.out.println(x+" "+tf+" ");
                 bw.write(x+" "+tf+" "+"\n");
                }
            }
            //System.out.println("HELLO");
        }
        bw.close();
    }
    
}
