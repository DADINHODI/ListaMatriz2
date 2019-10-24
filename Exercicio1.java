import java.util.Random;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler =new Scanner (System.in);
		int i,j,a=0,b=0,c=0,d=0,n,h,k;
		n = ler.nextInt();
		int v[][] = new int [n][n];
		int s[] = new int [n];
		Random x=new Random();
		for (i=0;i<n;i++) {
			for (j=0;j<n;j++) {
				
				v [i] [j] = x.nextInt()%10;
				System.out.print(" ["+v [i][j]+"] ");
				if(j==n-1) {
					System.out.print("\n");
				}
				if(v [i][j]<0) {
					d++;
				}
			
			}
		}
		System.out.println("\n");
		System.out.println("numeros da diagonal: ");
		for(int agrvai=0;agrvai<n;agrvai++) {
			System.out.print(+v[agrvai][agrvai]+" ");
		}
		System.out.println("\n");
		System.out.println("numeros negativos = "+d);
	}

}


