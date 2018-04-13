import java.io.*;
import java.util.*;
class reqopformat
{
	public static void main(String args[]) throws Exception
	{
		String line1="",line2="",a="",y1="",y2="";
		Boolean flag=false;
		FileReader fr1=new FileReader("Agos.txt");
		BufferedReader br1=new BufferedReader(fr1);

		FileWriter fw=new FileWriter("Formattedagos1.csv");
		BufferedWriter bw=new BufferedWriter(fw);
		
		while((line1=br1.readLine())!=null)
		{
			String b[]=line1.split(" ");
			a=b[0];
			y1=b[1];
			y2=b[2];
			//bw.write(a+","+y1+","+y2+",");	
			//System.out.print(a+","+y1+","+y2+",");
			FileReader fr2=new FileReader("Agosbound.csv");
			BufferedReader br2=new BufferedReader(fr2);
			while((line2=br2.readLine())!=null)
			{
				String s[]=line2.split(",");
			//	String temp=s[0]+","+s[1]+",";
				//System.out.println(line2.replace(temp,""));			
				if(line2.contains(y1))
				{
					bw.write(a+","+y1+","+y2+","+line2+",");
					flag=true;
				}
				if(line2.contains(y2))
				{
					bw.write(a+","+y1+","+y2+","+line2+",");
					flag=true;
				}
			}
			if(flag==true)			
				bw.write("\n");
		flag=false;
		}
		bw.close();
	}
}

