/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemast;

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
public class Filemast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        int cnt=0;
        FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\klacfasta.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        String y="",line;
        FileReader fr1 = new FileReader("J:\\Agos\\Start all over\\Combotf.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        while((line=br1.readLine())!=null)
        {
            y = y+line.split(" ")[0]+" ";
        }
        //System.out.println(y);
        
        FileReader fr2 = new FileReader("J:\\Agos\\Start all over\\Common\\klaccommon.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        
        while((line=br2.readLine())!=null)
        {
            String[] t = line.split(" ");
            if(y.contains(t[1])||y.contains(t[2]))
            {
                bw.write(line+"\n");
                cnt++;
            }
            
        }
        System.out.println(cnt);
        bw.close();
    }
    
}
