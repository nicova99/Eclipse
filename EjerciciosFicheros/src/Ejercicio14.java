import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio14 {
	static Scanner SC = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
	
	int filas = SC.nextInt();
	int columnas = SC.nextInt();
	
	FileOutputStream fos = null; 
	DataOutputStream salida = null; 
	Float n;
	 fos = new FileOutputStream("D:\\\\nico\\\\ADT ACCESO A DATOS\\\\Workspace\\\\\\\\EjerciciosFicheros\\\\\\texto.txt"); 
	 salida = new DataOutputStream(fos); 
	
	Double[][] matriz = new Double[filas][columnas];
	salida.writeInt(filas);
	salida.writeChar(' ');
	salida.writeInt(columnas);
	salida.writeChar('\n');
	
	for(int i = 0;i<filas;i++){
		salida.writeChar('\n');
		for(int j = 0;j<columnas;j++){
			System.out.println("Introduce numero para poicion "+i+" "+j);
			matriz[i][j] = SC.nextDouble();
			salida.writeDouble(matriz[i][j]);
			salida.writeChar(' ');
	}
		
	}
	salida.flush();
	salida.close();
}
	
}
