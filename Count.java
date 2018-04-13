/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count;
import java.io.*;
/**
 *
 * @author Snehal
 */
public class Count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String line="";
        
        FileWriter fw=new FileWriter("C:\\Users\\Snehal\\Desktop\\GD\\countofall2.csv");
        BufferedWriter bw=new BufferedWriter(fw);
        
        FileReader fr=new FileReader("C:\\Users\\Snehal\\Desktop\\GD\\final2.csv");
        BufferedReader br=new BufferedReader(fr);
        while((line=br.readLine())!=null)
        {
            String prtn="";
            String tf[]=line.split(",");
            for(int i=2;i<5;i++)
            {
                boolean f1=false,f2=false,f3=false,f4=false,f5=false,f6=false;
                
                if(!tf[i].equals(""))
                {
                    prtn=tf[0]+" "+tf[i]+" ";
                    for(int j=6;j<10;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f1=true;
                    }
                    if(f1==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                    
                   ////////////////
                    
                    for(int j=11;j<14;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f2=true;
                    }
                    if(f2==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                    //////////////
                    
                    for(int j=16;j<19;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f3=true;
                    }
                    if(f3==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                    
                    //////////////////
                    for(int j=21;j<24;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f4=true;
                    }
                    if(f4==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                    /////////////////
                    for(int j=26;j<28;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f5=true;
                    }
                    if(f5==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                    /////////////////
                    for(int j=30;j<tf.length;j++)
                    {
                        if(tf[i].equals(tf[j]))
                            f6=true;
                    }
                    if(f6==true)
                        prtn=prtn+"yes ";
                    else
                        prtn=prtn+"no ";
                }
                System.out.println(prtn);
                if(!prtn.equals(""))
                    bw.write(prtn+"\n");
            }
        }
        bw.close();
    }
    
}
