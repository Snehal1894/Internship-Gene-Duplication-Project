/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpredict;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Snehal
 */
public class Newpredict {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String ln1="",ln2="",ln3="",ln4="";
        FileReader fr1 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Agos\\Agostfsub.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        for(int i=0;i<412;i=i+2)
        {
            String pk1="pd"+",";
            String pk2="pd"+",";
            String ag1="ag"+",";
            //String ag2="ag"+",";
            String or1="org"+",";
            String or2="org"+",";
            String l1=br1.readLine();
            String l2= br1.readLine();
            String[] t1 = l1.split(" ");
            String[] t2 = l2.split(" ");
            
            //check in yamast
             for(int j=2;j<t1.length;j++)
             {
                 String x1 = t1[1]+","+t1[j];
                 String x2 = t1[0]+","+t1[j];
                 FileReader fr4 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Reqyamast.csv");
                 BufferedReader br4 = new BufferedReader(fr4);
                 while((ln4=br4.readLine())!=null)
                 {
                     if(ln4.contains(x1))
                           pk1=pk1+t1[j]+",";
                 }
                 FileReader fr2 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Agos\\Reqagos.csv");
                 BufferedReader br2 = new BufferedReader(fr2);
                 while((ln2=br2.readLine())!=null)
                 {
                     if(ln2.contains(x2))
                         if(!ag1.contains(t1[j]))
                           ag1=ag1+t1[j]+",";
                 }
             }
             
             for(int j=2;j<t2.length;j++)
             {
                 String x1 = t2[1]+","+t2[j];
                 String x2 = t2[0]+","+t2[j];
                 FileReader fr4 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Reqyamast.csv");
                 BufferedReader br4 = new BufferedReader(fr4);
                 while((ln4=br4.readLine())!=null)
                 {
                     if(ln4.contains(x1))
                           pk2=pk2+t2[j]+",";
                 }
                 FileReader fr2 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Agos\\Reqagos.csv");
                 BufferedReader br2 = new BufferedReader(fr2);
                 while((ln2=br2.readLine())!=null)
                 {
                     if(ln2.contains(x2))
                         if(!ag1.contains(t2[j]))
                           ag1=ag1+t2[j]+",";
                 }
             }
             
             //check for complement
             for(int j=2;j<t1.length;j++)
             {
                if(!l2.contains(t1[j]))
                 {
                    String ck = t2[1]+","+t1[j];
                    FileReader fr3 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Reqcomplementymast.csv");
                    BufferedReader br3 = new BufferedReader(fr3);
                    while((ln3=br3.readLine())!=null)
                    {
                        if(ln3.contains(ck))
                           pk2=pk2+t1[j]+",";
                    }
                }
             }
             
             for(int k=2;k<t2.length;k++)
             {
               if(!l1.contains(t2[k]))
               {
                   String ck = t1[1]+","+t2[k];
                   FileReader fr3 = new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\Reqcomplementymast.csv");
                   BufferedReader br3 = new BufferedReader(fr3);
                   while((ln3=br3.readLine())!=null)
                   {
                       if(ln3.contains(ck))
                           pk1=pk1+t2[k]+",";
                   }
               }
             }
             
             for(int r=2;r<t1.length;r++)
                 or1=or1+t1[r]+",";
             for(int r=2;r<t2.length;r++)
                 or2=or2+t2[r]+",";
             
              //System.out.println(l1+"+"+pk1+"+"+ag1);
              
              System.out.println(t1[1]+"-"+or1+"-"+pk1+"+"+t2[1]+"-"+or2+"-"+pk2+"+"+t1[0]+","+ag1);
              //System.out.println(t1[0]+","+ag1);
           
        }
        
        
    }
    
}
