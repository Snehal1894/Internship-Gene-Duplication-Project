package Countgene;
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
//import java.uitl.*;

/**
 *
 * @author Snehal
 */
public class Countgene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String l1="",l2="";
        int c=0;
        String tf[]=new String[103];
        int unb[]=new int[103];
        int b[]=new int[103];
        
        FileReader fr1=new FileReader("J:\\IMSc\\Agos\\onlytf.txt");
        BufferedReader br1=new BufferedReader(fr1);
        for(int i=0;i<103;i++)
        {
            unb[i]=0;
            b[i]=0;
        }
        while((l1=br1.readLine())!=null)
        {
            String a[]=l1.split(" ");
            tf[c]=a[0];
            //System.out.println(tf[c]);
            c++;
            
        }
        
        for(int i=0;i<103;i++)
        {
            FileReader fr=new FileReader("J:\\IMSc\\Agos\\combomastnew.csv");
            BufferedReader br=new BufferedReader(fr);
            while((l2=br.readLine())!=null)
            {
                String d[]=l2.split(",");
                String temp=d[6];
                if(l2.contains(tf[i]))
                {  unb[i]++;
                   if(temp.contains("["))
                        b[i]++;
                }
            }
        }
        for(int i=0;i<103;i++)
        {
            System.out.println(tf[i]+" "+unb[i]+" "+b[i]);
        }
        
    }
    
}
