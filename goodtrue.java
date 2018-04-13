import java.io.*;
import java.util.*;
class goodtrue
{
	public static void main(String args[]) throws Exception
	{
		String line="";
		FileReader fr1=new FileReader("agosmastop.csv");
		BufferedReader br1=new BufferedReader(fr1);

		FileWriter fw=new FileWriter("Agosbound.csv");
		BufferedWriter bw=new BufferedWriter(fw);
	
		while((line=br1.readLine())!=null)
		{
			if(line.contains("GOOD") && line.contains("TRUE"))
			 bw.write(line+"\n");
		}
		bw.close();
	}
}
