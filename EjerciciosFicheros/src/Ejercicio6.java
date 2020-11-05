import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter salida = null;
		try {
			salida = new PrintWriter("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\\\EjerciciosFicheros\\\\texto.txt"); // se crea el fichero
			String cadena;
			System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
			cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			while (!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena); // se escribe la cadena en el fichero
				cadena = sc.nextLine(); // se introduce por teclado una cadena de texto
			}
			salida.flush();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			salida.close();
		}
	}
}