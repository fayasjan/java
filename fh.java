import java.io.*;
import java.util.*;
class fh{
	public static void main(String[]args)throws IOException {
		String s="";
		Scanner sc=new Scanner(System.in);
		try
		{
			FileReader fr=new FileReader("/home/student/neeth/text.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("content in the files:-");
			while((s= br.readLine())!=null){
				System.out.println(s);
			}
			System.out.println();
		fr.close();
		}
		catch(Exception e){
			System.out.println("no such files");
			System.out.println();
		}
		FileWriter fw=new FileWriter("/home/student/neeth/text.txt");	
		System.out.println("enter a line of text");
		do{
			s=sc.nextLine();
			if(!s.equals("stop")){
				fw.write(s);
				fw.write("\n");
			}
		}while(!s.equals("stop"));
		System.out.println();
		fw.close();
		try
		{
			FileReader fr=new FileReader("/home/student/neeth/text.txt");
			BufferedReader br=new BufferedReader(fr);
			System.out.println("content in the files:-");
			while((s= br.readLine())!=null){
				System.out.println(s);
			}
			System.out.println();
		fr.close();
		}
		catch(Exception e){
			System.out.println("no such files");
		}
	}
}
