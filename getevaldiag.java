/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summertemp;

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
public class Summertemp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line2;
        int cnt=0;
        FileReader fr2=new FileReader("J:\\Agos\\15june\\yamast.csv");
        BufferedReader br2=new BufferedReader(fr2);
        
        FileWriter fw=new FileWriter("J:\\Agos\\15june\\yagt.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        while((line2=br2.readLine())!=null)
            {
                String s[]=line2.split(",");
                double x = Double.parseDouble(s[5]);
                //System.out.println(x+" "+s[6]);
                if((x<0.05)&&(s[6].contains("_")))
                {
                    System.out.println(line2);
                    bw.write(line2+"\n");
                    cnt++;
                } 
                
            }
        System.out.println(cnt);
        bw.close();
    }
    
}
