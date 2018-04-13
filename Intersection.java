/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersection;
import java.io.*;
import java.util.*;
/**
 *
 * @author Snehal
 */
public class Intersection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
                List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		String line1="", line2="", line3="", line4="";
		
			FileReader fr1 = new FileReader("J:\\Agos\\Start all over\\Tfs\\agostf.txt");
			BufferedReader br1 = new BufferedReader(fr1);
                        while((line1=br1.readLine())!=null)
				list1.add(line1);

			fr1 = new FileReader("J:\\Agos\\Start all over\\Tfs\\sklutf.txt");
			br1 = new BufferedReader(fr1);
                        
                         while((line1=br1.readLine())!=null)
				list2.add(line1);
                        
                        fr1 = new FileReader("J:\\Agos\\Start all over\\Tfs\\kwaltf.txt");
			br1 = new BufferedReader(fr1);
                        
                         while((line1=br1.readLine())!=null)
				list3.add(line1);
                         
                        fr1 = new FileReader("J:\\Agos\\Start all over\\Tfs\\klactf.txt");
			br1 = new BufferedReader(fr1);
                        
                         while((line1=br1.readLine())!=null)
				list4.add(line1);
                        
                       FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\Combotf.txt");
                       BufferedWriter bw1 = new BufferedWriter(fw); 
                        
                        
			list1.retainAll(list2) ;
			list3.retainAll(list4) ;
			list1.retainAll(list3) ;
			Iterator<String> itr = list1.iterator();
			while (itr.hasNext()) 
			{
				String t = itr.next();
				System.out.println(t);
				bw1.write(t+"\n");
			}

			bw1.close();
		

    }
    
}
