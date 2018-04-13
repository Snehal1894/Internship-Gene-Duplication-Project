/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Snehal
 */
public class Tp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
       int ctr=0,tp=0;
       
       FileWriter fw = new FileWriter("J:\\Agos\\Start all over14june\\Common\\common.csv");
       BufferedWriter bw = new BufferedWriter(fw);
       
        FileReader fr1 = new FileReader("J:\\Agos\\Start all over14june\\Common\\agoscommon.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        while(br1.readLine()!=null)
          cnt1++;
        System.out.println(cnt1);
        
        FileReader fr2 = new FileReader("J:\\Agos\\Start all over14june\\Common\\klaccommon.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        while(br2.readLine()!=null)
          cnt2++;
        System.out.println(cnt2);
        
        FileReader fr3 = new FileReader("J:\\Agos\\Start all over14june\\Common\\kwalcommon.txt");
        BufferedReader br3 = new BufferedReader(fr3);
        while(br3.readLine()!=null)
          cnt3++;
        System.out.println(cnt3);
        
        FileReader fr4 = new FileReader("J:\\Agos\\Start all over14june\\Common\\sklucommon.txt");
        BufferedReader br4 = new BufferedReader(fr4);
        while(br4.readLine()!=null)
          cnt4++;
        System.out.println(cnt4);
        
        
        fr3 = new FileReader("J:\\Agos\\Start all over14june\\Common\\kwalcommon.txt");
        br3 = new BufferedReader(fr3);
        String line;
        String u="";
        while((line=br3.readLine())!=null)
        {
            ctr=0;
            u="";
            String[] x = line.split(" ");
            String ck=x[1]+" "+x[2];
            //System.out.println(ck);
            
            fr1 = new FileReader("J:\\Agos\\Start all over14june\\Common\\agoscommon.txt");
            br1 = new BufferedReader(fr1);
            for(int i=0;i<cnt1;i++)
            {
                String g = br1.readLine();
                if(g.contains(ck))
                {    
                    u=u+g.split(" ")[0]+" ";
                    ctr++;
                    break;
                }   
            }
            
           fr2 = new FileReader("J:\\Agos\\Start all over14june\\Common\\klaccommon.txt");
           br2 = new BufferedReader(fr2);
           for(int i=0;i<cnt2;i++)
            {
                String g = br2.readLine();
                if(g.contains(ck))
                {    
                    u=u+g.split(" ")[0]+" ";
                    ctr++;
                    break;
                }    
            }
           
           fr4 = new FileReader("J:\\Agos\\Start all over14june\\Common\\sklucommon.txt");
           br4 = new BufferedReader(fr4);
           for(int i=0;i<cnt4;i++)
            {
                String g = br4.readLine();
                if(g.contains(ck))
                {  
                    u=u+g.split(" ")[0]+" ";
                    ctr++;
                    break;
                }    
            }
        if(ctr==3)
        {    
            tp++;
            u=ck+" "+x[0]+" "+u;
            System.out.println(u);
            bw.write(u+"\n");
        }   
        }
        System.out.println(tp);
        bw.close();
    }
    
}
