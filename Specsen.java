/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specsen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Snehal
 */
public class Specsen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String l1="",l2="",l="";
        
        FileReader fr=new FileReader("J:\\IMSc\\Agos\\onlytf.txt");
        BufferedReader br=new BufferedReader(fr);
        while((l=br.readLine())!=null)
        {
            String fact=l;
        
        
        FileWriter fw = new FileWriter("J:\\"+fact+".csv");
        BufferedWriter bw = new BufferedWriter(fw);
         bw.write("Eval,TP,FN,TN,FP,spec,sen,1-spec"+"\n");
        
      for(double i=1;i>0.2;i=i-0.1)  
      {     
        double tn=0,fn=0,tp=0,fp=0;
        FileReader fr1=new FileReader("J:\\harinicomplement.csv");
        BufferedReader br1=new BufferedReader(fr1);
        while((l1=br1.readLine())!=null)
        {
            if(l1.contains(fact))
            {     
            String[] t = l1.split(",");
            double eval = Double.parseDouble(t[5]);
            if((eval<=i))
              //cnt++;
                fp++;
            else
                tn++;
            }
        }  
        //tn=cnt-fp;
        //cnt=0;
        FileReader fr2=new FileReader("J:\\Hariniveragos.csv");
        BufferedReader br2=new BufferedReader(fr2);
        while((l2=br2.readLine())!=null)
        {
            if(l2.contains(fact))
            {    
            String[] t = l2.split(",");
            double eval = Double.parseDouble(t[5]);
            if((eval<=i))
               tp++;
            
            else 
                fn++;
            } 
           }
      
        //fn=cnt-tp;
        double spec=tn/(tn+fp);
        double sen=tp/(tp+fn);
        double rspec=1-spec;
        //System.out.println("TP:"+tp+" FN "+fn+" TN "+tn+" FP "+fp);
        bw.write(i+","+tp+","+fn+","+tn+","+fp+","+spec+","+sen+","+rspec+"\n");
      }
      for(double i=0.2;i>0;i=i-0.01)  
      {     
        double tn=0,fn=0,tp=0,fp=0;
        FileReader fr1=new FileReader("J:\\harinicomplement.csv");
        BufferedReader br1=new BufferedReader(fr1);
        while((l1=br1.readLine())!=null)
        {
            if(l1.contains(fact))
            {     
            String[] t = l1.split(",");
            double eval = Double.parseDouble(t[5]);
            if((eval<=i))
            {
               fp++;
            }
            else 
                tn++;
            
            }
        }
        //tn=cnt-fp;
        //cnt=0;
         FileReader fr2=new FileReader("J:\\Hariniveragos.csv");
        BufferedReader br2=new BufferedReader(fr2);
        while((l2=br2.readLine())!=null)
        {
            if(l2.contains(fact))
            {    
            String[] t = l2.split(",");
            double eval = Double.parseDouble(t[5]);
            if((eval<=i))
            {
               tp++;
            }
            else 
                fn++;
            }
        }
        //fn=cnt-tp;
        double spec=tn/(tn+fp);
        double sen=tp/(tp+fn);
        double rspec=1-spec;
        System.out.println("TP:"+tp+" FN "+fn+" TN "+tn+" FP "+fp);
        bw.write(i+","+tp+","+fn+","+tn+","+fp+","+spec+","+sen+","+rspec+"\n");
      }
      
          bw.close();
    }
   }
    
}
