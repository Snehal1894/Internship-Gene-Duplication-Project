/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upstream;

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
public class Upstream {
    static String ck;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line="";
       String gene[]=new String[11500];
       int start[]=new int[11500];
       int end[]=new int[11500];
       int cnt=0;
        FileReader fr1=new FileReader("J:\\IMSc\\Kwal\\kwalup.csv");
        BufferedReader br1=new BufferedReader(fr1);
        while((line=br1.readLine())!=null)
        {
            String a[]=line.split(",");
            gene[cnt]=a[0];
            start[cnt]=Integer.parseInt(a[1]);
            end[cnt]=Integer.parseInt(a[2]);
            //System.out.println(gene[cnt]);
            cnt++;
        }
        ck = "";
        int gt=0;
        FileReader fr=new FileReader("J:\\IMSc\\Kwal\\Kwal.txt");
        BufferedReader br=new BufferedReader(fr);
        while((line=br.readLine())!=null)
        {
            String[]d = line.split(" ");
            ck= ck+d[0]+" ";
            gt++;
           
        }
        //System.out.println(ck.split(" ").length);
        
        String line1="";
        line="";
        FileReader fr2=new FileReader("J:\\IMSc\\Kwal\\kwal1.fasta");
        BufferedReader br2=new BufferedReader(fr2);
        //int gt=0;
        while((line1=br2.readLine())!=null)
        {    
            //System.out.println(++gt);
            line=line+line1;
        }
        //System.out.println(line);
        //line = "0123456789";
       
        //System.out.println(temp);
        //System.out.println(temp.length());
        //System.out.println(line.length());
        int counter=0;
        
        for(int i=1;i<cnt;i++)
        {
            //System.out.println(ck.contains(gene[i]));
            //System.out.println(gene[i].split("\\.")[0]+" "+gene[i-1].split("\\.")[0]);
            String y1 =gene[i].split("_")[0];
            String y2=gene[i-1].split("_")[0];
            if(containskwal(gene[i]))
            {    
              
               if(y1.equals(y2))
               {
                   System.out.println(gene[i]);
                   counter++;
                //System.out.println("true");
                int st=end[i-1];
                int en=start[i];
                //System.out.println(st+" "+l);
                int x = en-st;
                if((x<200))
                    st = end[i-1]-(500-x);
           
                
               
                String name=gene[i]+".fasta";
                FileWriter fw=new FileWriter("J:\\IMSc\\Kwal\\new2\\"+name);
                BufferedWriter bw=new BufferedWriter(fw);
                try
                {  
                bw.write(">"+"\n");
                bw.write(line.substring(st,en-1));
                //System.out.println(st+":"+l+":"+gene[i]);
                }
                catch(Exception e)
                {
                    System.out.println(st+":"+en+":"+e.getMessage()+" "+gene[i]);
                
                }
                bw.close();   
               }
               else
               {
              
                System.out.println(gene[i]);
                counter++;
                int en=start[i];
                int st=0;
                if(en>500)
                st = en-500;
                if((en-st)>499)
                {    
                    
                    String name=gene[0]+".fasta";
                    FileWriter fw=new FileWriter("J:\\IMSc\\Kwal\\new2\\"+name);
                    BufferedWriter bw=new BufferedWriter(fw);
                    try
                    {  
                        bw.write(">"+"\n");
                        bw.write(line.substring(st,en-1));
                        //System.out.println(st+":"+l+":"+gene[i]);
                    }
                    catch(Exception e)
                    {
                        System.out.println(st+":"+en+":"+e.getMessage()+" "+gene[0]);
                
                    }
                    bw.close();   
                }  
                }
            
           } 
           
        }
       if(containskwal(gene[0]))
        {    
         
           System.out.println(gene[0]);
            counter++;
            int en=start[0];
            int st=0;
            if(en>500)
              st = en-500;
            if((en-st)>499)
            {     
                
                String name=gene[0]+".fasta";
                FileWriter fw=new FileWriter("J:\\IMSc\\Kwal\\new2\\"+name);
                BufferedWriter bw=new BufferedWriter(fw);
                try
                {  
                    bw.write(">"+"\n");
                    bw.write(line.substring(st,en-1));
                    //System.out.println(st+":"+l+":"+gene[i]);
                }
                catch(Exception e)
                {
                    System.out.println(st+":"+en+":"+e.getMessage()+" "+gene[0]);
                
                }
                bw.close();   
              }
            }
            System.out.println(ck);
            System.out.println(counter);
                   
        }
    
    public static boolean containskwal(String g)
    {
        boolean b = false;
        String[] ge = ck.split(" ");
         for(int i=0;i<ge.length;i++)
         {
           if(g.equals(ge[i])) 
           {   
               b=true;
               ck=ck.replaceAll(g+" ", "");
           }   
         }
         return b;
    }
    
}
