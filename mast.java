import java.io.*;
import java.util.*;
class mast
{
	public static void main(String args[])
	{
		String line1="";
 		String s = null;
		int ck=0;
		try
		{
			FileReader fr1=new FileReader("klactf.txt");
			BufferedReader br1=new BufferedReader(fr1);

			FileWriter fw=new FileWriter("mast_out/klacmast.txt");
			BufferedWriter bw=new BufferedWriter(fw);
		
			while((line1=br1.readLine())!=null)
			{
				String ytf[]=line1.split(" "); 
				String seq1=ytf[0]+".fasta";
				
				for(int i=2;i<ytf.length;i++)
				{
					String mot=ytf[i];
					tempfile(ytf[i]);
					/////mast called here
					
					Process p = Runtime.getRuntime().exec("mast temp.txt "+seq1);
            
            				BufferedReader stdInput = new BufferedReader(new
					InputStreamReader(p.getInputStream()));
			 
				   	BufferedReader stdError = new BufferedReader(new
					InputStreamReader(p.getErrorStream()));
					while ((s = stdInput.readLine()) != null) 
					{
                					System.out.println(s);
                                        }
					
					String m =copyfile(ytf[0],ytf[i]);
					System.out.println(ytf[0]+" "+ytf[1]+" "+m);
					bw.write(ytf[0]+" "+ytf[1]+" "+m+"\n");
					//System.out.println(ytf[0]+" "+m);
					//bw.write(ytf[0]+" "+m+"\n");
				}
			}
			bw.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void tempfile(String tf)
	{
		String line2="";
		int counter=1;	
		boolean x=false;	
		try
		{
			FileReader fr2=new FileReader("motifs.txt");
			BufferedReader br2=new BufferedReader(fr2);
			
			FileWriter fw=new FileWriter("temp.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			while((line2=br2.readLine())!=null)
			{
				if(counter<=9)
					bw.write(line2+"\n");
				counter++;
				if(line2.contains(tf))
					x=true;
				if(!line2.equals("#") && x==true)
				{
					bw.write(line2+"\n");
				}
				
				if(line2.equals("#"))
					x=false;
			}
		bw.close();
		}
		catch(Exception e)
		{
			System.out.println("error in temp");
		}
	}
	public static String copyfile(String y, String tf)
	{
		int cnt=0,i=0;
		String x ="";
		String ret = tf+" ";
		try
		{
			FileReader fr2=new FileReader("mast_out/mast.txt");
			BufferedReader br2=new BufferedReader(fr2);
			
			while((x=br2.readLine())!=null)
			{
				if(x.contains("Klla"))
				{   
				cnt++;
				//System.out.println("in count");    
				}
				if(cnt==3)
				{
				if(i<5)
					{ 
						ret = ret+x+" ";
						i++;
						
					}
		
				}
			}

		}
		catch(Exception e)
		{
			System.out.println("error in copy");
		}
		return ret;
        }
}

			
		
