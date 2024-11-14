import java.io.*;
import java.util.*;
public class palindrome{
public static void main(String args[]){
	int n,d,rev=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	n = sc.nextInt();
	int temp = n;
	while(n>0){
		d=n%10;
		rev=(rev*10)+d;
		n=n/10;
	}
	System.out.println("Reverse of "+temp+" is "+rev);
	if(rev==temp){
		System.out.println("Hence "+temp+" is a Palindrome");
	}
	else{
		System.out.println("Hence "+temp+" is not a Palindrome");
	}
	
}
}
