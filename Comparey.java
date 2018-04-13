/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparey;
import java.io.*;
/**
 *
 * @author Snehal
 */
public class Comparey {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        String line1="",line2="";
        FileReader fr1=new FileReader("J:\\ymastwithagos.csv");
        BufferedReader br1 = new BufferedReader(fr1);
        
        FileWriter fw = new FileWriter("J:\\july03\\yklacop.csv");
        BufferedWriter bw =  new BufferedWriter(fw);
        
        while((line1=br1.readLine())!=null)
        {
            String temp[]=line1.split(",");
            if(temp.length>=2)
            {
                String l=temp[1]+",";
                String y=line1+",tf";
                for(int i=2;i<temp.length;i++)
                {
                    l=l+temp[i]+",";
                    String tf[]=l.split(",");
                    //System.out.println(temp[1]+" "+temp[i]);
                    if(tf.length>2)
                    {
                        FileReader fr2=new FileReader("J:\\Reqklac.csv");
                        BufferedReader br2 = new BufferedReader(fr2);
                        while((line2=br2.readLine())!=null)
                        {
                            String p[]=line2.split(",");
                            if(p[1].equals(temp[1]) && p[2].equals(temp[i]))
                            {
                                //System.out.println(line2);
                                y=y+","+tf[2];
                            }
                        }
                    }
                }
                System.out.println(y);
                bw.write(y+"\n");
            }
        }
        bw.close();
    }
    
}
