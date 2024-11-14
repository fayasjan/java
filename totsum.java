import java.io.*;
import java.util.*;
public class totsum{
	public static void main(String args[]){
	System.out.println("Enter the line of Integers");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	StringTokenizer st = new StringTokenizer(s);
	int num,sum=0;
	System.out.print("Digits : ");
	while(st.hasMoreTokens()){
		num = Integer.parseInt(st.nextToken());
		System.out.print(num+" ");
		sum+=num;
	}
	System.out.println();
	System.out.println("Sum : "+sum);
}
}
