import java.io.*;
import java.util.*;
public class spalindrome{
public static void main(String args[]){
	String str="",rev="";
	char ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a string");
	str = sc.nextLine();
	int len=str.length();
	for(int i=0;i<len;i++){
		ch=str.charAt(i);
		rev=ch+rev;
	}
	
	System.out.println("Reverse of "+str+" is "+rev);
	if(str.equals(rev)){
		System.out.println("Hence "+str+" is a Palindrome");
	}
	else{
		System.out.println("Hence "+str+" is not a Palindrome");
	}
	
}
}
