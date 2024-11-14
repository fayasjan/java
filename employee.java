import java.io.*;
import java.util.*;
public class employee{
	String name;
	int age;
	int phone;
	String addr;
	int sal;
	String sp;
	String dep;
	
	public void printSalary(){
		System.out.println("Salary : "+sal);
	}
	
	static class Officer extends employee{
		Officer(String name,int age, int phone,String addr,int sal,String sp){
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("Phone No. : "+phone);
			System.out.println("Address : "+addr);
			System.out.println("Salary : "+sal);
			System.out.println("Specialization : "+sp);
		}
	}
		
	static class Manager extends employee{
		Manager(String name,int age, int phone,String addr,int sal,String dep){
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("Phone No. : "+phone);
			System.out.println("Address : "+addr);
			System.out.println("Salary : "+sal);
			System.out.println("Department : "+dep);
		}
	}
	
	public static void main(String args[]){
		String name;
		int age;
		int phone;
		String addr;
		int sal;
		String sp;
		String dep;
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Role you want to Enter\n1. Officer\n2. Manager");
		int o = sc.nextInt();
		sc.nextLine();
		switch(o){
			case 1:
				System.out.print("\nEnter the Name of the Employee : ");
				name = sc.nextLine();
				System.out.print("\nEnter the Address of the Employee : ");
				addr = sc.nextLine();
				System.out.print("\nEnter the Specialization of the Employee : ");
				sp = sc.nextLine();
				System.out.print("\nEnter the Age of the Employee : ");
				age = sc.nextInt();
				System.out.print("\nEnter the Phone Number of the Employee : ");
				phone = sc.nextInt();		
				System.out.print("\nEnter the Salary of the Employee : ");
				sal = sc.nextInt();		
				System.out.println();		
				Officer o1 = new Officer(name,age,phone,addr,sal,sp);
				break;
				
			case 2:
				System.out.print("\nEnter the Name of the Employee : ");
				name = sc.nextLine();
				System.out.print("\nEnter the Address of the Employee : ");
				addr = sc.nextLine();
				System.out.print("\nEnter the Department of the Employee : ");
				dep = sc.nextLine();
				System.out.print("\nEnter the Age of the Employee : ");
				age = sc.nextInt();
				System.out.print("\nEnter the Phone Number of the Employee : ");
				phone = sc.nextInt();		
				System.out.print("\nEnter the Salary of the Employee : ");
				sal = sc.nextInt();	
				System.out.println();			
				Manager m1 = new Manager(name,age,phone,addr,sal,dep);
				break;
				
			default:
				System.out.print("Enter Valid Option ");
			
			
		}
	}
		
}
