/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.*;

/**
 *
 * @author Snehal
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
       
               tempro();
               two();
		String line1="",line2="";
		int cnt=0;
		//////////////result1 s y1 y2
			FileReader fr1=new FileReader("J:\\Agos\\Start all over\\result1.txt");
			BufferedReader br1=new BufferedReader(fr1);
			
                        FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\klaccommon.txt");
			BufferedWriter bw=new BufferedWriter(fw);

			while((line1=br1.readLine())!=null)
			{
                            String[] a = line1.split(" ");
                            String s = a[0];
                            cnt=0;
                            
                            FileReader fr2=new FileReader("J:\\Agos\\Start all over\\temp1.txt");
                            BufferedReader br2=new BufferedReader(fr2);
                            while((line2=br2.readLine())!=null)
                            {
                                if(line2.contains(s))
                                   cnt++;
                            }
                            if(cnt==2)
                                 bw.write(line1+"\n");
                        }
		    bw.close();		
                    }
    public static void tempro() throws FileNotFoundException, IOException
    {
        String fn="J:\\Agos\\Start all over\\Klac-Scer-orthologs.txt";
		String line="";
                //int c=0;
		
			FileReader fr=new FileReader(fn);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\result1.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while((line=br.readLine())!=null)
			{
				String[] a = line.split(" ");
				//System.out.println(a.length);
                                if(a.length==3)
				{  
					 //System.out.println(line);
					bw.write(line+"\n");
                                        //c++;
				}
			}
                        //System.out.println(c);
			bw.close();
			

    }
    public static void two() throws FileNotFoundException, IOException
    {
        String fn="J:\\Agos\\Start all over\\Scer-Klac-orthologs.txt";
		String line="";
               // int c=0;
		
			FileReader fr=new FileReader(fn);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw = new FileWriter("J:\\Agos\\Start all over\\temp1.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			while((line=br.readLine())!=null)
			{
				String[] a = line.split(" ");
				//System.out.println(a.length);
                                if(a.length==2)
				{  
					 //System.out.println(line);
					bw.write(line+"\n");
                                        //c++;
				}
			}
                        //System.out.println(c);
			bw.close();
			

    }
		}