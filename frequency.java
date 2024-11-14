import java.io.*;
import java.util.*;
public class frequency{
public static void main(String args[]){
	String str="",x="";
	int count=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	str = sc.nextLine();
	System.out.println("enter the character");
	x = sc.nextLine();
	int len=str.length();
	char[] ch = new char[len];
	char a = x.charAt(0);
		for(int i=0;i<len;i++){
			ch[i]=str.charAt(i);
			if(ch[i]==a){
			count++;
			}
	}
	System.out.println("Number of "+x+" in \""+str+"\" is "+count);
}
}
