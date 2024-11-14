import java.io.*;
public class exe{
public static void main(String args[]) throws IOException{
	try{
		FileInputStream Fi =new FileInputStream("C:\\Users\\Ajuvad\\Desktop\\input.txt");
		FileOutputStream Fo =new FileOutputStream("C:\\Users\\Ajuvad\\Desktop\\output.txt");
		int i=0;
		while((i=Fi.read()) != -1){
			Fo.write(i);
		}
	}
	catch(IOException e){
		System.out.println("Exception "+e);
	}
}
}
