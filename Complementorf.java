/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complementorf;


import java.io.*;

/**
 *
 * @author Snehal
 */
public class Complementorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String s = "", Line;
        int cnt=0;
        FileReader fr = new FileReader("J:\\IMSc\\Agos\\ourorfnew.txt");
        BufferedReader br = new BufferedReader(fr);
        FileReader fr1 = new FileReader("J:\\IMSc\\Agos\\output\\OnlyY.csv");
        BufferedReader br1 = new BufferedReader(fr1);
        FileWriter fw = new FileWriter("J:\\IMSc\\Agos\\comporfnew.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        
        while((Line=br1.readLine())!=null)
            s = s + Line + " ";
        
       String[]y = s.split(" ");
        while((Line=br.readLine())!=null) 
        {
            cnt=0;
            String t[] = Line.split(" ");
            String x = t[0]+" ";
            for (String y1 : y) {
                if (!Line.contains(y1)) {
                    x = x + y1 + " ";
                    cnt++;
                }
            }
            bw.write(x+" "+cnt+"\n");
            System.out.println(t[0]+" "+cnt);
        }
    }
    
}
