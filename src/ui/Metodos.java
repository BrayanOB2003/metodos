import java.util.Scanner;

public class Metodos{

	public static void pedirNumeros(int[] datos){
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < datos.length; i++){
			System.out.print("Por favor digita el " + (i + 1) + " numero: ");
			datos[i] = in.nextInt();
		}

	}
	
	public static void imprimir(int[] datos){
		System.out.println("");
		System.out.print("Los elementos impresos desde atras son: ");
		for(int i = datos.length - 1; i >= 0 ; i--){
			System.out.print(datos[i] + ", ");
		}
		System.out.println("");
	}
	
	public static void promedio(int[] datos){
		System.out.println("");
		float promedio = 0;
		
		for(int i = 0; i < datos.length; i++){
			promedio += datos[i];
		}
		
		promedio /= datos.length;
		
		System.out.println("Promedio de todos los elementos es: " + promedio);
	}
	
	public static void promedioImpar(int[] datos){
		System.out.println("");
		float promedio = 0;
		int denominador = 0;
		for(int i = 0; i < datos.length; i++){
			if(datos[i]%2 != 0){
				promedio += datos[i];
				denominador++;
			}
		}
		promedio /= denominador;
		System.out.println("Promedio de los numero impares es: " + promedio);
	}

	public static void sumaPrimeros(int[] datos){
		System.out.println("");
		int suma = 0;
		
		for(int i = 0; i < 3; i++){
			if(datos[i] > 7){
				suma += datos[i];
			}
		}
		
		System.out.println("Las suma de los primeros numeros mayores a 7 es: " + suma);
	}

	public static void sumaUltimos(int[] datos){
		System.out.println("");
		int suma = 0;
		
		for(int i = datos.length - 1; i >= 7 ; i--){
			
			if(datos[i] < 10){
				suma += datos[i];
			}
			
		}
		System.out.println("La suma de los ultimos numeros menores a 10 es: " + suma);
		System.out.println("");
	}
	
	public static void elementoDivisible(int[] datos){
		
		System.out.print("Elementos divisibles por 5: ");
		for(int i = 0; i < datos.length; i++){
			if(datos[i]%5 == 0){
				System.out.print(datos[i] + ", ");
			}
		}
		System.out.println("");
	}
	
	public static void moda(int[] datos){
		int puntos[] = new int[10];
		int mayor = 0, indice = 0;
		
		for(int i = 0; i<datos.length; i++){
			for(int j = 0; j < datos.length; j++){
				if(datos[i] == datos[j]){
					puntos[i]++;
				}
			}
		}
		
		for(int i = 0; i<datos.length; i++){
			if(puntos[i] > mayor){
				mayor = puntos[i];
				indice = i;
			}
		}	
		System.out.println("");
		System.out.println("La moda es: " + datos[indice]);
		System.out.println("");
	}
	
	public static void arreglos(int[] par, int[] impar, int[] datos){
		
		for(int i = 0; i < par.length; i++){
			for(int j = 0;j < datos.length; j++){
				if(j%2 == 0){
					par[i] = datos[j];
				} else{
					impar[i] = datos[j];
				}
			}
		}
	}
	
	public static void imprimirArreglos(int[] par, int[] impar){
		
		System.out.print("Arreglo de pares: ");
		for(int i = 0; i < par.length; i++){
			System.out.print(par[i] + ", ");
		}
		System.out.println("");
		System.out.println("");
		System.out.print("Arreglo de impares: ");
		for(int i = 0; i < impar.length; i++){
			System.out.print(impar[i] + ", ");
		}
		
	}
	
	public static void main(String[] args){
		
		int[] datos = new int[10];
		int[] par = new int[5];
		int[] impar = new int[5];
		pedirNumeros(datos);
		imprimir(datos);
		promedio(datos);
		promedioImpar(datos);
		sumaPrimeros(datos);
		sumaUltimos(datos);
		elementoDivisible(datos);
		moda(datos);
		arreglos(par,impar,datos);
		imprimirArreglos(par, impar);
	}
}
