import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Snehal
 */
public class gettf{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        String line1,line2;
	//ArrayList<String> tfs = new ArrayList<String>();
        FileReader fr1 = new FileReader("agosfasta.txt");
        BufferedReader br1 = new BufferedReader(fr1);
        
        FileReader fr2;
        BufferedReader br2;
        
        FileWriter fw = new FileWriter("Agostf.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String tf = "";
        while((line1=br1.readLine())!=null)
        {
            //System.out.println(line1); 
            String[] t = line1.split(" ");
            String k = t[0]; 
 	    
            for(int i=0;i<2;i++)
            {
                String x= t[i+1];
                //System.out.println(x);
                tf="";
                fr2 = new FileReader("orf.txt");
                br2 = new BufferedReader(fr2);
                while((line2=br2.readLine())!=null)
                {
                    //System.out.println(line2);
                    if(line2.contains(x))
                    {
                        String[] g = line2.split(" ");
                        //System.out.println(g[0]+" "+x);
                        tf = tf+g[0]+" ";
                    }
                } 	
		
            	    
                 System.out.println(k+" "+x+" "+tf+" ");
                 bw.write(k+" "+x+" "+tf+"\n");
            	 
                
            }
	 
            //System.out.println("HELLO");
        }
        bw.close();
    }
    
}
