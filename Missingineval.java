/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingineval;
import java.io.*;
import java.util.*;
/**
 *
 * @author Snehal
 */
public class Missingineval{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String line="";
        String orf[]=new String [1373];
        int cnt=0,ctr=0;
        boolean flag=false;
        FileReader fr=new FileReader("C:\\Users\\Snehal\\Downloads\\evalvsorf.csv");
        BufferedReader br=new BufferedReader(fr);
        
        while((line=br.readLine())!=null)
        {
            String a[]=line.split(",");
            orf[cnt]=a[0];
            cnt++;
        }
       
        
        for(int i=0;i<1373;i++)
        {
            
            flag=false;
            fr=new FileReader("C:\\Users\\Snehal\\Downloads\\evalvsorf.csv");
            br=new BufferedReader(fr);
            while((line=br.readLine())!=null)
            {
                
                String b[]=line.split(",");
                //String temp=b[1];
                if(b.length==2)
                {
                    if(b[1].contains(orf[i]))
                    {   
                        System.out.println(b[1]);
                        flag=true;
                        ctr++;
                    }   
                }
           }
            //if(flag==false)
            //System.out.println(orf[i]);
                    
               
        }
        System.out.println(ctr);
        
        
    }
    
}
