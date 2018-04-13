/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfactorcount;
import java.io.*;
/**
 *
 * @author Snehal
 */
public class Perfactorcount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        String l1="",l2="";
        FileReader fr1=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\alleval.csv");
        BufferedReader br1=new BufferedReader(fr1);
        while((l1=br1.readLine())!=null)
        {
            String tf[]=l1.split(",");
            int y=0,klac=0,kwal=0,sklu=0,agos=0;
            String prtn=tf[0]+" ";
            
            FileReader fr2=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\Reqagos.csv");
            BufferedReader br2=new BufferedReader(fr2);
            while((l2=br2.readLine())!=null)
            {
                if(l2.contains(tf[0]))
                    agos++;
            }
            
            FileReader fr3=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\Reqklac.csv");
            BufferedReader br3=new BufferedReader(fr3);
            while((l2=br3.readLine())!=null)
            {
                if(l2.contains(tf[0]))
                    klac++;
            }
            
            FileReader fr4=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\Reqkwal.csv");
            BufferedReader br4=new BufferedReader(fr4);
            while((l2=br4.readLine())!=null)
            {
                if(l2.contains(tf[0]))
                    kwal++;
            }
            
            FileReader fr5=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\Reqsklu.csv");
            BufferedReader br5=new BufferedReader(fr5);
            while((l2=br5.readLine())!=null)
            {
                if(l2.contains(tf[0]))
                    sklu++;
            }
            
            FileReader fr6=new FileReader("C:\\Users\\Snehal\\Desktop\\P\\Reqyamast.csv");
            BufferedReader br6=new BufferedReader(fr6);
            while((l2=br6.readLine())!=null)
            {
                if(l2.contains(tf[0]))
                    y++;
            }
            System.out.println(prtn+" "+y+" "+agos+" "+klac+" "+kwal+" "+sklu);
        }
        
    }
    
}
