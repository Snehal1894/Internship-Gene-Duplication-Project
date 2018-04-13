/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orfformat;

import java.io.*;

/**
 *
 * @author Snehal
 */
public class Orfformat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String l1,l2;
        String tf="",gene="",line="";
        int cnt=0;
        
        FileWriter fw = new FileWriter("J:\\IMSc\\Agos\\Ourorffimo.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        //FileReader fr = new FileReader("J:\\IMSc\\Agos\\Tfs\\Combotf.txt");
        //BufferedReader br = new BufferedReader(fr); 
        
         //FileReader fr = new FileReader("J:\\IMSc\\Agos\\output\\yagt_05.csv");
        //BufferedReader br = new BufferedReader(fr); 
        
        FileReader fr = new FileReader("J:\\IMSc\\Agos\\output\\fimoytf.csv");
        BufferedReader br = new BufferedReader(fr);
        
        FileReader fr1 = new FileReader("J:\\IMSc\\Agos\\orf.txt");
        BufferedReader br1 = new BufferedReader(fr1); 
        
        //for combotf
       /* while((l1=br.readLine())!=null)
        {
            String[] x = l1.split(" ");
            gene=gene+x[0]+" ";
            for(int i=1;i<x.length;i++)
            {
                if(!(tf.contains(x[i])))
                {
                    tf=tf+x[i]+" ";
                }
            }
            
        }*/
        
        
        while((l1=br.readLine())!=null)
        {
            String[] x = l1.split(",");
            if(!gene.contains(x[0]))
                gene=gene+x[0]+" ";
            //for yagt files
            //if(!tf.contains(x[2]))
                //tf=tf+x[2]+" ";
            //for fimo files
            if(!tf.contains(x[1]))
                tf=tf+x[1]+" ";
        }
        
        while((l2=br1.readLine())!=null)
        {
            line="";
            cnt=0;
            String[] x = l2.split(" ");
            if(tf.contains(x[0]))
            {
                for(int i=1;i<x.length;i++)
                {
                    if(gene.contains(x[i]))
                    {
                        line=line+x[i]+" ";
                        cnt++;
                    }
                }
                System.out.println(x[0]+" "+line+" "+cnt);
                bw.write(x[0]+" "+line+" "+cnt+"\n");
            }
            
            
        }
        bw.close();
    }
    
}
