import java.lang.*;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		
		int i,j,n,m;
		m = ler.nextInt();
		n = ler.nextInt();
		int v[][] = new int [m][n];
		for (i=0;i<m;i++) {
			for (j=0;j<n;j++) {
				
				v [i] [j] = (int) (Math.random()*100);
				System.out.print(" ["+v [i] [j]+"] ");
				if(j==n-1) {
					System.out.print("\n");
				}
				
			}
		}
		for (m=0;m<3;m++) {
			for (n=0;n<3;n++) {
			}
		}
		
	}

}
