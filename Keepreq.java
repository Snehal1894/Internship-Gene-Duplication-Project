/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keepreq;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Snehal
 */
public class Keepreq {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       String l3="";
        int cnt=0;
        String tf[]=new String[26];
        FileReader fr = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Klac\\Klactf1.txt");
        BufferedReader br = new BufferedReader(fr);
        
        FileReader fr1 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\evalchck.csv");
        BufferedReader br1 = new BufferedReader(fr1);
        while((l3=br1.readLine())!=null)
            tf[cnt++]=l3.split(",")[0];
          //System.out.println(tf);  
        
        FileWriter fw = new FileWriter("C:\\Users\\Snehal\\Desktop\\GD\\Klac\\KLactfsub1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        //bw.write(br.readLine()+"\n");
        boolean flag=false;
        //while((l1=br.readLine())!=null)
        for(int f=0;f<680;f=f+2)
        {
            String l1 =br.readLine();
            String l2=br.readLine();
            String r1[]=l1.split(" ");
            String r2[]=l2.split(" ");
            
           /* int len=15;
            if(r.length<len)
               len=r.length;*/
            
           for(int i=2;i<r1.length;i++)
            {
                flag=false;
                //if(r[i]!=null)
                //{
                    //System.out.println("in if");
                    for(int j=0;j<tf.length;j++)
                    {
                       if(r1[i].equals(tf[j]))
                       {
                           flag=true; 
                           //System.out.println(r[i]+" "+tf[j]);
                       }
                        
                    }
                    if(flag==false)
                        l1=l1.replaceAll(r1[i]+" ","");
                    
                //}
                
            }
           
           for(int i=2;i<r2.length;i++)
            {
                flag=false;
                //if(r[i]!=null)
                //{
                    //System.out.println("in if");
                    for(int j=0;j<tf.length;j++)
                    {
                       if(r2[i].equals(tf[j]))
                       {
                           flag=true; 
                           //System.out.println(r[i]+" "+tf[j]);
                       }
                        
                    }
                    if(flag==false)
                        l2=l2.replaceAll(r2[i]+" ","");
                    
                //}
                
            }
            //System.out.println(l1);
            //System.out.println(l2);
            if((l1.split(" ").length>2)||(l2.split(" ").length>2))
                bw.write(l1+"\n"+l2+"\n");
            //bw.write(l1+"\n");   
        }
        bw.close();
    }
   
}
