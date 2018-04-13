/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package display;

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
public class Display {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line=null;
        String orf[]=new String[102];
        String col2[]=new String[102];
        int cnt=0;
        
        FileReader fr1=new FileReader("J:\\IMSc\\Agos\\Compare1.csv");
        BufferedReader br1=new BufferedReader(fr1);
        while((line=br1.readLine())!=null)
        {
            String a[]=line.split(",");
            orf[cnt]=a[0];
            col2[cnt]=a[1];
            cnt++;
         }
        System.out.println(cnt);

        for(int i=0;i<102;i++)
        {
            fr1=new FileReader("J:\\IMSc\\Agos\\Compare1.csv");
            br1=new BufferedReader(fr1);
            while((line=br1.readLine())!=null)
            {
                String b[]=line.split(",");
                //System.out.println(b.length);
                if(b.length>=3)
                {
                     //System.out.println(b.length);
                    if(orf[i].equals(b[3]))
                        System.out.println(orf[i]+" "+col2[i]+" "+b[3]+" "+b[4]);
                }
                
            }
        }
        
    }
    
}