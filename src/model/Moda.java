import java.util.Scanner;

public class Moda{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Cantidad de numeros que quiere digitar: ");
		int size = in.nextInt();
		
		if(size > 0){
			float[] notas = new float[size];
			int[] moda = new int[size];
			int indice = 0;
			System.out.println("DIGITE LOS NUMEROS");
			for(int i = 0; i < notas.length; i++){
				System.out.print("Numero: ");
				notas[i] = in.nextFloat();
			}
			
			for(int i = 0;i < notas.length; i++){
				
				if(notas[indice] == notas[i]){
					moda[indice]++;
					System.out.println(moda[indice]);
				}
				
				if((i == (notas.length - 1)) && (moda[indice] < moda.length)){
					i = 0;
					indice ++; 
				}
			}
		}
	}
}