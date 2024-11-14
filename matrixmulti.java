import java.io.*;
import java.util.*;
public class matrixmulti{
	public static void main(String args[]){
		int m,n,i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		m = sc.nextInt();
		System.out.println("Enter the number of columns : ");
		n = sc.nextInt();
		int[][] a = new int[m][n];
		System.out.println("Enter the Elements of 1st Matrix : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print("["+i+"]["+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] b = new int[m][n];
		System.out.println("Enter the Elements of 2nd Matrix : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print("["+i+"]["+j+"] = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("1st Martix : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
		System.out.println();
		}
		
		System.out.println("2nd Martix : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(b[i][j]+"\t");
			}
		System.out.println();
		}
		
		int[][] c = new int[m][n];
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				c[i][j] = 0;
				for(k=0;k<n;k++){
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Multiplied Martix : ");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.print(c[i][j]+"\t");
			}
		System.out.println();
		}
		
	}
}	
