import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		long[][]matriz=new long[4][4];
		
		int numero=1;
		
	for(int fila=0;fila<4;fila++) {

		for(int columnas=0;columnas<4;columnas++) {
			
			matriz [fila][columnas]=numero;
			
			numero++;
			
		}	
		
	}
	
	for(int fila=0;fila<4;fila++) {
		
		for(int columnas=0;columnas<4;columnas++) {
	
			System.out.print(matriz[fila][columnas]+"\t");
			
		}
		
		System.out.println();
		
	}
		
		
	}
	
	
	
	
}
